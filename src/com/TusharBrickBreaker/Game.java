package com.TusharBrickBreaker;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 800, HEIGHT = 640;
    private Thread thread;
    private boolean running = false;
    private Handler handler;
    private Player player;
    private Projectile projectile;
    private keyInput keyInput_;
    private mouseInput mouseInput_;


    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        handler = new Handler();
        keyInput_ = new keyInput(handler);
        player = new Player();
        projectile = new Projectile(handler);
        this.addKeyListener(keyInput_);
        this.addMouseListener(mouseInput_);
        new Window(WIDTH, HEIGHT, "games!", this);
        handler.addObject(player);
        handler.addObject(projectile);
        //handler.addObject(new Brick(50,50));
        brickFormation1 Bricks = new brickFormation1(handler);
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta>=1){
                tick();
                delta--;
            }
            if(running){
                render();
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                //System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();

    }

    private void tick(){
        handler.tick();
    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();


        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH,HEIGHT);
        handler.render(g);
        g.dispose();
        bs.show();
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    public synchronized void stop() {
        try{
            thread.join();
            running = false;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

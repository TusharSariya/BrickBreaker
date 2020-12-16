package com.TusharBrickBreaker;

import java.awt.*;

public class Brick extends GameObject{
    private int health = 50;
    private int width = 50;
    private int height = 30;
    public Brick(int X,int Y) {
        super(X, Y, ID.Brick);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics G) {
        if(health > 40)
            G.setColor(Color.white);
        if(health >20 && health <= 40)
            G.setColor(Color.yellow);
        if(health >=0 && health <= 20)
            G.setColor(Color.red);
        G.fillRect(X,Y,width,height);
    }

    public void hit()
    {
        health = health - 10;
        System.out.println(health);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

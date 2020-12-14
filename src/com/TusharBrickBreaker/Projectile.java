package com.TusharBrickBreaker;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;

public class Projectile extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;

    Projectile(){
        super(WIDTH/2,HEIGHT/2,ID.Projectile);
        Random r = new Random();
        double angle = r.nextInt(90)+225;
        angle = toRadians(angle);
        System.out.println("angle:"+angle);
        System.out.println("xdir:"+cos(angle));
        System.out.println("ydir:"+sin(angle));
        int xdir = (int) (cos(angle)*5);
        int ydir = (int) (sin(angle)*5);
        setVelX(xdir);
        setVelY(ydir);
    }
    @Override
    public void tick() {
        X = X - getVelX();
        Y = Y - getVelY();
    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.white);
        G.fillRect(X,Y,3,3);
    }
}

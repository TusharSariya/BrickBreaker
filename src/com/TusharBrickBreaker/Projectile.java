package com.TusharBrickBreaker;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;

public class Projectile extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;

    Projectile(){
        super(WIDTH/2,HEIGHT/2,ID.Projectile);
        Random r = new Random();
        int temp = r.nextInt(180);
        System.out.println(temp);
        int xdir = (int) (cos(temp)*5);
        int ydir = (int) (sin(temp)*5);
        System.out.println(xdir);
        System.out.println(ydir);
        setVelX((int) (cos(temp)*5));
        setVelY((int) (sin(temp)*5));
    }
    @Override
    public void tick() {
        X = X - getVelX();
        Y = Y - getVelY();
    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.white);
        G.fillRect(X,Y,2,2);
    }
}

package com.TusharBrickBreaker;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;

public class Projectile extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;
    int projectileSpeed = 3;
    Projectile(){
        super(WIDTH/2,HEIGHT/2,ID.Projectile);
        Random r = new Random();
        double projectileAngle = r.nextInt(90)+225;
        projectileAngle = toRadians(projectileAngle);
        int xdir = (int) (cos(projectileAngle)*projectileSpeed);
        int ydir = (int) (sin(projectileAngle)*projectileSpeed);
        setVelX(xdir);
        setVelY(ydir);
    }
    @Override
    public void tick() {
        if(X<0 || X>780) reverseX();
        if(Y<0 || Y>600) reverseY();
        System.out.println("X:"+X);
        System.out.println("Y:"+Y);
        X = X - velX;
        Y = Y - velY;
    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.white);
        G.fillRect(X,Y,3,3);
    }

    public void reverseX() {
        velX = -velX;
    }
    public void reverseY() {
        velY = -velY;
    }
}

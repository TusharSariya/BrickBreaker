package com.TusharBrickBreaker;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;

public class Projectile extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;
    int projectileSpeed = 3;
    Player player;

    Projectile(Player player_){
        super(WIDTH/2,HEIGHT/2,ID.Projectile);
        player = player_;
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
        if(X < player.X+15 && X > player.X-15)
            if(Y > player.Y - 3 && Y < player.Y + 3)
                if(velY<0)
                    reverseY();//eventually make it so that it changes angel too

        if(X<0 || X>780) reverseX();
        if(Y<0 || Y>600) reverseY();
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

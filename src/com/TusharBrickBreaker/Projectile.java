package com.TusharBrickBreaker;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.*;

public class Projectile extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;
    int projectileSpeed = 3;
    //Player player;
    Handler objectHandler;
    GameObject object;

    Projectile(Handler handler){
        super(WIDTH/2,HEIGHT/2,ID.Projectile);
        objectHandler = handler;
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
        for(int i = 0; i < objectHandler.object.size(); i++)
        {
            object = objectHandler.object.get(i);
            if(object.id == ID.Player)
            {
                if(X < object.X+15 && X > object.X-15)
                    if(Y > object.Y - 3 && Y < object.Y + 3)
                        if(velY<0)
                            reverseY();//eventually make it so that it changes angel too
            }
            if (object.id == ID.Brick)
            {
                //overlapping x axis
                if (X > object.X && X < object.X + 50)
                    //see if it hits the bottom or top
                    if ( Y >object.Y && Y < object.Y + 30)
                        reverseY();
            }
        }

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

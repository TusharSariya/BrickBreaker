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
        velX = xdir;
        velY = ydir;
    }
    @Override
    public void tick() {
        for(int i = 0; i < objectHandler.object.size(); i++)
        {
            object = objectHandler.object.get(i);
            if(object.id == ID.Player)
            {
                Player player = (Player)object;
                if(X < player.X+15 && X > player.X-15)
                    if(Y > player.Y - 3 && Y < player.Y + 3)
                        if(velY<0) {
                            //System.out.println("velX:" + velX + " velY:" + velY);
                            reverseY();//eventually make it so that it changes angel too
                            velocityX((X-player.X)/3);
                        }

            }
            if (object.id == ID.Brick)
            {
                Brick brick = (Brick)object;
                //overlapping x axis
                if (X > brick.X && X < brick.X + 50)
                    //see if it hits the bottom or top
                    if ( Y >brick.Y && Y < brick.Y + 30) {
                        reverseY();
                        brick.hit();
                    }
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

    public void velocityX(int velocity) {
        if(velocity < 0)
            velX = max(velocity,-5);
        if(velocity > 0)
            velX = min(velocity,5);
    }
}

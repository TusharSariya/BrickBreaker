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
        G.setColor(Color.white);
        G.fillRect(X,Y,width,height);
    }
}

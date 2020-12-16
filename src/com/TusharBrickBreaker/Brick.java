package com.TusharBrickBreaker;

import java.awt.*;

public class Brick extends GameObject{
    private int health = 50;
    public Brick(int X,int Y) {
        super(X, Y, ID.Brick);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.white);
        G.fillRect(X,Y,50,30);
    }
}

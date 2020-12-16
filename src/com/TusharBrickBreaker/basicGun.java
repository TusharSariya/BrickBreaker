package com.TusharBrickBreaker;

import java.awt.*;

public class basicGun extends GameObject{

    public basicGun(int X, int Y) {
        super(X, Y, ID.basicGun);
        velX = -3;
        velY = 0;
    }

    @Override
    public void tick() {
        X = X + velX;

    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.white);
        G.fillRect(X,Y,3,3);
    }
}

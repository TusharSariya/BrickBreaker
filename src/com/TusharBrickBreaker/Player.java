package com.TusharBrickBreaker;

import java.awt.*;

public class Player extends GameObject{

    private static final int WIDTH = 800, HEIGHT = 640;

    Player(){
        super(WIDTH/2 - 5,HEIGHT -100,ID.Player);
    }
    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(X,Y,30,3);
    }
}

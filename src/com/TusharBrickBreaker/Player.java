package com.TusharBrickBreaker;

import java.awt.*;

public class Player extends GameObject{

    Player(int X, int Y){
        super(X,Y,ID.Player);
    }
    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(X,Y,10,2);
    }
}

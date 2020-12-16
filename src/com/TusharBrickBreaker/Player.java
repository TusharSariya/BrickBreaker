package com.TusharBrickBreaker;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Player extends GameObject{

    Player(){
        super(Game.WIDTH/2 - 5,Game.HEIGHT -100,ID.Player);
    }

    @Override
    public void tick() {
        X = mouseInput.getMouseXPos();
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(X-15,Y,15,3);
        g.fillRect(X,Y,15,3);
    }
}

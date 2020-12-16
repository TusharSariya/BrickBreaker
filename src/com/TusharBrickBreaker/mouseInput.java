package com.TusharBrickBreaker;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mouseInput extends MouseAdapter {

    private Handler handler;

    public mouseInput(Handler handler){
        this.handler = handler;
    }

    static public int getMouseXPos(){
        return MouseInfo.getPointerInfo().getLocation().x;
    }

    static public int getMouseYPos(){
        return MouseInfo.getPointerInfo().getLocation().y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //handler.addObject();
    }
}

package com.TusharBrickBreaker;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseInput extends MouseAdapter implements MouseListener {

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
        System.out.println(e.getXOnScreen());
        System.out.println(e.getYOnScreen());
        handler.addObject(new basicGun(e.getXOnScreen()-15,Game.WIDTH-100));
        handler.addObject(new basicGun(e.getXOnScreen()+15,Game.WIDTH-100));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

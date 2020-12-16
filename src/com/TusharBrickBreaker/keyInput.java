package com.TusharBrickBreaker;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyInput extends KeyAdapter {

    private Handler handler;

    public keyInput(Handler handler){
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for(int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Player){
                //if(key == KeyEvent.VK_A) tempObject.setX(tempObject.getX()-10);
                //if(key == KeyEvent.VK_D) tempObject.setX(tempObject.getX()+10);
            }
        }
        if(key == KeyEvent.VK_SPACE) {
            //handler.addObject(new basicGun(e.getXOnScreen() - 15, Game.WIDTH - 100));
            //handler.addObject(new basicGun(e.getXOnScreen() + 15, Game.WIDTH - 100));
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
    }
}

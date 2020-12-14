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
        //System.out.println(key);

        for(int i = 0; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Player){
                //if(key == KeyEvent.VK_W) tempObject.setY(tempObject.getY()-1);
                //if(key == KeyEvent.VK_S) tempObject.setY(tempObject.getY()+1);
                if(key == KeyEvent.VK_A) tempObject.setX(tempObject.getX()-10);
                if(key == KeyEvent.VK_D) tempObject.setX(tempObject.getX()+10);
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
    }
}

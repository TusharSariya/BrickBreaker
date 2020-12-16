package com.TusharBrickBreaker;

import java.awt.*;
import java.util.LinkedList;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    private Point projectilePos;
    private Point playerPos;

    public void tick(){
        for(int i = 0; i < object.size(); i++){
            GameObject temp = object.get(i);
            temp.tick();
            if(temp.id == ID.Brick)
            {
                Brick brick = (Brick)temp;
                if(brick.getHealth() <= 0)
                    removeObject(brick);
            }
        }
    }

    public void render(Graphics g){
        for(int i = 0; i < object.size(); i++){
            GameObject temp = object.get(i);
            temp.render(g);
        }
    }

    public void addObject(GameObject object){
        this.object.add(object);
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }
}

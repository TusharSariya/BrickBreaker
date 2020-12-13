package com.TusharBrickBreaker;

import java.awt.*;

public abstract class GameObject {

    protected int X, Y;
    protected int velX, velY;
    protected ID id;

    public GameObject(int X, int Y, ID id){
        this.X = X;
        this.Y = Y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics G);

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}

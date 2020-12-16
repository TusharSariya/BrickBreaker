package com.TusharBrickBreaker;

public class brickFormation1 {
    private Handler handler;
    brickFormation1(Handler handler){
        for(int i = 1; i < 14; i++)
        {
            for (int j = 1; j < 3; j++)
            {
                handler.addObject(new Brick(52*i,32*j));
            }
        }
    }
}

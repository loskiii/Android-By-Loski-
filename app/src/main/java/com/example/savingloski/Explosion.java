package com.example.savingloski;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[4];
    Integer explosionFrame = 0;

    public Explosion(Context context){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.blast1);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.blast2);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.blast3);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.blast4);
    }

    public Bitmap[] getExplosion(Integer explosionFrame) {
        return explosion;
    }
}

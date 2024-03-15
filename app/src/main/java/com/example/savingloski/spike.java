package com.example.savingloski;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class spike {
    Bitmap spike[] = new Bitmap[3];
    Integer spikeFrame = 0;
    Integer spike1, spike2, spike3;
    Random random;

    public spike(Context context){
        spike[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.spikeball1);
        spike[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.spikeball2);
        spike[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.spikeball3);
        random = new Random();
        resetPosition();
    }

    public Bitmap getSpike(Integer spikeFrame){
        return spike[spikeFrame];
    }
    public Integer getSpikeWidth(){
        return spike[0].getWidth();
    }
    public Integer getSpikeHeight(){
        return spike[0].getHeight();
    }
    public void resetPosition(){
        spike1 = random.nextInt(GameView.dWidth - getSpikeWidth());
        spike2 = -200 + random.nextInt(600) * -1;
        spike3 = 35 + random.nextInt(16);
    }
}

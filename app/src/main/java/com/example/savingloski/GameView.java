package com.example.savingloski;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Handler;

public class GameView extends View {


    Bitmap background, ground, character;
    Rect rectBackground, rectGround;
    Context context;
    Handler handler;
    final long UPDATE_MILLIS = 30;
    Runnable runnable;
    Paint textPaint = new Paint();
    Paint healthPaint = new Paint();
    float TEXT_SIZE = 120;
    int points = 0;
    int life = 3;
    static Integer dWidth, dHeight;
    Random random;
    float characterX, characterY;
    float oldX;
    ArrayList<spike> spikes;
    ArrayList<Explosion> explosions;


    public GameView(Context context) {
        super(context);
        this.context = context;
        background = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        ground = BitmapFactory.decodeResource(getResources(), R.drawable.highground);
        character = BitmapFactory.decodeResource(getResources(), R.drawable.character);
    }
}

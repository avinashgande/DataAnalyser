package com.aksetapps.dataanalyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class SplashScreen extends AppCompatActivity {
       private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_splash_screen);
        new android.os.Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent= new Intent(SplashScreen.this,MainActivity1.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

package com.example.whatsagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            setContentView(R.layout.activity_splash_screen); //он должен загрузить скрин

    SystemClock.sleep(300);

        startActivity(new Intent(SplashScreen.this, SplashScreen.class));
        finish();
    }
}
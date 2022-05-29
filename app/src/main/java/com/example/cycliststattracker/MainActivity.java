package com.example.cycliststattracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.background).setBackgroundResource(R.drawable.gradient_background);

        findViewById(R.id.button).setBackgroundResource(R.drawable.gradient_background);
        findViewById(R.id.button2).setBackgroundResource(R.drawable.gradient_background);

    }
}
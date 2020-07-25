package com.rohankadkol.rolladiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDefaultClicked(View view) {
        // TODO (8): Add an intent to take you to the DiceActivity
        // TODO (9): Add an extra to that intent to show "default" dice
    }

    public void onTrendyClicked(View view) {
        // TODO (10): Add an intent to take you to the DiceActivity
        // TODO (11): Add an extra to that intent to show "trendy" dice
    }
}

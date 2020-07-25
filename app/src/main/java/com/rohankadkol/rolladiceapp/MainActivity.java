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
        Intent intent = new Intent(this, DiceActivity.class);
        intent.putExtra("dice_type", "default");
        startActivity(intent);
    }

    public void onTrendyClicked(View view) {
        Intent intent = new Intent(this, DiceActivity.class);
        intent.putExtra("dice_type", "trendy");
        startActivity(intent);
    }
}

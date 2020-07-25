package com.rohankadkol.rolladiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {
    private Random mRandom = new Random();
    private String diceType;

    private ImageView mIvDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        mIvDice = findViewById(R.id.iv_dice);

        diceType = getIntent().getStringExtra("dice_type");

        showRandomDice();
    }

    public void onRollClicked(View view) {
        showRandomDice();
    }

    private void showRandomDice() {
        int diceNumber = mRandom.nextInt(6) + 1;
        String imageUrl = "https://android-weekly-series-backend.herokuapp.com/" + diceType + "/" + diceNumber;
        Picasso.get().load(imageUrl).into(mIvDice);
        Log.d("DEBUG", "showRandomDice: " + imageUrl);
    }
}

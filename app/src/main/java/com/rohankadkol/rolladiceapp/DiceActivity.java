package com.rohankadkol.rolladiceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
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

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle(diceType.substring(0, 1).toUpperCase() + diceType.substring(1));
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

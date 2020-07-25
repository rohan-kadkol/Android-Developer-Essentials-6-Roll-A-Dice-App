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

        //TODO (20): Use findViewById() to assign mIvDice to the ImageView in activity_dice.xml
        mIvDice = findViewById(0);

        //TODO (21): Assign diceType with the value from the intent extra
        diceType = "";

        showRandomDice();

        // TODO (25): Add a back button and set the title of the ActionBar to the diceType in sentence case
    }

    public void onRollClicked(View view) {
        showRandomDice();
    }

    private void showRandomDice() {
        int diceNumber = mRandom.nextInt(6) + 1;
        String imageUrl = "https://android-weekly-series-backend.herokuapp.com/" + diceType + "/" + diceNumber;
        //TODO (23): Use Picasso to load the image from imageUrl into the mIvDice ImageView
        Log.d("DEBUG", "showRandomDice: " + imageUrl);
    }

    // TODO (26): Override onOptionsItemsSelected() to go back when the back button is clicked
}

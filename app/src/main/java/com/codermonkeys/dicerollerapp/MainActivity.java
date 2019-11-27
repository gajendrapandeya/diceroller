package com.codermonkeys.dicerollerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewOne, imageViewTwo;
    private Button button;
    private Random myRandomNumber =  new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewOne = (ImageView) findViewById(R.id.diceOne);
        imageViewTwo = (ImageView) findViewById(R.id.diceTwo);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });


    }

    private void rollDice() {

        int randomNumber = myRandomNumber.nextInt(6) + 1;

        switch (randomNumber) {

            case 1:
                imageViewOne.setImageResource(R.drawable.dice_1);
                imageViewTwo.setImageResource(R.drawable.dice_2);
                break;

            case 2:
                imageViewOne.setImageResource(R.drawable.dice_2);
                imageViewTwo.setImageResource(R.drawable.dice_1);
                break;

            case 3:
                imageViewOne.setImageResource(R.drawable.dice_3);
                imageViewTwo.setImageResource(R.drawable.dice_6);
                break;

            case 4:
                imageViewOne.setImageResource(R.drawable.dice_4);
                imageViewTwo.setImageResource(R.drawable.dice_5);
                break;

            case 5:
                imageViewOne.setImageResource(R.drawable.dice_5);
                imageViewTwo.setImageResource(R.drawable.dice_4);
                break;


            case 6:
                imageViewOne.setImageResource(R.drawable.dice_6);
                imageViewTwo.setImageResource(R.drawable.dice_3);
                break;



        }
    }


}

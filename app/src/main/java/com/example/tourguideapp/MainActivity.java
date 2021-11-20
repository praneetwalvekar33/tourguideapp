package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout restaurant=(LinearLayout) findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent variable used to call the Restaurant activity
                Intent restaurantIntent = new Intent(MainActivity.this,RestaurantActivity.class);

                //  Starting the activity usings startActivity Method.
                startActivity(restaurantIntent);
            }
        });

        LinearLayout importantPlace=(LinearLayout) findViewById(R.id.important_place);
        importantPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent variable used to call the Restaurant activity
                Intent importantPlaceIntent = new Intent(MainActivity.this,ImportantPlaceActivity.class);

                //  Starting the activity usings startActivity Method.
                startActivity(importantPlaceIntent);
            }
        });
    }
}
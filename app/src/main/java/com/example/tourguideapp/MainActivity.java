package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Creating a ViewPager object
        ViewPager2 viewPager =(ViewPager2) findViewById(R.id.viewpager);

        //  Adapter object to show which fragment to use at each position
        SimpleViewPagerAdapter adapter = new SimpleViewPagerAdapter(getSupportFragmentManager(), getLifecycle());

        //  Setting the adapter for ViewPager2 object
        viewPager.setAdapter(adapter);

        /*LinearLayout restaurant=(LinearLayout) findViewById(R.id.restaurant);
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
        });*/
    }
}
package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Creating a fragment and inserting it in to the activity category xml file
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment()).commit();


        
    }
}
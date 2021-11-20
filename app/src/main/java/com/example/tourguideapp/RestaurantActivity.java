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
        setContentView(R.layout.place_list);

        // ArrayList for storing the value of restaurant
        ArrayList<PlaceList> place = new ArrayList<>();

        //  Adding the restaurant present in the area to ArrayList
        place.add(new PlaceList("Royal China",18.938673642627776, 72.83281149353988));
        place.add(new PlaceList("Shaan Chinese",18.938020880716266, 72.83465754901874));
        place.add(new PlaceList("Panchum Puriwala",18.9385169072997, 72.8353126254065));
        place.add(new PlaceList("Cafe Excelsior",18.938940555963807, 72.83386063445435));
        place.add(new PlaceList("Frahaang Restaurant",18.93801404563707, 72.8391112668129));
        place.add(new PlaceList("Bagdadi Restaurant",18.92441323268704, 72.83451447489449));
        place.add(new PlaceList("Shivale Veg Restaurant",18.937313676656437, 72.83393933447597));
        place.add(new PlaceList("Gulshan-E-Iran",18.947839019237787, 72.83636468498834));

        //  Adapter object whose data is in list form and knows how to create a view for each item
        //  in the list
        ListAdapter restaurantAdapter = new ListAdapter(this, place);

        //  Creating a ListView object to set a adapter for it
        ListView listView = (ListView) findViewById(R.id.place_list_view);
        listView.setAdapter(restaurantAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri geoLocation = Uri.parse("geo:"+ place.get(position).getLongitudeOfPlace() + "," + place.get(position).getLatitudeOfPlace());
                Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);
                System.out.println(1);
                intent.setPackage("com.google.android.apps.maps");
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                    System.out.println(1);
                }
            }
        });
        
    }
}
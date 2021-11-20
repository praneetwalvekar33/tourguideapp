package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ImportantPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // ArrayList for storing the value of restaurant
        ArrayList<PlaceList> place = new ArrayList<>();

        //  Adding the restaurant present in the area to ArrayList
        place.add(new PlaceList("Gateway of India", 18.92212162490417, 72.83463276866375));
        place.add(new PlaceList("Chatrapati Shivaji Maharaja Vastu Sangarahalaya", 18.926891338411632, 72.83246629195493));
        place.add(new PlaceList("Crawford Market", 18.946427180621, 72.83462438784292));
        place.add(new PlaceList("Jehangir Art Gallery", 18.927530220631056, 72.8316855974993));
        place.add(new PlaceList("Girgaum Chaupati", 18.952110106122824, 772.81657845622314));
        place.add(new PlaceList("Flora Fountain", 18.932746694373773, 72.83149613982849));
        place.add(new PlaceList("Rajabai Clock Tower", 18.92994956164973, 72.83393933447597));
        place.add(new PlaceList("Gulshan-E-Iran", 18.947839019237787, 72.83000789565124));

        //  Adapter object whose data is in list form and knows how to create a view for each item
        //  in the list
        ListAdapter importantPlaceAdapter = new ListAdapter(this, place);

        //  Creating a ListView object to set a adapter for it
        ListView listView = (ListView) findViewById(R.id.place_list_view);
        listView.setAdapter(importantPlaceAdapter);

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

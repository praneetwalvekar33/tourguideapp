package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<PlaceList> {

    public ListAdapter(Activity context, ArrayList<PlaceList> placeListArrayList){
        //  Initialize the internal storage for ArrayAdapter for the context and List
        //  The second argument is used while populating the a single textview
        //  But as we are using a custom adapter we are not going to use 2nd argument
        //  so it can be any value.
        super(context, 0, placeListArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        //  Check if the view is being reused, otherwise infalte the view
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        //  Get the object of PlaceList present at this position in the ArrayList placeListArrayList
        PlaceList currentPlaceList = getItem(position);

        //  Finding the TextView in the place_list.xml file
        TextView placeName = (TextView) listItemView.findViewById(R.id.text_value);

        //  Set the text value for the TextView from the currentPlaceList object
        placeName.setText(currentPlaceList.getNameOfLocation());

        //  Return the ListView filled with the text of Name Of Place
        return listItemView;
    }


}

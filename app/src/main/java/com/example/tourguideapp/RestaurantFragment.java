package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance(String param1, String param2) {
        RestaurantFragment fragment = new RestaurantFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Inflate the layout for this fragment
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
        ListAdapter restaurantAdapter = new ListAdapter(getActivity(), place);

        //  Creating a ListView object to set a adapter for it
        ListView listView = (ListView) rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(restaurantAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri geoLocation = Uri.parse("geo:"+ place.get(position).getLongitudeOfPlace() + "," + place.get(position).getLatitudeOfPlace());
                Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);
                System.out.println(1);
                intent.setPackage("com.google.android.apps.maps");
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                    System.out.println(1);
                }
            }
        });
        return rootView;
    }
}
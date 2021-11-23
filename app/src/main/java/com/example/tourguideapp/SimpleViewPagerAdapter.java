package com.example.tourguideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SimpleViewPagerAdapter extends FragmentStateAdapter {
    public SimpleViewPagerAdapter(FragmentManager fm, Lifecycle lc){
        super(fm, lc);
    }

    //  To find the fragment at each position
    @Override
    public Fragment createFragment(int position){
        if(position == 0){
            return new RestaurantFragment();
        }
        else{
            return new ImportantPlacesFragment();
        }
    }

    // Overriding the getItemCount to obtain the number of items in the adapter
    @Override
    public int getItemCount(){
        return 2;
    }
}

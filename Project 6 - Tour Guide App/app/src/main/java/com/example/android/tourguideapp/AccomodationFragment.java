package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Attractions
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.fra_mare_spa), getString(R.string.fra_mare_spa_address), R.drawable.framare));
        attractions.add(new Attraction(getString(R.string.sunset_dream), getString(R.string.sunset_dream_address), R.drawable.sunset));
        attractions.add(new Attraction(getString(R.string.baltic_hotel), getString(R.string.baltic_hotel_address), R.drawable.promenaadi_hotell));
        attractions.add(new Attraction(getString(R.string.marienholm), getString(R.string.marienholm_address), R.drawable.villa_marienholm));
        attractions.add(new Attraction(getString(R.string.hotel_day_villa), getString(R.string.hotel_day_vill_address), R.drawable.hotell_p2va_villa));
        attractions.add(new Attraction(getString(R.string.reta_house), getString(R.string.reta_house_address), R.drawable.reta_majutus));
        attractions.add(new Attraction(getString(R.string.supeluse), getString(R.string.supeluse_address), R.drawable.supeluse_guesthouse));

        // Create an AttractionAdapter, whose data source is a list of Attractions. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above, so that the
        // ListView will display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Attractions
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.margot), getString(R.string.margot_address), R.drawable.margot));
        attractions.add(new Attraction(getString(R.string.fra_mare_restaurant), getString(R.string.fra_mare_address), R.drawable.bergfeldt));
        attractions.add(new Attraction(getString(R.string.dietrich), getString(R.string.dietrich_address), R.drawable.dietrich));
        attractions.add(new Attraction(getString(R.string.fast_rabbitt), getString(R.string.fast_rabbit_address), R.drawable.k__lik));
        attractions.add(new Attraction(getString(R.string.bakery), getString(R.string.bakery_address), R.drawable.m__ri__re));
        attractions.add(new Attraction(getString(R.string.grande), getString(R.string.grande_address), R.drawable.pizza_grande));
        attractions.add(new Attraction(getString(R.string.taksi_pub), getString(R.string.taksi_pub_address), R.drawable.taksi_pubi));
        attractions.add(new Attraction(getString(R.string.talumehe), getString(R.string.talumehe_address), R.drawable.talumehe));

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

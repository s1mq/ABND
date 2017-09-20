package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.tourguideapp.R.string.maria_magdaleena_church_desc;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Attractions
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.episcopal_castle),
                getString(R.string.episcopal_castle_desc), R.drawable.episcopal_castle, getString(R.string.episcopal_castle_maps)));
        attractions.add(new Attraction(getString(R.string.tchaikovsky_bench),
                getString(R.string.tchaikovsky_bench_desc), R.drawable.t_aikovski_bench, getString(R.string.tchaikovsky_maps)));
        attractions.add(new Attraction(getString(R.string.maria_magdaleena_church),
                getString(maria_magdaleena_church_desc), R.drawable.magdaleena_church, getString(R.string.magdaleena_maps)));
        attractions.add(new Attraction(getString(R.string.railway_station),
                getString(R.string.railway_station_desc), R.drawable.railway_station, getString(R.string.railway_maps)));
        attractions.add(new Attraction(getString(R.string.ungru_manor),
                getString(R.string.ungru_manor_desc), R.drawable.ungru_manor, getString(R.string.ungru_maps)));
        attractions.add(new Attraction(getString(R.string.sun_dial),
                getString(R.string.sun_dial_desc), R.drawable.sun_dial, getString(R.string.sun_dial_maps)));
        attractions.add(new Attraction(getString(R.string.epp_maria),
                getString(R.string.epp_maria_desc), R.drawable.epp_maria_gallery, getString(R.string.epp_maria_maps)));
        attractions.add(new Attraction(getString(R.string.old_town),
                getString(R.string.old_town_desc), R.drawable.old_town, getString(R.string.old_town_maps)));
        attractions.add(new Attraction(getString(R.string.bird_tower),
                getString(R.string.bird_tower_desc), R.drawable.bird_tower, getString(R.string.bird_maps)));
        attractions.add(new Attraction(getString(R.string.beach_promenade),
                getString(R.string.beach_promenade_desc), R.drawable.promenade, getString(R.string.promenade_maps)));

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

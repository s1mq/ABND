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
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Attractions
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.museum_night), getString(R.string.museum_date)));
        attractions.add(new Attraction(getString(R.string.kuursaal_opening), getString(R.string.kuursaal_date)));
        attractions.add(new Attraction(getString(R.string.graphic_design), getString(R.string.graphic_date)));
        attractions.add(new Attraction(getString(R.string.fairy_tale_conference), getString(R.string.fairy_tale_date)));
        attractions.add(new Attraction(getString(R.string.italy_wine), getString(R.string.wine_date)));
        attractions.add(new Attraction(getString(R.string.al_bano), getString(R.string.al_bano_date)));
        attractions.add(new Attraction(getString(R.string.flag_day), getString(R.string.flag_day_date)));
        attractions.add(new Attraction(getString(R.string.kreeg_days), getString(R.string.kreeg_days_date)));
        attractions.add(new Attraction(getString(R.string.vaiko_elite), getString(R.string.vaiko_elite_date)));
        attractions.add(new Attraction(getString(R.string.midsummer_festival), getString(R.string.midsummer_date)));
        attractions.add(new Attraction(getString(R.string.tchaikovsky_haapsalu), getString(R.string.tchaikovsky_haapsalu_date)));
        attractions.add(new Attraction(getString(R.string.vanamuusika), getString(R.string.old_music_date)));
        attractions.add(new Attraction(getString(R.string.summer_play), getString(R.string.summer_play_date)));
        attractions.add(new Attraction(getString(R.string.regatta), getString(R.string.regatta_date)));
        attractions.add(new Attraction(getString(R.string.beauty_car_show), getString(R.string.beauty_car_show_date)));
        attractions.add(new Attraction(getString(R.string.yoga_festival), getString(R.string.yoga_festival_date)));
        attractions.add(new Attraction(getString(R.string.rock_haapsalu), getString(R.string.rock_haapsalu_date)));
        attractions.add(new Attraction(getString(R.string.august_blues), getString(R.string.august_blues_date)));
        attractions.add(new Attraction(getString(R.string.white_lady), getString(R.string.white_lady_date)));
        attractions.add(new Attraction(getString(R.string.accordion_festival), getString(R.string.accordion_festival_date)));
        attractions.add(new Attraction(getString(R.string.lade_day), getString(R.string.lace_day_date)));
        attractions.add(new Attraction(getString(R.string.taste_promenade), getString(R.string.taste_promenade_date)));
        attractions.add(new Attraction(getString(R.string.belinda), getString(R.string.belinda_date)));
        attractions.add(new Attraction(getString(R.string.nostalgia), getString(R.string.nostalgia_date)));

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

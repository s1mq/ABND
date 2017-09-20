package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * AttractionAdapter is an ArrayAdapter that can provide the layout for each list item based on
 * a data source, which is a list of Attraction objects.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    Context mContext;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param attractions A List of Word objects to display in a list
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, attractions);
        mContext = context;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        // Get the Attraction object located at this position in the list
        final Attraction currentAttraction = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID attraction_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the Attraction name from the current Attraction and
        // set this text on the Attraction name TextView
        nameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID attraction_info
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_info);
        // Get the Attraction info from the current Attraction and
        // set this text on the Attraction info TextView
        addressTextView.setText(currentAttraction.getAttractionInfo());

        // Find the TextView in the list_item.xml layout with the ID attraction_info
        TextView mapsTextView = (TextView) listItemView.findViewById(R.id.attraction_address);

        // Check if a location is provided
        if (currentAttraction.hasLocation()) {
            // If a location is provided, display the location text
            mapsTextView.setText(currentAttraction.getMapsAddress());
            // Make sure the View is visible
            mapsTextView.setVisibility(View.VISIBLE);
            // Set an onClickListener for the View to open Maps with provided location
            mapsTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + currentAttraction.getMapsAddress()));
                    if (isAppInstalled("com.google.android.apps.maps")) {
                        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                    }
                    mContext.startActivity(intent);
                }
            });
        } else {
            // Otherwise hide the Location TextView
            mapsTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        // Check if an image is provided for this word or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAttraction.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    // helper function to check if Maps is installed
    private boolean isAppInstalled(String uri) {
        PackageManager pm = mContext.getPackageManager();
        boolean app_installed = false;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        return app_installed;
    }
}

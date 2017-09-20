package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * CustomPagerAdapter is a FragmentPagerAdapter that can provide the layout for each list item based
 * on a data source which is a list of Attraction objects.
 */

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CustomFragmentPagerAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CustomFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new EventFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new AccomodationFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_events);
        } else if (position == 2) {
            return mContext.getString(R.string.category_food);
        } else {
            return mContext.getString(R.string.category_accommodation);
        }
    }
}

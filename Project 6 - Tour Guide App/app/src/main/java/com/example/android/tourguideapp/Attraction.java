package com.example.android.tourguideapp;

/**
 * Attraction represents a sight, a place or an event in my hometown Haapsalu
 * It contains its name, info and an image if applicable.
 */

public class Attraction {

    /**
     * Attraction name
     */
    private String mAttractionName;

    /**
     * Attraction address
     */
    private String mMapsAddress;

    /**
     * Attraction info
     */
    private String mAttractionInfo;

    /**
     * Attraction image resource ID
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object
     *
     * @param attractionName is the name of the Attraction
     * @param attractionInfo is the extra information for the Attraction
     */
    public Attraction(String attractionName, String attractionInfo) {
        mAttractionName = attractionName;
        mAttractionInfo = attractionInfo;
    }


    /**
     * Create a new Attraction object
     *
     * @param attractionName  is the name of the Attraction
     * @param attractionInfo  is the extra information for the Attraction
     * @param imageResourceId is the resource ID for the image file associated with this Attraction.
     */
    public Attraction(String attractionName, String attractionInfo, int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionInfo = attractionInfo;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Attraction object
     *
     * @param attractionName  is the name of the Attraction
     * @param attractionInfo  is the extra information for the Attraction
     * @param imageResourceId is the resource ID for the image file associated with this Attraction
     * @param mapsAddress     is the location information for the Attraction
     */

    public Attraction(String attractionName, String attractionInfo, int imageResourceId, String mapsAddress) {
        mAttractionName = attractionName;
        mAttractionInfo = attractionInfo;
        mImageResourceId = imageResourceId;
        mMapsAddress = mapsAddress;
    }

    /**
     * Get the Attraction name
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the Attraction info
     */
    public String getAttractionInfo() {
        return mAttractionInfo;
    }

    /**
     * Get the Attraction address
     */
    public String getMapsAddress() {
        return mMapsAddress;
    }

    /**
     * Get the image resource ID of the attraction
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns whether or not there is an address for this word.
     */
    public boolean hasLocation() {
        if (getMapsAddress() == null) {
            return false;
        }
        return true;
    }
}

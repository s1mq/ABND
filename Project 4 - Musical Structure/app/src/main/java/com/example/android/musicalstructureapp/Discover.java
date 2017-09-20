package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.media.Image;
import android.media.ImageWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Discover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        // Find the views that show the categories
        ImageView albumCoverOne = (ImageView) findViewById(R.id.album_cover_1);
        ImageView albumCoverTwo = (ImageView) findViewById(R.id.album_cover_2);
        ImageView albumCoverThree = (ImageView) findViewById(R.id.album_cover_3);
        ImageView albumCoverFour = (ImageView) findViewById(R.id.album_cover_4);
        ImageView albumCoverFive = (ImageView) findViewById(R.id.album_cover_5);
        ImageView albumCoverSix = (ImageView) findViewById(R.id.album_cover_6);
        ImageView albumCoverSeven = (ImageView) findViewById(R.id.album_cover_7);
        ImageView albumCoverEight = (ImageView) findViewById(R.id.album_cover_8);
        ImageView albumCoverNine = (ImageView) findViewById(R.id.album_cover_9);
        ImageView albumCoverTen = (ImageView) findViewById(R.id.album_cover_10);
        ImageView albumCoverEleven = (ImageView) findViewById(R.id.album_cover_11);
        ImageView albumCoverTwelve = (ImageView) findViewById(R.id.album_cover_12);
        ImageView albumCoverThirteen = (ImageView) findViewById(R.id.album_cover_13);
        ImageView albumCoverFourteen = (ImageView) findViewById(R.id.album_cover_14);
        ImageView albumCoverFifteen = (ImageView) findViewById(R.id.album_cover_15);

        // Set a click listener that opens the now playing activity
        View.OnClickListener nowPlayingClass = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(Discover.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        };

        // Assign that click listener to the playlist views
        albumCoverOne.setOnClickListener(nowPlayingClass);
        albumCoverTwo.setOnClickListener(nowPlayingClass);
        albumCoverThree.setOnClickListener(nowPlayingClass);
        albumCoverFour.setOnClickListener(nowPlayingClass);
        albumCoverFive.setOnClickListener(nowPlayingClass);
        albumCoverSix.setOnClickListener(nowPlayingClass);
        albumCoverSeven.setOnClickListener(nowPlayingClass);
        albumCoverEight.setOnClickListener(nowPlayingClass);
        albumCoverNine.setOnClickListener(nowPlayingClass);
        albumCoverEight.setOnClickListener(nowPlayingClass);
        albumCoverNine.setOnClickListener(nowPlayingClass);
        albumCoverTen.setOnClickListener(nowPlayingClass);
        albumCoverEleven.setOnClickListener(nowPlayingClass);
        albumCoverTwelve.setOnClickListener(nowPlayingClass);
        albumCoverThirteen.setOnClickListener(nowPlayingClass);
        albumCoverFourteen.setOnClickListener(nowPlayingClass);
        albumCoverFifteen.setOnClickListener(nowPlayingClass);
    }
}

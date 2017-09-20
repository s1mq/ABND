package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the views that show the categories
        Button playlistOne = (Button) findViewById(R.id.playlist_one);
        Button playlistTwo = (Button) findViewById(R.id.playlist_two);
        Button playlistThree = (Button) findViewById(R.id.playlist_three);
        Button playlistFour = (Button) findViewById(R.id.playlist_four);

        // Set a click listener that opens the now playing activity
        View.OnClickListener nowPlayingClass = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Playlists.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        };

        // Assign that click listener to the playlist views
        playlistOne.setOnClickListener(nowPlayingClass);
        playlistTwo.setOnClickListener(nowPlayingClass);
        playlistThree.setOnClickListener(nowPlayingClass);
        playlistFour.setOnClickListener(nowPlayingClass);


    }
}

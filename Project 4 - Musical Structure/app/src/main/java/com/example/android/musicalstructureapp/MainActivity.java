package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views that show the categories
        Button playlistButton = (Button) findViewById(R.id.playlists);
        Button playButton = (Button) findViewById(R.id.play);
        Button discoverButton = (Button) findViewById(R.id.discover);

        // Set click listeners to those categories
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(MainActivity.this, Discover.class);
                startActivity(discoverIntent);
            }
        });
    }
}

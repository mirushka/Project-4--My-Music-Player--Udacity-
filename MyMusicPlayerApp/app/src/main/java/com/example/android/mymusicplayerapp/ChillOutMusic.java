package com.example.android.mymusicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ChillOutMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chill_out_music);

        // Find the View that shows the Chill Out Music category
        LinearLayout chillOutMusic = (LinearLayout) findViewById(R.id.song);

        // Set a click listener on that View
        chillOutMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(ChillOutMusic.this, "Song 1", Toast.LENGTH_LONG).show();
                Intent playerIntent = new Intent(ChillOutMusic.this, NowPlaying.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}

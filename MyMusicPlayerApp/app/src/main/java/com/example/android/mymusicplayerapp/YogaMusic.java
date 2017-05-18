package com.example.android.mymusicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class YogaMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_music);

        // Find the View that shows the yoga Music category
        LinearLayout yogaMusic = (LinearLayout) findViewById(R.id.song);

        // Set a click listener on that View
        yogaMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(YogaMusic.this, "Song 1", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link NumbersActivity}

                Intent playerIntent = new Intent(YogaMusic.this, NowPlaying.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}

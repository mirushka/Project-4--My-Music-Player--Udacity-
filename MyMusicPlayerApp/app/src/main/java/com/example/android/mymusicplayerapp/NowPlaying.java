package com.example.android.mymusicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the button
        Button yogaMusic = (Button) findViewById(R.id.returnToMenu);

        // Set a click listener on that View
        yogaMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the button is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(NowPlaying.this, R.string.return_to_menu, Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link MainActivity}

                Intent playerIntent = new Intent(NowPlaying.this, MainActivity.class);

                // Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}



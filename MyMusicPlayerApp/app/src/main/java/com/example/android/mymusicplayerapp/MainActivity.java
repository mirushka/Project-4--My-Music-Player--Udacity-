package com.example.android.mymusicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the freeletics Music category
        Button freeleticsMusic = (Button) findViewById(R.id.freeletics);

        // Set a click listener on that View
        freeleticsMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Freeletics", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link NumbersActivity}

                Intent freeleticsIntent = new Intent(MainActivity.this, FreeleticsMusic.class);

                // Start the new activity
                startActivity(freeleticsIntent);
            }
        });

        // Find the View that shows the Yoga Music category
        Button yogaMusic = (Button) findViewById(R.id.yoga);

        // Set a click listener on that View
        yogaMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Yoga", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link NumbersActivity}
                Intent yogaIntent = new Intent(MainActivity.this, YogaMusic.class);

                // Start the new activity
                startActivity(yogaIntent);
            }
        });

        // Find the View that shows the Yoga Music category
        Button chillOutMusic = (Button) findViewById(R.id.ChillOut);

        // Set a click listener on that View
        chillOutMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Chill Out Music", Toast.LENGTH_LONG).show();
                // Create a new intent to open the {@link NumbersActivity}
                Intent chillOutIntent = new Intent(MainActivity.this, ChillOutMusic.class);

                // Start the new activity
                startActivity(chillOutIntent);
            }
        });
    }
}
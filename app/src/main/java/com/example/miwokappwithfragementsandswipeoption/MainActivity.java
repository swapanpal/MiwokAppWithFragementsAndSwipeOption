package com.example.miwokappwithfragementsandswipeoption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows number
        TextView number = findViewById(R.id.numbers);
        // set a click listener on that view
        number.setOnClickListener(new View.OnClickListener() {
            // this method is called when the number view is clicked on
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
        });
        // Find the view that shows family
        TextView family = findViewById(R.id.family);
        // set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            // this method is called when the family view is clicked on
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        // Find the view that shows colors
        TextView colors = findViewById(R.id.colors);
        // set a click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            // this method is called when the colors view is clicked on
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        // Find the view that shows phrases
        TextView phrases = findViewById(R.id.phrases);
        // set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            // this method is called when the phrases view is clicked on
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}

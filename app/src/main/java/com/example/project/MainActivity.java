package com.example.project;

import static com.example.project.R.id.nonvegcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView vegcard,nonvegcard,snackscard;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vegcard = findViewById(R.id.vegcard);
        nonvegcard= findViewById(R.id.nonvegcard);
        snackscard= findViewById(R.id.snacks);
        vegcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         Intent intent = new Intent(MainActivity.this, vegfood.class);
         startActivity(intent);
            }
        });
        nonvegcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nonvegfood.class);
                startActivity(intent);
            }
        });
        snackscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,snacks.class);
        startActivity(intent);
            }
        });

    }
}
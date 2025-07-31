package com.example.javaclasses;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewRecieved = findViewById(R.id.tvRecieved);
        String nemeRecieved = getIntent().getStringExtra("user_name");

        textViewRecieved.setText("Welcome " + nemeRecieved + "!");
    }
}
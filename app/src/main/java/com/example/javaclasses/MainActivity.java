package com.example.javaclasses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextName = findViewById(R.id.etName);
        Button buttonGreet = findViewById(R.id.buttonGreet);
        TextView textViewGreets = findViewById(R.id.tvGreets);

        buttonGreet.setOnClickListener(v -> {

            String name = editTextName.getText().toString().trim();

            if (!name.isEmpty()) {
                textViewGreets.setText("Hello" + name + "!");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("user_name", name);
                startActivity(intent);

            } else {
                textViewGreets.setText("Please enter your name");

                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            }


        });

    }
}
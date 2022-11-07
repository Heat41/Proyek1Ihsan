package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LinearActivity3 extends AppCompatActivity {
    String user;
    EditText eKepada;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        user = getIntent().getExtras().getString("user");

        eKepada = findViewById(R.id.kepada);

        eKepada.setText(user);

    }
}
package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LinearActivity3 extends AppCompatActivity {
    String kepada, subyek, pesan;
    EditText eKepada, eSubyek, ePesan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        eKepada = findViewById(R.id.kepadaa);
        eSubyek = findViewById(R.id.subyekk);
        ePesan = findViewById(R.id.pesann);

        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);

    }
}
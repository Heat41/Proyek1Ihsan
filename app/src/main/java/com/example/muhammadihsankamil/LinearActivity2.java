package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user;
    EditText eKepada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        //ambil data dari Intent Frame2Activity
        //pastikan key yang di gunakan sama, apabila tidak sama maka tidak dapat mengambil data
        user = getIntent().getExtras().getString("user");

        //hubungkan dengan EditText dengan id Kepada
        eKepada = findViewById(R.id.kepada);

        //tuliskan user pada EditText kepada
        eKepada.setText(user);
    }
}
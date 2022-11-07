package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user, kepada, subyek, pesan;
    EditText eKepada, eSubyek, ePesan;
    Button bkirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        //ambil data dari Intent Frame2Activity
        //pastikan key yang di gunakan sama, apabila tidak sama maka tidak dapat mengambil data
        user = getIntent().getExtras().getString("user");

        //hubungkan dengan EditText dengan id Kepada
        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan = findViewById(R.id.pesan);
        bkirim = findViewById(R.id.kirim);


        //tuliskan user pada EditText kepada
        eKepada.setText(user);

        bkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kirim();}
        });
    }
    public void kirim(){
        kepada = eKepada.getText().toString();
        subyek = eSubyek.getText().toString();
        pesan = ePesan.getText().toString();
        Intent intent = new Intent(LinearActivity2.this,LinearActivity3.class);
        intent.putExtra("kepada",kepada);
        intent.putExtra("subyek",subyek);
        intent.putExtra("pesan",pesan);
        startActivity(intent);
    }
}
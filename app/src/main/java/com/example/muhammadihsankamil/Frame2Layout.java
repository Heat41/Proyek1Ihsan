package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Frame2Layout extends AppCompatActivity {
    EditText eUserName;
    ImageButton bLogin;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2_layout);

        eUserName = findViewById(R.id.username);
        bLogin = findViewById(R.id.login);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  { login(); }
        });
    }
    public void login(){
        //fungsi login dibuat untuk menampilkan pesan dan berpindah dari satu activity ke
        //activity lainnya
        //simpan input dari pengguna ke variabel user
        user = eUserName.getText().toString();
        //intent digunakan untuk berpindah activity, dalam kasus ini berpindah dari Frame2Activity
        //yaitu activity saat ini ke LinearActivity
        Intent intent = new Intent(Frame2Layout.this,LinearActivity2.class);
        intent.putExtra("user",user);
        Toast.makeText(this, "Selamat Datang "+user,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
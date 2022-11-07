package com.example.muhammadihsankamil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Layout extends AppCompatActivity {
    //deklarasikan variabel dengan tipe data
    //gunakan Alt+Enter untuk mengimport/menambahkan kelas secara otomatis
    ImageView gambarLoading; //digunakan untuk menampung gambar loadig dari activity_frame1
    Animation rotasiAnimasi; //digunakan untuk melakukan animasi rotasi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1_layout);
        //simpan gambar loading dari activity_frame1 ke variable gambarloading
        gambarLoading = findViewById(R.id.loading);

        //simpan fungsi rotasi
        rotasi();

        //membuat handler untuk berpindah secara otomatis dari activity saat ini ke activity tujuan
        /*
        kalian cukup mengetikkan new Handler().postDelayed(new Runnable() maka secara otomatis
        fungsi akan membuat overide dan fungsi turunannya
        */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (Frame1Layout.this,Frame2Layout.class);

                //jalankan fungsi intent
                startActivity(intent);

                //tutup activity ini --> masuk kedalam mode background
                finish();
            }
        },3000);
    }

    private void rotasi(){
        rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
        gambarLoading.startAnimation(rotasiAnimasi);
    }
}
package com.example.hadistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {
    private Button niat, pintu, iman, pilar, gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ID's
        niat = findViewById(R.id.niat);
        pintu = findViewById(R.id.pintu);
        iman = findViewById(R.id.iman);
        pilar = findViewById(R.id.pilar);
        gambar = findViewById(R.id.gambar);

        //intents
        niat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent niat = new Intent(MainScreen.this, HadistNiat.class);
                startActivity(niat);
            }
        });

        pintu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pintu = new Intent(MainScreen.this, HadistPintu.class);
                startActivity(pintu);
            }
        });

        iman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iman = new Intent(MainScreen.this, HadistIman.class);
                startActivity(iman);
            }
        });
        pilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pilar = new Intent(MainScreen.this, HadistPilar.class);
                startActivity(pilar);
            }
        });
        gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gambar = new Intent(MainScreen.this, HadistGambar.class);
                startActivity(gambar);
            }
        });
    }
}

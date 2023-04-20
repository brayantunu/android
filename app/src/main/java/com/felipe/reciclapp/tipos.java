package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class tipos extends AppCompatActivity {
    MediaPlayer sonido_negro , sonido_blanco;
    Button boton_negro;
    Button boton_verde;
    Button boton_blanco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);
        boton_negro = findViewById(R.id.boton_negro);
        boton_verde = findViewById(R.id.boton_verde);
        boton_blanco = findViewById(R.id.boton_blanco);

        sonido_negro = MediaPlayer.create(this, R.raw.rojoaudiopapelera);
        sonido_blanco = MediaPlayer.create(this, R.raw.azulaudiopapelera);
        sonido_blanco.start();
        boton_negro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido_negro.start();
            }
        });
        boton_blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido_blanco.start();
            }
        });

    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}
package com.felipe.reciclapp;

import static com.felipe.reciclapp.R.id.button;
import static com.felipe.reciclapp.R.id.videoView1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button btn_button_1;

    //DECLARO
    VideoView videoView1;

    //REFERENCIO



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView1 = findViewById(R.id.videoView1);

        btn_button_1 = findViewById(R.id.btn_button_1);

        videoView1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.mar);
        videoView1.setMediaController(new MediaController(this));
        videoView1.start();



    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this,MainMenu.class);
        startActivity(siguiente);
    }


}
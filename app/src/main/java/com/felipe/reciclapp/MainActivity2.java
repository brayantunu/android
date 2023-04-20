package com.felipe.reciclapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button toas1 ,toas2 ,toas3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button toas1 = findViewById(R.id.toas1);
        toas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearAlertDialog();
            }
        });

        reference();
    }

    private void reference() {
        toas1 = findViewById(R.id.toas1);
        toas2 = findViewById(R.id.toas2);
        toas3 = findViewById(R.id.toas3);
    }

    public void crearAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Advertencia de seguridad");
        builder.setMessage("esta seguro");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this, "ud acepto algo que no debia", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this, "ud tomo la decision correcta", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}
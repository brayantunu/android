package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
   Spinner spinner;
   String[] valores = new String[]{"Colombia","Chile","Ecuador","Peru","Brasil",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       spinner = (Spinner) findViewById(R.id.spinner);
       ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,valores);
       spinner.setAdapter((adapter));
       spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
               Toast.makeText(getApplicationContext(), "pais"+ (String) spinner.getItemAtPosition(position),  Toast.LENGTH_SHORT).show();
           }
       });
    }


}
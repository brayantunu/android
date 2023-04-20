package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        list=(ListView)findViewById(R.id.listaseleccion);
        cargarlista();
    }

    private void cargarlista() {
        String[] valores = new String[]{"CHILE","PERU","ARGENTINA","COLOMBIA"};

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valores);
        list.setAdapter(adapter);
        list.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity3.this, "PRECIONO CHILE", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity3.this, "PRECIONO CHILE", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity3.this, "PRECIONO CHILE", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity3.this, "PRECIONO CHILE", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }
        });
    }
}
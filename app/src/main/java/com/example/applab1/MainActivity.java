package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("APPSIoT-Lab1 ");

        //Para memoria
        Button btnMemoria= findViewById(R.id.btnmemoria);
        btnMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        //Para memoria
        Button btnTres= findViewById(R.id.btnTres);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,TresActivity.class);
                startActivity(intent);

            }
        });
    }
}
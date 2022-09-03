package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    private String[] valores = {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};
    private String estado = "jugando";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Inicio");

        Button btnEst= findViewById(R.id.btnEstadisticas_memoria);
        btnEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this,EstadisticsMemoriaActivity.class);
                startActivity(intent);
            }
        });

    }

    public void crearNuevo(View view){
        ((Button) findViewById(R.id.btn11m)).setText("-");
        ((Button) findViewById(R.id.btn12m)).setText("-");
        ((Button) findViewById(R.id.btn13m)).setText("-");
        ((Button) findViewById(R.id.btn14m)).setText("-");
        ((Button) findViewById(R.id.btn21m)).setText("-");
        ((Button) findViewById(R.id.btn22m)).setText("-");
        ((Button) findViewById(R.id.btn23m)).setText("-");
        ((Button) findViewById(R.id.btn24m)).setText("-");
        ((Button) findViewById(R.id.btn31m)).setText("-");
        ((Button) findViewById(R.id.btn32m)).setText("-");
        ((Button) findViewById(R.id.btn33m)).setText("-");
        ((Button) findViewById(R.id.btn34m)).setText("-");
        ((Button) findViewById(R.id.btn41m)).setText("-");
        ((Button) findViewById(R.id.btn42m)).setText("-");
        ((Button) findViewById(R.id.btn43m)).setText("-");
        ((Button) findViewById(R.id.btn44m)).setText("-");
        Arrays.fill(valores,"-");
        estado = "jugando";
    }
}
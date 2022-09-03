package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity2 extends AppCompatActivity {

    private String[] letras = {"A","A","B","B","C","C","D","D","E","E","F","F","G","G","H","H"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Inicio");

        String[] listSort = sortLetras(letras);

        ((Button) findViewById(R.id.btn11m)).setText(listSort[0]);
        ((Button) findViewById(R.id.btn12m)).setText(listSort[1]);
        ((Button) findViewById(R.id.btn13m)).setText(listSort[2]);
        ((Button) findViewById(R.id.btn14m)).setText(listSort[3]);
        ((Button) findViewById(R.id.btn21m)).setText(listSort[4]);
        ((Button) findViewById(R.id.btn22m)).setText(listSort[5]);
        ((Button) findViewById(R.id.btn23m)).setText(listSort[6]);
        ((Button) findViewById(R.id.btn24m)).setText(listSort[7]);
        ((Button) findViewById(R.id.btn31m)).setText(listSort[8]);
        ((Button) findViewById(R.id.btn32m)).setText(listSort[9]);
        ((Button) findViewById(R.id.btn33m)).setText(listSort[10]);
        ((Button) findViewById(R.id.btn34m)).setText(listSort[11]);
        ((Button) findViewById(R.id.btn41m)).setText(listSort[12]);
        ((Button) findViewById(R.id.btn42m)).setText(listSort[13]);
        ((Button) findViewById(R.id.btn43m)).setText(listSort[14]);
        ((Button) findViewById(R.id.btn44m)).setText(listSort[15]);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                metodoaEjecutarPasadoUnsegundo();
            }
        }, 1000);


    }

    public String[] sortLetras(String[] list){
        Random rnd = ThreadLocalRandom.current();
        for(int i=0;i<list.length;i++){
            int index = rnd.nextInt(16);
            //Cambio de valores
            String valor = list[index];
            list[index] = list[i];
            list[i] = valor;
            Log.d("letrasSort",list[i]);
        }
        return list;
    }

    public void metodoaEjecutarPasadoUnsegundo(){

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

    }

    public void showBtn(Button btn, String[] listSort){

        if(btn.getId() == R.id.btn11m){
            btn.setText(listSort[0]);
        }
        if(btn.getId() == R.id.btn12m){
            btn.setText(listSort[1]);
        }
        if(btn.getId() == R.id.btn13m){
            btn.setText(listSort[2]);
        }
        if(btn.getId() == R.id.btn14m){
            btn.setText(listSort[3]);
        }
        if(btn.getId() == R.id.btn21m){
            btn.setText(listSort[4]);
        }
        if(btn.getId() == R.id.btn22m){
            btn.setText(listSort[5]);
        }
        if(btn.getId() == R.id.btn23m){
            btn.setText(listSort[6]);
        }
        if(btn.getId() == R.id.btn24m){
            btn.setText(listSort[7]);
        }
        if(btn.getId() == R.id.btn31m){
            btn.setText(listSort[8]);
        }
        if(btn.getId() == R.id.btn32m){
            btn.setText(listSort[9]);
        }
        if(btn.getId() == R.id.btn33m){
            btn.setText(listSort[10]);
        }
        if(btn.getId() == R.id.btn34m){
            btn.setText(listSort[11]);
        }
        if(btn.getId() == R.id.btn41m){
            btn.setText(listSort[12]);
        }
        if(btn.getId() == R.id.btn43m){
            btn.setText(listSort[13]);
        }
        if(btn.getId() == R.id.btn44m){
            btn.setText(listSort[14]);
        }



    }

}
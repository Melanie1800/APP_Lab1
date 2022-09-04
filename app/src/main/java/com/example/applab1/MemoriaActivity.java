package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class MemoriaActivity extends AppCompatActivity {

    private ArrayList<String> letras = new ArrayList<>();
    private ArrayList<String> estadisticas = new ArrayList<>();
    private ArrayList<Button> botonesBloqueados = new ArrayList<>();
    private ArrayList<Button> botonesElegidos = new ArrayList<>();
    private ArrayList<Button> botonesElegidosMoment = new ArrayList<>();
    private String estado = "jugando";
    private Instant inicio;
    private Instant fin;
    private Integer contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);
        setTitle("Inicio");
        inicioJuego();

    }


    public void metodoaEjecutarPasadoDossegundos(){

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

    public void mostrarBtn(Button btn){

        if(btn.getId() == R.id.btn11m ){
            btn.setText(letras.get(0));
        }
        if(btn.getId() == R.id.btn12m){
            btn.setText(letras.get(1));
        }
        if(btn.getId() == R.id.btn13m){
            btn.setText(letras.get(2));
        }
        if(btn.getId() == R.id.btn14m){
            btn.setText(letras.get(3));
        }
        if(btn.getId() == R.id.btn21m){
            btn.setText(letras.get(4));
        }
        if(btn.getId() == R.id.btn22m){
            btn.setText(letras.get(5));
        }
        if(btn.getId() == R.id.btn23m){
            btn.setText(letras.get(6));
        }
        if(btn.getId() == R.id.btn24m){
            btn.setText(letras.get(7));
        }
        if(btn.getId() == R.id.btn31m){
            btn.setText(letras.get(8));
        }
        if(btn.getId() == R.id.btn32m){
            btn.setText(letras.get(9));
        }
        if(btn.getId() == R.id.btn33m){
            btn.setText(letras.get(10));
        }
        if(btn.getId() == R.id.btn34m){
            btn.setText(letras.get(11));
        }
        if(btn.getId() == R.id.btn41m){
            btn.setText(letras.get(12));
        }
        if(btn.getId() == R.id.btn42m){
            btn.setText(letras.get(13));
        }
        if(btn.getId() == R.id.btn43m){
            btn.setText(letras.get(14));
        }
        if(btn.getId() == R.id.btn44m){
            btn.setText(letras.get(15));
        }
    }

    public void clickBtn(View view){
        assert view instanceof Button;
        Button btnClick = (Button) view;
        contador++;
        Log.d("lol", String.valueOf(botonesElegidos.size()));
        Log.d("lol-block", String.valueOf(botonesBloqueados.size()));
        if(!botonesElegidosMoment.contains(btnClick)){
            if(botonesBloqueados.size()!=16 && !botonesBloqueados.contains(btnClick)){
                if(botonesElegidos.size()<2){
                    mostrarBtn(btnClick);
                    botonesElegidos.add(btnClick);
                    if(botonesElegidos.size()==2){
                        botonesElegidosMoment.clear();
                        Button buttonElegido= botonesElegidos.get(0);
                        Button buttonElegido2 = botonesElegidos.get(1);
                        if(!botonesElegidos.get(0).getText().toString().equals(botonesElegidos.get(1).getText().toString())){
                            Log.d("lol","son diferentes");
                            Handler handler1 = new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    buttonElegido.setText("-");
                                    buttonElegido2.setText("-");
                                }
                            }, 500);
                        }else{
                            Log.d("lol","son iguales");
                            mostrarBtn(buttonElegido);
                            mostrarBtn(buttonElegido2);
                            botonesBloqueados.add(buttonElegido);
                            botonesBloqueados.add(buttonElegido2);
                        }
                        botonesElegidos.clear();
                        if(botonesBloqueados.size()==16){
                            estado = "gano";
                            botonesBloqueados.clear();
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                fin = Instant.now();
                            }
                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                                long segundos = fin.getEpochSecond() - inicio.getEpochSecond();
                                estadisticas.add("Terminó en "+ (segundos) + " seg");
                                Log.d("lol","gano");
                            }
                        }
                    }
                    if(botonesElegidos.size()==1){
                        botonesElegidosMoment.add(btnClick);
                    }
                }
            }
        }
    }

    public void inicioJuego(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            inicio = Instant.now();
        }

        letras.add("A");
        letras.add("A");
        letras.add("B");
        letras.add("B");
        letras.add("C");
        letras.add("C");
        letras.add("D");
        letras.add("D");
        letras.add("E");
        letras.add("E");
        letras.add("F");
        letras.add("F");
        letras.add("G");
        letras.add("G");
        letras.add("H");
        letras.add("H");

        Collections.shuffle(letras);

        //Introducir en una función :'v
        ((Button) findViewById(R.id.btn11m)).setText(letras.get(0));
        ((Button) findViewById(R.id.btn12m)).setText(letras.get(1));
        ((Button) findViewById(R.id.btn13m)).setText(letras.get(2));
        ((Button) findViewById(R.id.btn14m)).setText(letras.get(3));
        ((Button) findViewById(R.id.btn21m)).setText(letras.get(4));
        ((Button) findViewById(R.id.btn22m)).setText(letras.get(5));
        ((Button) findViewById(R.id.btn23m)).setText(letras.get(6));
        ((Button) findViewById(R.id.btn24m)).setText(letras.get(7));
        ((Button) findViewById(R.id.btn31m)).setText(letras.get(8));
        ((Button) findViewById(R.id.btn32m)).setText(letras.get(9));
        ((Button) findViewById(R.id.btn33m)).setText(letras.get(10));
        ((Button) findViewById(R.id.btn34m)).setText(letras.get(11));
        ((Button) findViewById(R.id.btn41m)).setText(letras.get(12));
        ((Button) findViewById(R.id.btn42m)).setText(letras.get(13));
        ((Button) findViewById(R.id.btn43m)).setText(letras.get(14));
        ((Button) findViewById(R.id.btn44m)).setText(letras.get(15));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                metodoaEjecutarPasadoDossegundos();
            }
        }, 2000);

    }

    public void nuevoJuego(View view){
        if(botonesBloqueados.size()<16 && contador>0 && estado.equals("jugando")){
            estadisticas.add("Canceló");
            Log.d("lol-cancel","cancelo");
        }
        inicioJuego();
    }

    public void estadisticas(View view){

        Intent intent= new Intent(MemoriaActivity.this,EstadisticsMemoriaActivity.class);
        intent.putExtra("estadisticasMem",estadisticas);
        startActivity(intent);

    }

}
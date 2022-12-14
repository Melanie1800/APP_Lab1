package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class TresActivity extends AppCompatActivity {

    private String[] valores = {"-","-","-","-","-","-","-","-","-"};
    private String estado = "jugando";
    private ArrayList<String> estadisticas = new ArrayList<>();
    private ArrayList<Button> botonesBloqueados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        setTitle("Inicio");

        final int[] count = {1};
        Button btn1 = findViewById(R.id.btn1_tres);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(!botonesBloqueados.contains(btn1)){
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn1);
                        btn1.setText(valor);
                        valores[0]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn2 = findViewById(R.id.btn2_tres);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn2)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn2);
                        btn2.setText(valor);
                        valores[1]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn3 = findViewById(R.id.btn3_tres);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn3)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn3);
                        btn3.setText(valor);
                        valores[2]=valor;
                        verificarWin();
                        count[0]++;
                    }
                    if(botonesBloqueados.contains(btn3)){
                        Log.d("msg","bloqueado");
                    }
                }
            }
        });

        Button btn4 = findViewById(R.id.btn4_tres);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn4)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn4);
                        btn4.setText(valor);
                        valores[3]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn5 = findViewById(R.id.btn5_tres);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn5)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn5);
                        btn5.setText(valor);
                        valores[4]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn6 = findViewById(R.id.btn6_tres);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn6)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn6);
                        btn6.setText(valor);
                        valores[5]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn7 = findViewById(R.id.btn7_tres);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn7)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn7);
                        btn7.setText(valor);
                        valores[6]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn8 = findViewById(R.id.btn8_tres);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn8)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn8);
                        btn8.setText(valor);
                        valores[7]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btn9 = findViewById(R.id.btn9_tres);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!botonesBloqueados.contains(btn9)){
                    String valor;
                    if(estado.equals("jugando")){
                        if(count[0] %2==0){
                            valor="O";
                        }else{
                            valor="X";
                        }
                        botonesBloqueados.add(btn9);
                        btn9.setText(valor);
                        valores[8]=valor;
                        verificarWin();
                        count[0]++;
                    }
                }
            }
        });

        Button btnEst= findViewById(R.id.btnEstadisticas_memoria);
        btnEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TresActivity.this,EstadisticsTresActivity.class);
                intent.putExtra("estadisticas",estadisticas);
                startActivity(intent);
            }
        });

    }


    private boolean verificarWin(){
        String msgX = "Gan?? X";
        String msgO = "Gan?? O";
        if(!valores[2].equals("-") && valores[2].equals(valores[4]) && valores[2].equals(valores[6]) ){
            estado="gano";
            if(valores[2].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[3]) && valores[3].equals(valores[6]) ){
            estado="gano";
            if(valores[0].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[1].equals("-") && valores[1].equals(valores[4]) && valores[1].equals(valores[7]) ){
            estado="gano";
            if(valores[1].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[2].equals("-") && valores[2].equals(valores[5]) && valores[2].equals(valores[8]) ){
            estado="gano";
            if(valores[2].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[4]) && valores[0].equals(valores[8]) ){
            estado="gano";
            if(valores[0].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[1]) && valores[0].equals(valores[2]) ){
            estado="gano";
            if(valores[0].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[3].equals("-") && valores[3].equals(valores[4]) && valores[3].equals(valores[5]) ){
            estado="gano";
            if(valores[3].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!valores[6].equals("-") && valores[6].equals(valores[7]) && valores[6].equals(valores[8]) ){
            estado="gano";
            if(valores[6].equals("X")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgX);
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
                estadisticas.add(msgO);
            }
            return true;
        }
        if(!Arrays.asList(valores).contains("-")){
            estado="empate";
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
            estadisticas.add("Empate");
        }
        return false;
    }

    public void crearNuevo(View view){
        botonesBloqueados = new ArrayList<>();
        if(Arrays.asList(valores).contains("-") && !estado.equals("gano")){
            estadisticas.add("Cancel??");
        }
        ((Button) findViewById(R.id.btn1_tres)).setText("-");
        ((Button) findViewById(R.id.btn2_tres)).setText("-");
        ((Button) findViewById(R.id.btn3_tres)).setText("-");
        ((Button) findViewById(R.id.btn4_tres)).setText("-");
        ((Button) findViewById(R.id.btn5_tres)).setText("-");
        ((Button) findViewById(R.id.btn6_tres)).setText("-");
        ((Button) findViewById(R.id.btn7_tres)).setText("-");
        ((Button) findViewById(R.id.btn8_tres)).setText("-");
        ((Button) findViewById(R.id.btn9_tres)).setText("-");
        Arrays.fill(valores,"-");
        estado = "jugando";
    }


}


//012
//345
//678
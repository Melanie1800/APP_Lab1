package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;

public class TresActivity extends AppCompatActivity {

    private String[] valores = {"-","-","-","-","-","-","-","-","-"};
    private String estado = "jugando";

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
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn1.setText(valor);
                    valores[0]=valor;
                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn2 = findViewById(R.id.btn2_tres);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn2.setText(valor);
                    valores[1]=valor;

                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn3 = findViewById(R.id.btn3_tres);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn3.setText(valor);
                    valores[2]=valor;

                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn4 = findViewById(R.id.btn4_tres);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn4.setText(valor);
                    valores[3]=valor;

                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn5 = findViewById(R.id.btn5_tres);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn5.setText(valor);
                    valores[4]=valor;

                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn6 = findViewById(R.id.btn6_tres);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn6.setText(valor);
                    valores[5]=valor;

                    verificarWin();
                    count[0]++;
                }


            }
        });

        Button btn7 = findViewById(R.id.btn7_tres);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn7.setText(valor);
                    valores[6]=valor;

                    verificarWin();
                    count[0]++;
                }

            }
        });

        Button btn8 = findViewById(R.id.btn8_tres);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn8.setText(valor);
                    valores[7]=valor;

                    verificarWin();
                    count[0]++;
                }
            }
        });

        Button btn9 = findViewById(R.id.btn9_tres);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor;
                if(estado.equals("jugando")){
                    if(count[0] %2==0){
                        valor="O";
                    }else{
                        valor="X";
                    }
                    btn9.setText(valor);
                    valores[8]=valor;

                    verificarWin();
                    count[0]++;
                }

            }
        });

        Button btnEst= findViewById(R.id.btnEstadisticas_memoria);
        btnEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TresActivity.this,EstadisticsTresActivity.class);
                startActivity(intent);
            }
        });

    }


    private boolean verificarWin(){
        String msgX = "Gano 1";
        String msgO = "Gano O";
        if(!valores[2].equals("-") && valores[2].equals(valores[4]) && valores[2].equals(valores[6]) ){
            estado="gano";
            if(valores[2].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[3]) && valores[3].equals(valores[6]) ){
            estado="gano";
            if(valores[0].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[1].equals("-") && valores[1].equals(valores[4]) && valores[1].equals(valores[7]) ){
            estado="gano";
            if(valores[1].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[2].equals("-") && valores[2].equals(valores[5]) && valores[2].equals(valores[8]) ){
            estado="gano";
            if(valores[2].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[4]) && valores[0].equals(valores[8]) ){
            estado="gano";
            if(valores[0].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[0].equals("-") && valores[0].equals(valores[1]) && valores[0].equals(valores[2]) ){
            estado="gano";
            if(valores[0].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[3].equals("-") && valores[3].equals(valores[4]) && valores[3].equals(valores[5]) ){
            estado="gano";
            if(valores[3].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!valores[6].equals("-") && valores[6].equals(valores[7]) && valores[6].equals(valores[8]) ){
            estado="gano";
            if(valores[6].equals("1")){
                Toast.makeText(this, msgX, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, msgO, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        if(!Arrays.asList(valores).contains("-")){
            estado="Nadie ganó";
            Toast.makeText(this, "Nadie gano", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public void crearNuevo(View view){
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
package com.example.applab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EstadisticsTresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistics_tres);
        setTitle("Juego - Tres en Raya");

        Intent intent = this.getIntent();
        ArrayList<String> est = intent.getStringArrayListExtra("estadisticas");
        LinearLayout layout = findViewById(R.id.layoutEst);
        for(int i=0; i< est.size(); i++){
            TextView tvEst = new TextView(this);
            tvEst.setTextSize(18);
            tvEst.setText("Juego "+ (i+1) + ": "+ est.get(i));
            layout.addView(tvEst);
        }

        Button btnNuevo= findViewById(R.id.btn_nuevo_est_tres);
        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

    }
}
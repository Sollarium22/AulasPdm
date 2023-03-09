package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bJogo;
    Button bCadastrar;
    Button bCalBasi;
    Button bCalT;
    Button bCalC;
    Button bCreditos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bJogo = findViewById(R.id.bJogo);
        bCadastrar = findViewById(R.id.bCadastrar);
        bCalBasi = findViewById(R.id.bCalBasica);
        bCalT = findViewById(R.id.bCalT);
        bCalC = findViewById(R.id.bCalC);
        bCreditos = findViewById(R.id.bCreditos);
        bJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Rodar.class);
                startActivity(in);
            }
        });
        bCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(in);
            }
        });

        bCalBasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalBasi.class);
                startActivity(in);
            }
        });

        bCalT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalT.class);
                startActivity(in);
            }
        });

        bCalC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalC.class);
                startActivity(in);
            }
        });

        bCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Creditos.class);
                startActivity(in);
            }
        });
    }
}
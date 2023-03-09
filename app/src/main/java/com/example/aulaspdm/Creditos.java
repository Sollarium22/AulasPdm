package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {

    Button bVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

       // bVoltar = findViewById(R.id.bVoltar);

        bVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Creditos.this, MainActivity.class);
                startActivity(in);

            }
        });
    }
}
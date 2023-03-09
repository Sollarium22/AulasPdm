package com.example.aulaspdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CalT extends AppCompatActivity {

    Button bVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calt);

        bVoltar = findViewById(R.id.bVoltar);

        bVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(CalT.this, MainActivity.class);
                startActivity(in);

            }
        });

    }


}
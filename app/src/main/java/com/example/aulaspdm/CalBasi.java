package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalBasi extends AppCompatActivity {
    Intent it = new Intent();
    EditText et1;
    EditText et2;
    TextView result;
    Button mais;

    Button menos;
    Button div;
    Button vezes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calbasi);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        result = findViewById(R.id.tResult);
        mais = findViewById(R.id.soma);
        menos = findViewById(R.id.bNum11);
        div = findViewById(R.id.bNum12);
        vezes = findViewById(R.id.bNum13);


            mais.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String teste = String.valueOf(et1.getText());
                    String teste2 = String.valueOf(et2.getText());
                    if (!teste.isEmpty() || !teste2.isEmpty()) {
                        Double resulf = Double.parseDouble(String.valueOf(et1.getText())) + Double.parseDouble(String.valueOf(et2.getText()));
                        result.setText("Resultado:" + resulf);
                    }else {
                        result.setText("Preencha os campos");
                    }
                }
            });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teste = String.valueOf(et1.getText());
                String teste2 = String.valueOf(et2.getText());
                if (!teste.isEmpty() || !teste2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(et1.getText())) - Double.parseDouble(String.valueOf(et2.getText()));
                    result.setText("Resultado:" + resulf);
                }else {
                    result.setText("Preencha os campos");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teste = String.valueOf(et1.getText());
                String teste2 = String.valueOf(et2.getText());
                if (!teste.isEmpty() || !teste2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(et1.getText())) / Double.parseDouble(String.valueOf(et2.getText()));
                    result.setText("Resultado:" + resulf);
                }else {
                    result.setText("Preencha os campos");
                }
            }
        });
        vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teste = String.valueOf(et1.getText());
                String teste2 = String.valueOf(et2.getText());
                if (!teste.isEmpty() || !teste2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(et1.getText())) * Double.parseDouble(String.valueOf(et2.getText()));
                    result.setText("Resultado:" + resulf);
                }else {
                    result.setText("Preencha os campos");
                }
            }
        });


    }


}
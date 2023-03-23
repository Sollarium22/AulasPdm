package com.example.aulaspdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalT extends AppCompatActivity {

    Button bVoltar;

    public void Cal(EditText edit1, EditText edit2, int def, TextView txt){
        String veri1 = String.valueOf(edit1.getText());
        String veri2 = String.valueOf(edit2.getText());
        switch (def){
            case 1:
                if (!veri1.isEmpty() || !veri2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(edit1.getText())) + Double.parseDouble(String.valueOf(edit2.getText()));
                    txt.setText("Resultado:" + resulf);
                }else {
                    txt.setText("Preencha os campos");
                }
                break;
            case 2:
                if (!veri1.isEmpty() || !veri2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(edit1.getText())) - Double.parseDouble(String.valueOf(edit2.getText()));
                    txt.setText("Resultado:" + resulf);
                }else {
                    txt.setText("Preencha os campos");
                }
                break;
            case 3:
                if (!veri1.isEmpty() || !veri2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(edit1.getText())) / Double.parseDouble(String.valueOf(edit2.getText()));
                    txt.setText("Resultado:" + resulf);
                }else {
                    txt.setText("Preencha os campos");
                }
                break;
            case 4:
                if (!veri1.isEmpty() || !veri2.isEmpty()) {
                    Double resulf = Double.parseDouble(String.valueOf(edit1.getText())) * Double.parseDouble(String.valueOf(edit2.getText()));
                    txt.setText("Resultado:" + resulf);
                }else {
                    txt.setText("Preencha os campos");
                }
                break;
        }


    }

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
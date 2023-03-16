package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalBasi extends AppCompatActivity {
    Intent it = new Intent();
    EditText et1;
    EditText et2;
    TextView result;
    Button mais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calbasi);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        result = findViewById(R.id.tResult);
        mais = findViewById(R.id.bNum9);



    }


}
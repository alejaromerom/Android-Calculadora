package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String temporal;
    String operador1;
    String operador2;
    String operador;
    TextView pantalla;
    Button btone;
    Button bttwo;
    Button btnthree;
    Button btnclear;
    Button btnplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.result);

        btone = findViewById(R.id.buttonseven);
        btone.setOnClickListener(this);
        bttwo = findViewById(R.id.buttoneigth);
        bttwo.setOnClickListener(this);
        btnthree = findViewById(R.id.buttonnine);
        btnthree.setOnClickListener(this);
        btnclear = findViewById(R.id.buttonClear);
        btnclear.setOnClickListener(this);
        btnplus = findViewById(R.id.buttonplus);
        btnplus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        temporal = pantalla.getText().toString();

        switch (v.getId()) {

            case R.id.buttonseven:
                pantalla.setText(temporal + "8");
                break;
            case R.id.buttoneigth:
                pantalla.setText(temporal + "7");
                break;
            case R.id.buttonnine:
                pantalla.setText(temporal + "9");
                break;
            case R.id.buttonClear:
                borrar();
                break;
            case R.id.buttonplus:
                operador1 = temporal;
                operador = "sumar";

                borrar();
                break;
        }
    }


    void  borrar() {
        pantalla.setText("");
    }

}
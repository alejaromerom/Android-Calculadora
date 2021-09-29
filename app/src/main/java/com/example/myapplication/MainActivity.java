package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int opera1;
    int opera2;
    int opera3;
    String temporal;
    String operador1;
    String operador2;
    String operador;
    TextView pantalla;
    Button btone;
    Button bttwo;
    Button btnthree;
    Button btnfour;
    Button btnfive;
    Button btnsix;
    Button btnseven;
    Button btneigth;
    Button btnine;
    Button zero;
    Button raiz;
    Button point;
    Button divide;
    Button Multiplicar;
    Button percent;
    Button pi;
    Button subtract;
    Button btnclear;
    Button btnplus;
    Button equal;


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
        btnfour = findViewById(R.id.buttonfour);
        btnfour.setOnClickListener(this);
        btnfive = findViewById(R.id.buttonfive);
        btnfive.setOnClickListener(this);
        btnsix = findViewById(R.id.buttonsix);
        btnsix.setOnClickListener(this);
        btnseven = findViewById(R.id.buttonone);
        btnseven.setOnClickListener(this);
        btneigth = findViewById(R.id.buttontwo);
        btneigth.setOnClickListener(this);
        btnine = findViewById(R.id.buttonthree);
        btnine.setOnClickListener(this);
        zero = findViewById(R.id.buttonzero);
        zero.setOnClickListener(this);

        btnclear = findViewById(R.id.buttonClear);
        btnclear.setOnClickListener(this);
        btnplus = findViewById(R.id.buttonplus);
        btnplus.setOnClickListener(this);
        subtract = findViewById(R.id.resta);
        subtract.setOnClickListener(this);
        divide = findViewById(R.id.buttondivide);
        divide.setOnClickListener(this);
        Multiplicar = findViewById(R.id.buttonmultiplicar);
        Multiplicar.setOnClickListener(this);
        equal = findViewById(R.id.equal);
        equal.setOnClickListener(this);


        raiz = findViewById(R.id.buttonraiz);
        raiz.setOnClickListener(this);
        point = findViewById(R.id.buttonpoint);
        point.setOnClickListener(this);
        pi = findViewById(R.id.buttonnumberpi);
        pi.setOnClickListener(this);
        percent = findViewById(R.id.buttonporcentaje);
        percent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        temporal = pantalla.getText().toString();

        switch (v.getId()) {

            case R.id.buttonseven:
                pantalla.setText(temporal + "7");
                break;
            case R.id.buttoneigth:
                pantalla.setText(temporal + "8");
                break;
            case R.id.buttonnine:
                pantalla.setText(temporal + "9");
                break;
            case R.id.buttonfour:
                pantalla.setText(temporal + "4");
                break;
            case R.id.buttonfive:
                pantalla.setText(temporal + "5");
                break;
            case R.id.buttonsix:
                pantalla.setText(temporal + "6");
                break;
            case R.id.buttonone:
                pantalla.setText(temporal + "1");
                break;
            case R.id.buttontwo:
                pantalla.setText(temporal + "2");
                break;
            case R.id.buttonthree:
                pantalla.setText(temporal + "3");
                break;
            case R.id.buttonzero:
                pantalla.setText(temporal + "0");
                break;
            case R.id.buttonpoint:
                pantalla.setText(temporal + ".");
                break;
            case R.id.buttonporcentaje:
                pantalla.setText(temporal + "%");
                break;

            case R.id.buttonClear:
                borrar();
                break;

            case R.id.buttonplus:
                operador1 = temporal;
                operador = "sumar";
                borrar();
                btnplus.setEnabled(false);
                break;

            case R.id.resta:
                operador1 = temporal;
                operador = "restar";

                borrar();
                break;

            case R.id.buttonmultiplicar:
                operador1 = temporal;
                operador = "multiplicar";

                borrar();
                break;

            case R.id.buttondivide:
                operador1 = temporal;
                operador = "dividir";

                borrar();
                break;


            case R.id.buttonraiz:
                double raiz01;
                double rta;
                raiz01 = Double.parseDouble(temporal);
                rta =Math.sqrt(raiz01);
                pantalla.setText(Double.toString(rta));
                break;


            case R.id.buttonnumberpi:
                double pinumber;
                double resp;
                raiz01 = Double.parseDouble(temporal);
                resp =Math.PI;
                pantalla.setText(Double.toString(resp));
                break;



            case R.id.equal:
              calcular(operador1,operador,temporal);
              btnplus.setEnabled(true);
                break;
        }
    }


    void  borrar() {
        pantalla.setText("");
    }

    public void porcentaje (View v){


    }
    void calcular(String opera, String operado, String tempora ){
    int respuesta;
        opera1 = Integer.parseInt(opera);
        opera2 = Integer.parseInt(tempora);

    switch (operado) {

        case "sumar":
            respuesta = opera1 + opera2;
            pantalla.setText(Integer.toString(respuesta));
        break;

        case "restar":
            respuesta = opera1 - opera2;
            pantalla.setText(Integer.toString(respuesta));

        break;

        case "multiplicar":
            respuesta = opera1 * opera2;
            pantalla.setText(Integer.toString(respuesta));

            break;

        case "dividir":
            respuesta = opera1 / opera2;
            pantalla.setText(Integer.toString(respuesta));

            break;

        case "porcentaje":
            respuesta = opera1 % opera2;
            pantalla.setText(Float.toString(respuesta));


    }



    }

}
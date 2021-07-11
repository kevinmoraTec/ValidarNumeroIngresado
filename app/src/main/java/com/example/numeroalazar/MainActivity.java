package com.example.numeroalazar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button validarRespuesta;
    private EditText numeroU;

    private int numR;
    int valorC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Union xml

        numR=crearAleatorio();
        System.out.println("Aleatorio"+crearAleatorio());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
       validarRespuesta=(Button) findViewById(R.id.botonAdivina);
        validarRespuesta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                  numeroU= findViewById(R.id.etNumber);
                 String num = numeroU.getText().toString();
                  valorC = Integer.parseInt(num);

                Intent i = new Intent(MainActivity.this, palatially.class);
                i.putExtra("Usuario",valorC);
                startActivity(i);
                //System.out.println("Nuemro Usuario"+valorC);



            }


        });
    }
    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public int crearAleatorio(){
     return (int) (Math.random()*10);
    }


}

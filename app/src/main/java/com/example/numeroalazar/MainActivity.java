package com.example.numeroalazar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button validarRespuesta;
    private TextView numeroU;
    public int numeroUsuario;
    private int numR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Union xml
        numeroU =(TextView) findViewById(R.id.tvinicio);
        numR=crearAleatorio();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
       validarRespuesta=(Button) findViewById(R.id.botonAdivina);
        validarRespuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, palatially.class);
                startActivity(i);
                numeroUsuario= Integer.parseInt(numeroU.toString());


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
     return (int) (Math.random()*10+1);
    }
    public void validarRept(){
        if(numR == numeroUsuario){
            System.out.println("no es valido");
            System.out.println(numR);
            System.out.println(numeroUsuario);
        }
    }
}

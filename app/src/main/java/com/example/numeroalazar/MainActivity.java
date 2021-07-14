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
    private EditText random;
    private int randomFin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Union xml

        //numR=crearAleatorio();
        System.out.println("Aleatorio"+numRandom());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
       validarRespuesta=(Button) findViewById(R.id.botonAdivina);
        validarRespuesta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                  numeroU= findViewById(R.id.etNumber);
                  random=findViewById(R.id.etNumberRandom);
                 String num = numeroU.getText().toString();
                 String numR= random.getText().toString();
                  valorC = Integer.parseInt(num);
                  randomFin=Integer.parseInt(numR);
                  int randomEnvio = numRandom();

                Intent i = new Intent(MainActivity.this, palatially.class);
                i.putExtra("Usuario",valorC);
                i.putExtra("Random",randomEnvio);
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

    public int numRandom(){
        return (int) (Math.random() * randomFin) + 1;
    }


}

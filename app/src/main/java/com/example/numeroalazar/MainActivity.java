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
    int valorC = 0;
    private EditText random;
    private int randomFin;
    //int a= Integer.parseInt(null);
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

                randomFin=Integer.parseInt(devovernumRandomString());
                  valorC=devolverNumIngresado();
                  int randomEnvio = numRandom();

                  if (valorC !=0 && randomFin !=0){
                      if(!validarRango(randomFin,valorC)){
                          numeroU.setError("Numero no esta en el rango");
                      }else{
                          Intent i = new Intent(MainActivity.this, palatially.class);
                          i.putExtra("Usuario",valorC);
                          i.putExtra("Random",randomEnvio);
                          startActivity(i);
                      }
                  }else{ }


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

    public String devovernumRandomString(){
        String randonvalor;
        if(random.getText().toString().isEmpty()){
            random.setError("Ingresa un numero");
            return "0";
        }else {
            return randonvalor= random.getText().toString();
        }
    }


    public int devolverNumIngresado(){

        if (numeroU.getText().toString().isEmpty()){
            numeroU.setError("Ingresa un numero");
            return 0;
        }else {
            String num = numeroU.getText().toString();
            return valorC = Integer.parseInt(num);
        }

    }

    public int numRandom(){

        return (int) (Math.random() * randomFin) + 1;
    }

    public boolean validarRango(int a,int b){
        boolean valor = false;
        if (a < b){
            return valor;
        }else{
            return valor=true;
        }

    }


}

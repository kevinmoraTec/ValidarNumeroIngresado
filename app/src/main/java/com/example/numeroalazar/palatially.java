package com.example.numeroalazar;
import com.example.numeroalazar.MainActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class palatially extends AppCompatActivity {
    private Button regresar;
    private TextView tvnumIgresaste;
    private TextView tvnumRandom;
    private TextView tvvalidar;
    private int numRandomF;
    private int numF;
    private String respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validar);
        numRandomF=numRandom();
        respuesta =validarResp();
        regresar=(Button) findViewById(R.id.botoregresar);
        tvnumIgresaste= (TextView) findViewById(R.id.tvnumIgresaste);
        tvnumRandom = (TextView) findViewById(R.id.tvnumRandom);
        tvvalidar = (TextView) findViewById(R.id.tvvalidar);
         numF = getIntent().getIntExtra("Usuario",2);
        tvnumIgresaste.setText("El Numero que Ingresaste : "+numF);
        tvnumRandom.setText("Numero Random : "+numRandomF);
        tvvalidar.setText(respuesta);



        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(palatially.this,MainActivity.class);
                startActivity(i);
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
        return (int) (Math.random() * 10) + 1;
    }

    public String validarResp(){
        String correcto = "Casi lo Logras";
        String incorrecto = "Felicidades";
        if (numF == numRandomF){
            return incorrecto;
        }else{
            return correcto;
        }
    }


}






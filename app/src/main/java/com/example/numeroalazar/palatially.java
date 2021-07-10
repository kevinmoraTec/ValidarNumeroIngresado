package com.example.numeroalazar;
import com.example.numeroalazar.MainActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class palatially extends AppCompatActivity {
    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        

        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validar);
        regresar=findViewById(R.id.botoregresar);
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
}






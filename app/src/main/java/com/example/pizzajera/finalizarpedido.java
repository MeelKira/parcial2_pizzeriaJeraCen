package com.example.pizzajera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class finalizarpedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizarpedido);
    }


    public void irAElegirProducto (View view){
        Intent i = new Intent(this, elegirproducto.class);
        startActivity(i);
    }

    public void irADatosDePedido (View view){
        Intent i = new Intent(this, datosdepedido.class);
        startActivity(i);
    }
}
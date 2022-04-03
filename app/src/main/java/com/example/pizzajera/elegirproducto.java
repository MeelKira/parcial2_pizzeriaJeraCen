package com.example.pizzajera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class elegirproducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegirproducto);
    }


    public void irAElegirPizza (View view){
        Intent i = new Intent(this, elegirpizza.class);
        startActivity(i);
    }

    public void irAElegirBebida (View view){
        Intent i = new Intent(this, elegirbebida.class);
        startActivity(i);
    }
}
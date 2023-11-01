package com.example.myexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btMainLink = findViewById(R.id.btMenuLink1);
        btMainLink.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link1.class);
            startActivity(intent);
        });

    }
}
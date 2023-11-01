package com.example.myexamen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_modificar_evento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_evento);

        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btMainLink = findViewById(R.id.btLinkVerEvento);
        btMainLink.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link2.class);
            startActivity(intent);
        });

        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btLink1Main = findViewById(R.id.btLinkRegresar);
        btLink1Main.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), activity_link1.class);
            startActivity(intent);
        });
    }
}
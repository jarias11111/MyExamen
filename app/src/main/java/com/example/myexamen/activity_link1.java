package com.example.myexamen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_link1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link1);

        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btLink1Main = findViewById(R.id.btLink1Regresar);
        btLink1Main.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);
        });
        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btMainLink2 = findViewById(R.id.btLink1VerEvento);
        btMainLink2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link2.class);
            startActivity(intent);
        });
        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btMainLink3 = findViewById(R.id.btLink1CrearEvento);
        btMainLink3.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_crear_evento.class);
            startActivity(intent);
        });
        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btMainLink4 = findViewById(R.id.btLink1ModificarEvento);
        btMainLink4.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_modificar_evento.class);
            startActivity(intent);
        });

    }
}
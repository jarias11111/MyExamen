package com.example.myexamen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_link2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link2);

        //CODIGO PARA REALIZAR CLICK EN EL BOTON Y SER DIRECCIONADO A LA INTERFAZ INDICADA
        Button btLink2Main = findViewById(R.id.btLink2Regresar);
        btLink2Main.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), activity_link1.class);
            startActivity(intent);
        });

    }
}
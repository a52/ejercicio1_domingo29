package com.alluberes.ejercicio1_domingo29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_nombre_persona;
    Button b_mostrar_nombre;
    TextView tv_mostrar_nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre_persona = findViewById(R.id.et_nombre_persona);
        b_mostrar_nombre = findViewById(R.id.b_mostrar_nombre);
        tv_mostrar_nombre = findViewById(R.id.tv_mostrar_nombre);

        b_mostrar_nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 tv_mostrar_nombre.setText("Hola " + et_nombre_persona.getText());
            }
        });

    }
}

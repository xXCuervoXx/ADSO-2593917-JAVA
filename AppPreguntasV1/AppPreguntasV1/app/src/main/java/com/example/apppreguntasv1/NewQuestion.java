package com.example.apppreguntasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.apppreguntasv1.utils.Config;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewQuestion extends AppCompatActivity {
    TextView etq_nombre;
    TextView etq_fecha;
    Config config;

    Button btn_empezar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_question);
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_fecha = findViewById(R.id.etq_fecha);
        btn_empezar = findViewById(R.id.btn_empezar);
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        etq_nombre.setText(archivo.getString("nombres",""));
        config = new Config(getApplicationContext());
        //Obtener la fecha actual del sistema
        Date fechaActual = new Date();

        // Formatear la fecha y hora actual
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);

        etq_fecha.setText(fechaFormateada);

        btn_empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(fechaFormateada);
            }
        });

    }
    public void cambiarActivity(String fecha){
        Intent intencion = new Intent(getApplicationContext(), AnswerQuestions.class);
        intencion.putExtra("fecha_inicio",fecha);
        startActivity(intencion);
    }


}
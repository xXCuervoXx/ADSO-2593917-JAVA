package com.example.apppreguntasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerQuestions extends AppCompatActivity {

    TextView etq_nombre;

    TextView etq_fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_questions);
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_fecha = findViewById(R.id.etq_fecha);
        etq_nombre.setText(archivo.getString("nombres",""));
        Intent intencion = getIntent();
        String fecha_inicio = intencion.getStringExtra("fecha_inicio");
        etq_fecha.setText("Inicio: "+fecha_inicio);
    }
}
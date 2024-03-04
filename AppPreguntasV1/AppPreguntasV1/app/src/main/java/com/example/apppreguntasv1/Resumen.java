package com.example.apppreguntasv1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntasv1.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Resumen extends AppCompatActivity {
    TextView etq_datos;
    TextView numero;
    LinearLayout container_cuestionarios;
    Config config;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen_activity_main);
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        etq_datos = findViewById(R.id.etq_datos);
        container_cuestionarios = findViewById(R.id.container_cuestionarios);
        etq_datos.setText(archivo.getString("nombres",""));
        config = new Config(getApplicationContext());
        cargar_cuestionarios();

    }
    public void cargar_cuestionarios(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);

        String url = config.getEndpoint("API_preguntas/getCuestionarios.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    JSONArray usuarios = jsonObject.getJSONArray("usuarios");

                    for (int i = 0; i < usuarios.length(); i++) {
                        JSONObject usuarioObject = usuarios.getJSONObject(i);

                        // Extraer los valores del usuario
                        String id = usuarioObject.getString("id");
                        String id_usuario = usuarioObject.getString("id_usuario");
                        String cant_preguntas = usuarioObject.getString("cant_preguntas");
                        String cant_ok = usuarioObject.getString("cant_ok");
                        String cant_error = usuarioObject.getString("cant_error");
                        String fecha_inicio = usuarioObject.getString("fecha_inicio");
                        String fecha_fin = usuarioObject.isNull("fecha_fin") ? null : usuarioObject.getString("fecha_fin");

                        // Hacer algo con los valores extraídos
                        System.out.println("id: " + id);
                        System.out.println("id_usuario: " + id_usuario);
                        System.out.println("cant_preguntas: " + cant_preguntas);
                        System.out.println("cant_ok: " + cant_ok);
                        System.out.println("cant_error: " + cant_error);
                        System.out.println("fecha_inicio: " + fecha_inicio);
                        System.out.println("fecha_fin: " + fecha_fin);

                        mostrarDatos(id, id_usuario, cant_preguntas, cant_ok, cant_error, fecha_inicio, fecha_fin);

                    }


                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                String id_string = archivo.getString("id_usuario","");
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_usuario", id_string);

                return params;
            }
        };

        queue.add(solicitud);



    }

    public void mostrarDatos(String id,String id_usuario, String cant_preguntas, String cant_ok, String cant_error, String fecha_inicio, String fecha_fin){
        Button boton = new Button(this);
        TextView espacio = new TextView(this);
        espacio.setText(" ");
        boton.setText("Numero: "+id+"\n"
                    +"Fecha Inicio: "+fecha_inicio+"\n"
                    +"N°Preguntas: "+cant_preguntas+"\n"
                    +"N°ok: "+cant_ok+" - "+"N°error: "+cant_error);
        boton.setBackgroundResource(R.drawable.border_button);
        boton.setBackgroundColor(Color.parseColor("#C8f4cf"));

        final String captura = id;

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivityDetalles(captura, id_usuario, cant_preguntas, cant_ok, cant_error, fecha_inicio, fecha_fin);
            }
        });

        this.container_cuestionarios.addView(boton);
        this.container_cuestionarios.addView(espacio);
    }

    public void cerrarSesion(View vista){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();
        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);
        finish();
    }

    public void cambiarActivityDetalles(String id,String id_usuario, String cant_preguntas, String cant_ok, String cant_error, String fecha_inicio, String fecha_fin){
        Intent intencion = new Intent(getApplicationContext(), Detalles.class);

        intencion.putExtra("id_cuestionario", id);
        intencion.putExtra("id_usuario", id_usuario);
        intencion.putExtra("cant_preguntas", cant_preguntas);
        intencion.putExtra("cant_ok", cant_ok);
        intencion.putExtra("cant_error", cant_error);
        intencion.putExtra("fecha_inicio", fecha_inicio);
        intencion.putExtra("fecha_fin", fecha_fin);
        startActivity(intencion);
    }
}

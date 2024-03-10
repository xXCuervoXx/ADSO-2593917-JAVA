package com.example.apppreguntasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntasv1.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Detalles extends AppCompatActivity {


    Config config;
    TextView etq_nombre;
    LinearLayout container_datos;

    LinearLayout container_preguntas;
    String cuestionario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        etq_nombre=findViewById(R.id.etq_nombre);
        container_datos = findViewById(R.id.container_datos);
        container_preguntas = findViewById(R.id.container_preguntas);
        etq_nombre.setText(archivo.getString("nombres",""));
        config = new Config(getApplicationContext());

        Intent intencion = getIntent();
        String id_cuestionario = intencion.getStringExtra("id_cuestionario");
        String id_usuario = intencion.getStringExtra("id_usuario");
        String cant_preguntas = intencion.getStringExtra("cant_preguntas");
        String cant_ok = intencion.getStringExtra("cant_ok");
        String cant_error = intencion.getStringExtra("cant_error");
        String fecha_inicio = intencion.getStringExtra("fecha_inicio");
        String fecha_fin = intencion.getStringExtra("fecha_fin");

        TextView datos = new TextView(this);
        datos.setText("Fecha inicio: "+fecha_inicio+"\n"
                        +"Fecha fin: "+fecha_fin+"\n"
                        +"Preguntas: "+cant_preguntas+"\n"
                        +"Correctas: "+cant_ok+"\n"
                        +"Incorrectas: "+cant_error+"\n"
                        );
        container_datos.addView(datos);
        this.cuestionario=id_cuestionario;


        System.out.println("id_cuestionario"+id_cuestionario);
        cargarDatos();
    }

    public void cargarDatos(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);

        String url = config.getEndpoint("API_preguntas/getRespuestas.php");
        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK respuesta");
                    System.out.print(response);
                    JSONObject jsonObject = new JSONObject(response);

                    Boolean status = jsonObject.getBoolean("status");
                    if(status){
                        JSONArray respuestaArray = jsonObject.getJSONArray("respuesta");

                        for (int i = 0; i < respuestaArray.length(); i++) {
                            JSONObject respuestaObject = respuestaArray.getJSONObject(i);
                            JSONObject pregunta = respuestaObject.getJSONObject("pregunta");

                            String id = pregunta.getString("id");
                            String descripcion = pregunta.getString("descripcion");
                            String id_correcta = pregunta.getString("id_correcta");
                            String url_imagen = pregunta.getString("url_imagen");
                            String id_respuesta = pregunta.getString("id_respuesta");
                            String answer = pregunta.getString("respuesta");
                            String estado = pregunta.getString("estado");


                            int iterador = i;

                            mostrarPreguntas(iterador,id, descripcion, id_correcta, url_imagen, id_respuesta, estado);

                            JSONArray opciones = respuestaObject.getJSONArray("opciones");
                            for (int j = 0; j < opciones.length(); j++){
                                JSONObject key_opcion = opciones.getJSONObject(j);
                                String id_opcion = key_opcion.getString("id");
                                String id_pregunta = key_opcion.getString("id_pregunta");
                                String descri = key_opcion.getString("descripcion");

                                mostrarOpciones(estado, answer ,id_respuesta,id_correcta,id_opcion, id_pregunta, descri);
                            }
                            espacio();
                        }
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
                Intent intencion = getIntent();
                String id_cuestionario = intencion.getStringExtra("id_cuestionario");
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);

                return params;
            }
        };
        queue.add(solicitud);
    }

    public void mostrarPreguntas(int iterador,String id, String descripcion, String id_correcta, String url_imagen, String id_respuesta, String estado){
        TextView preguntas = new TextView(this);
        preguntas.setText("Pregunta "+(iterador+1)+": "+"\n"
                            + descripcion);
        preguntas.setBackgroundColor(Color.parseColor("#C8f4cf"));

        container_preguntas.addView(preguntas);
    }

    public void mostrarOpciones(String estado,String respuesta,String id_respuesta, String correcta,String id_opcion, String id_pregunta, String descripcion){
        TextView opciones = new TextView(this);
        opciones.setText("■ "+descripcion);
        if (respuesta.equals(descripcion) && estado.equals("OK")){
            opciones.setTextColor(Color.parseColor("#75B84A"));
        } else if(respuesta.equals(descripcion) && estado.equals("ERROR")){
            opciones.setTextColor(Color.RED);
        }
        container_preguntas.addView(opciones);

    }
    public void espacio(){
        TextView espacio = new TextView(this);
        espacio.setText("");
        container_preguntas.addView(espacio);
    }

    public void volver(View v){
        Intent intencion = new Intent(getApplicationContext(), Resumen.class);
        startActivity(intencion);
    }
}
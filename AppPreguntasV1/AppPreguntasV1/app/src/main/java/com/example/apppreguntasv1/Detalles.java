package com.example.apppreguntasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
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
    String cuestionario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        etq_nombre=findViewById(R.id.etq_nombre);
        container_datos = findViewById(R.id.container_datos);
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
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    System.out.print("-----------------------------------");
                    JSONArray respuesta = jsonObject.getJSONArray("respuesta");

                    for (int i = 0; i < respuesta.length(); i++) {
                        JSONObject respuestaObject = respuesta.getJSONObject(i);
                        JSONObject pregunta = respuestaObject.getJSONObject("pregunta");

                        int id = pregunta.getInt("id");
                        System.out.println("id======"+id);



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
}
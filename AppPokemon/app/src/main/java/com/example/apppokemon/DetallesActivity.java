package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DetallesActivity extends AppCompatActivity {

    TextView etq_nombre;

    TextView etq_peso;
    TextView etq_altura;
    RecyclerView recycler;
    Context contexto;
    List<Caracteristicas> listado = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        recycler = findViewById(R.id.recycler_img);
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_peso = findViewById(R.id.etq_peso);
        etq_altura = findViewById(R.id.etq_altura);
        Intent intencion = getIntent();
        String nombre = intencion.getStringExtra("nombre");
        String url = intencion.getStringExtra("url");
        System.out.println(nombre+"--");

        etq_nombre.setText(nombre);

        cargarDatos(url);
    }

    public void cargarDatos(String url){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    String altura = jsonObject.getString("height");
                    etq_altura.setText(altura);
                    String peso = jsonObject.getString("weight");
                    JSONObject sprites = jsonObject.getJSONObject("sprites");
                    String back_default = sprites.getString("back_default");
                    String back_shiny = sprites.getString("back_shiny");
                    String front_default = sprites.getString("front_default");
                    String front_shiny = sprites.getString("front_shiny");
                    etq_peso.setText(peso);
                    String [] img = {back_default, back_shiny, front_default, front_shiny};

                    listado.add(new Caracteristicas(img));

                    // Después de agregar todas las imágenes, configurar el adaptador una vez fuera del onResponse
                    if (!listado.isEmpty()) {
                        AdaptadorCaracteristicas adaptador = new AdaptadorCaracteristicas(listado);
                        recycler.setAdapter(adaptador);
                        recycler.setLayoutManager(new LinearLayoutManager(DetallesActivity.this, LinearLayoutManager.HORIZONTAL, false));
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
        });

        queue.add(solicitud);
    }
}
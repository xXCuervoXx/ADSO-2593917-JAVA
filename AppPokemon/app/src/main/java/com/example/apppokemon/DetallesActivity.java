package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

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
    RecyclerView recycler2;
    Context contexto;
    String [] name;
    List<Caracteristicas> listado = new ArrayList<>();
    List<Habilidades> lista = new ArrayList<>();
    ImageView loadListaPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        recycler = findViewById(R.id.recycler_img);
        recycler2 = findViewById(R.id.recycle_habilidades);
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_peso = findViewById(R.id.etq_peso);
        etq_altura = findViewById(R.id.etq_altura);
        loadListaPokemon=findViewById(R.id.loadListaPokemon);
        Intent intencion = getIntent();
        String nombre = intencion.getStringExtra("nombre");
        String url = intencion.getStringExtra("url");
        System.out.println(nombre+"--");

        etq_nombre.setText(nombre);

        cargarDatos(url);
    }

    public void cargarDatos(String url){
        loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    loadListaPokemon.setVisibility(View.GONE);
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(response);
                    String altura = jsonObject.getString("height");
                    etq_altura.setText(altura);
                    String peso = jsonObject.getString("weight");
                    JSONObject sprites = jsonObject.getJSONObject("sprites");
                    String back_default = sprites.getString("back_default");
                    String back_shiny = sprites.getString("back_shiny");
                    String front_default = sprites.getString("front_default");
                    String front_shiny = sprites.getString("front_shiny");

                    listado.add(new Caracteristicas(back_default));
                    listado.add(new Caracteristicas(back_shiny));
                    listado.add(new Caracteristicas(front_default));
                    listado.add(new Caracteristicas(front_shiny));


                    JSONArray abilities = jsonObject.getJSONArray("abilities");

                    for (int i = 0; i < abilities.length(); i++){
                        JSONObject habilidades = abilities.getJSONObject(i);
                        JSONObject ability = habilidades.getJSONObject("ability");
                        String habilities = ability.getString("name");
                        System.out.println(habilities);
                        lista.add(new Habilidades(habilities));
                        AdaptadorHabilidades adaptadorH = new AdaptadorHabilidades(lista);
                        recycler2.setAdapter(adaptadorH);
                        recycler2.setLayoutManager(new LinearLayoutManager(DetallesActivity.this));

                    }

                    etq_peso.setText(peso);



                    AdaptadorCaracteristicas adaptador = new AdaptadorCaracteristicas(listado);
                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(DetallesActivity.this, LinearLayoutManager.HORIZONTAL, false));





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
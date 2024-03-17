package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    String url_pokemons = "https://pokeapi.co/api/v2/pokemon/";
    List<Pokemon> listado = new ArrayList<>();
    Button btn_siguiente;
    Button btn_anterior;
    ImageView loadListaPokemon;

    int offset = 0;
    int contador = 0;

    Context contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler_list);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        cargarPokemons();

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarSiguientesPokemons();
                listado.clear();

            }
        });


        btn_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarAnteriorPokemons();
                listado.clear();
            }
        });
    }
    public void cargarPokemons(){
        contador = offset+1;

        loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url_pokemons, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loadListaPokemon.setVisibility(View.GONE);
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    String previous = jsonObject.getString("previous");
                    if(previous.equals("null")){
                        btn_anterior.setEnabled(false);
                    }
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, contador++ ));

                        AdaptadorDetalles adaptador = new AdaptadorDetalles( listado );
                        recycler.setAdapter( adaptador );
                        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext()) );

                    }
                    offset+=20;
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                loadListaPokemon.setVisibility(View.GONE);
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }

    public void cargarSiguientesPokemons(){
        contador = offset+1;
        btn_anterior.setEnabled(true);
        loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        String url = url_pokemons + "?offset=" + offset + "&limit=20";
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loadListaPokemon.setVisibility(View.GONE);
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    String next = jsonObject.getString("next");
                    String previous = jsonObject.getString("previous");
                    if(previous.equals("null")){
                        btn_anterior.setEnabled(false);
                    }
                    if(next.equals("null")){
                        btn_siguiente.setEnabled(false);
                    }
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, contador++ ));

                        AdaptadorDetalles adaptador = new AdaptadorDetalles( listado );
                        recycler.setAdapter( adaptador );
                        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext()) );

                    }
                    offset +=20;


                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                loadListaPokemon.setVisibility(View.GONE);
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }
    public void cargarAnteriorPokemons(){
        loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        offset -= 20;
        contador = offset+1;
        String url = url_pokemons + "?offset=" + offset + "&limit=20";
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loadListaPokemon.setVisibility(View.GONE);
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    String previous = jsonObject.getString("previous");
                    String next = jsonObject.getString("next");

                    if(previous.equals("null")){
                        btn_anterior.setEnabled(false);
                    }else{
                        btn_anterior.setEnabled(true);
                    }

                    if(next.equals("null")){
                        btn_siguiente.setEnabled(false);
                    }else{
                        btn_siguiente.setEnabled(true);
                    }
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, contador++ ));

                        AdaptadorDetalles adaptador = new AdaptadorDetalles( listado );
                        recycler.setAdapter( adaptador );
                        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext()) );

                    }
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                loadListaPokemon.setVisibility(View.GONE);
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
}
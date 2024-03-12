package com.example.apppokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    String url_pokemons = "https://pokeapi.co/api/v2/pokemon/";
    List<Pokemon> listado = new ArrayList<>();
    Button btn_siguiente;
    Button btn_anterior;

    int offset = 0;

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
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url_pokemons, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, i ));

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
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }

    public void cargarSiguientesPokemons(){
        String url = url_pokemons + "?offset=" + offset + "&limit=20";
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, i ));

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
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);

    }
    public void cargarAnteriorPokemons(){
        offset -= 20;
        String url = url_pokemons + "?offset=" + offset + "&limit=20";
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.print(response);
                    JSONArray results = jsonObject.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject objectResults = results.getJSONObject(i);
                        System.out.println(objectResults);
                        String nombre = objectResults.getString("name");
                        String url = objectResults.getString("url");
                        System.out.println(nombre);

                        listado.add(new Pokemon(nombre, url, i ));

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
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
}
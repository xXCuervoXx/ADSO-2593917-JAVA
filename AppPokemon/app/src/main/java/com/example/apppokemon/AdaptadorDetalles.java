package com.example.apppokemon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdaptadorDetalles extends RecyclerView.Adapter< AdaptadorDetalles.ViewHolder > {

    List<Pokemon> listaPokemons;

    public AdaptadorDetalles(List<Pokemon> lista){
        this.listaPokemons = lista;
    }

    @NonNull
    @Override
    public AdaptadorDetalles.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDetalles.ViewHolder holder, int position) {
        Pokemon temporal = listaPokemons.get(position);
        holder.cargarDatos( temporal );
    }

    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView etq_idPokemon;

        TextView etq_nombre;

        ImageView img_detalles;
        String etq_url;
        String nombre;

        Context contexto;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            etq_idPokemon = itemView.findViewById(R.id.etq_idPokemon);
            etq_nombre = itemView.findViewById(R.id.etq_nombre);
            img_detalles = itemView.findViewById(R.id.img_detalles);
        }

        public void cargarDatos(Pokemon datos) {

            etq_nombre.setText(datos.getNombre());
            int offset = datos.getId_pokemon();
            String off = String.valueOf(offset);
            etq_idPokemon.setText(off);
            nombre = datos.getNombre();
            etq_url = datos.getUrl();

            img_detalles.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarActivity(nombre, etq_url );
                }
            });

        }

        public void cambiarActivity(String nombre, String url){
            Intent intencion = new Intent(contexto, DetallesActivity.class);
            intencion.putExtra("nombre",nombre);
            intencion.putExtra("url", url);
            System.out.println(nombre+url);
            contexto.startActivity(intencion);
        }


    }

}


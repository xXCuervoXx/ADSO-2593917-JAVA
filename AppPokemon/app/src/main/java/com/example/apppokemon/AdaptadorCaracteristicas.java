package com.example.apppokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.List;

public class AdaptadorCaracteristicas extends RecyclerView.Adapter< AdaptadorCaracteristicas.ViewHolder >{
    List<Caracteristicas> listaPokemons;

    public AdaptadorCaracteristicas(List<Caracteristicas> lista){
        this.listaPokemons = lista;
    }

    @NonNull
    @Override
    public AdaptadorCaracteristicas.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img, parent, false);
        return new AdaptadorCaracteristicas.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Caracteristicas temporal = listaPokemons.get(position);
        holder.cargarDatos( temporal );
    }



    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView etq_img;

        Context contexto;

        String url_pokemons;
        String [] lenght;

        ImageView loadListaPokemons;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            etq_img = itemView.findViewById(R.id.etq_img);
            loadListaPokemons = itemView.findViewById(R.id.loadListaPokemon);
            Glide.with(contexto)
                    .asGif()
                    .load(R.drawable.loading_pokeball)
                    .into(loadListaPokemons);
            loadListaPokemons.setVisibility(View.VISIBLE);

        }

        public void cargarDatos(Caracteristicas datos){
            loadListaPokemons.setVisibility(View.GONE);
            RequestQueue queue = Volley.newRequestQueue(contexto.getApplicationContext());
            String listaImg = datos.getListaImg();
            Picasso.get().load(listaImg).into(etq_img);

        }
    }
}

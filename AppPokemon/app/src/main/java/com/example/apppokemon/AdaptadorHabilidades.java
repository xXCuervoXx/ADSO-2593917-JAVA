package com.example.apppokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter< AdaptadorHabilidades.ViewHolder >{
    List<Habilidades> listaPokemons;

    public AdaptadorHabilidades(List<Habilidades> lista){
        this.listaPokemons = lista;
    }

    @NonNull
    @Override
    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidades, parent, false);
        return new AdaptadorHabilidades.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidades.ViewHolder holder, int position) {
        Habilidades temporal = listaPokemons.get(position);
        holder.cargarDatos( temporal );
    }



    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        TextView etq_habilidades;
        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            etq_habilidades = itemView.findViewById(R.id.etq_habilidades);


        }

        public void cargarDatos(Habilidades datos){
            etq_habilidades.setText(datos.getHabilidades());
        }
    }
}

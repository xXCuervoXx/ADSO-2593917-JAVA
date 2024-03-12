package com.example.apppokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

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



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            etq_img = itemView.findViewById(R.id.etq_img);

        }

        public void cargarDatos(Caracteristicas datos){
            String[] listaImg = datos.getListaImg();
            if (listaImg != null && listaImg.length > 0) {
                for (int i = 0; i < listaImg.length; i++){
                    // Obtener la URL de la imagen para la posición actual (por ejemplo, la primera posición en este caso)
                    String urlImagen = listaImg[i]; // Aquí puedes especificar el índice de la imagen que deseas mostrar

                    // Cargar la imagen en el ImageView utilizando Picasso u otra biblioteca de manejo de imágenes
                    Picasso.get().load(urlImagen).into(etq_img); // Aquí utilizo Picasso como ejemplo, asegúrate de incluir la dependencia en tu archivo build.gradle
                }
            }

        }
    }
}

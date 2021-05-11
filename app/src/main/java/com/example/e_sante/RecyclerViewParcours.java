package com.example.e_sante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewParcours extends  RecyclerView.Adapter<RecyclerViewParcours.ConteneurDeDonnee>
{

    private List<Parcours> parcours;
    public Context context;
    public RecyclerViewParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    @NonNull
    @Override
    public RecyclerViewParcours.ConteneurDeDonnee onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_home, parent, false);
        return new RecyclerViewParcours.ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConteneurDeDonnee holder, int position) {
        holder.titre.setText(parcours.get(position).getTitre());
        holder.description.setText(parcours.get(position).getDescription());
        holder.categorie.setText(parcours.get(position).getCategorie());
        holder.imageView.setImageResource(parcours.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return parcours.size();
    }


    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder{

        public TextView titre;
        public  TextView categorie;
        public TextView description;
        public ImageView imageView;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            titre = itemView.findViewById(R.id.parcours_titre);
            categorie = itemView.findViewById(R.id.category_parcours);
            description = itemView.findViewById(R.id.description_parcours);
            imageView = itemView.findViewById(R.id.parcours_image);

        }

    }
}

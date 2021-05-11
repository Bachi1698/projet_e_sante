package com.example.e_sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class listeParcours extends AppCompatActivity {

    private List<Parcours> listparcours;
    private RecyclerView mRecyclerView;
    private RecyclerViewParcours AdaperParcours;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_parcours);

        mRecyclerView = findViewById(R.id.recyclerview_parcours);
        mRecyclerView.setHasFixedSize(true);
//mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager=new GridLayoutManager(this,1, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        listparcours = new ArrayList<>();
        listparcours.add(new Parcours("First Parcours","Parcours_Description","A",R.drawable.parcours));
        listparcours.add(new Parcours("Second Parcours","Parcours_Description","B",R.drawable.parcours));
        listparcours.add(new Parcours("Three Parcours","Parcours_Description","C",R.drawable.parcours));

        AdaperParcours = new RecyclerViewParcours(listparcours);
        mRecyclerView.setAdapter(AdaperParcours);
    }
}
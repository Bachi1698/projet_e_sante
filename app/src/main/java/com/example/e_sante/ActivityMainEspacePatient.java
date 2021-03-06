package com.example.e_sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;

public class ActivityMainEspacePatient extends AppCompatActivity {

    private RecyclerView mRecyclerView_liste_patient;
    //private MonRecyclerViewAdapter mAdapter_liste_patient;
    private RecyclerView.LayoutManager mLayoutManager_liste_patient;
    RelativeLayout relativeLayout;

    private MonRecyclerViewAdapterPatient mAdapter;
    private CardView card1,card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espacepatient);

        card1=(CardView) findViewById(R.id.listeMedecins);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(v.getContext(), ActivityMainListeMedecins.class);
                startActivity(intent);

            }
        });

        card2=(CardView) findViewById(R.id.listeSeances);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(v.getContext(), ActivityMainListeSeances.class);
                startActivity(intent);

            }
        });




    }
}
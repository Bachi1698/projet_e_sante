package com.example.e_sante;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ActivityMainListeMedecins extends AppCompatActivity implements DetecteurDeClicSurRecycler{


    private RecyclerView mRecyclerView_liste_medecin;
    private RecyclerView.LayoutManager mLayoutManager_liste_medecin;
    CoordinatorLayout mcoordinatorLayout_listemedecin;
    private MonRecyclerViewAdapterMedecin mAdapter;
    LinearLayout expandable;
    CardView cardview;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_medecins);



        mRecyclerView_liste_medecin = (RecyclerView) findViewById(R.id.recycler_view_listemedecins);
        mRecyclerView_liste_medecin.setHasFixedSize(true);
        mLayoutManager_liste_medecin=new LinearLayoutManager(this);
        mRecyclerView_liste_medecin.setLayoutManager(mLayoutManager_liste_medecin);
        mcoordinatorLayout_listemedecin = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        mAdapter = new MonRecyclerViewAdapterMedecin(getDataSource());
        mRecyclerView_liste_medecin.setAdapter(mAdapter);
    }

    private ArrayList<Medecin> getDataSource(){
        ArrayList liste =new ArrayList<Medecin>();
        liste.add(new Medecin("Aziz","a.aziz@gmail.com","mot de passe","6 rue gaârd coriolis, 37200 tours",77980,R.drawable.doctor,"scofield","Spécialiste Gynecologue"));
            return liste;
    }



    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.setDetecteurDeClicSurRecycler(this);
    }



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void clicSurRecyclerItem(int position, View v) {

        Snackbar.make(mcoordinatorLayout_listemedecin, "Le parcours " ,Snackbar.LENGTH_LONG).show();

        new AlertDialog.Builder(ActivityMainListeMedecins.this)
                .setTitle("Nouveau medecin?")
                .setMessage("Voulez vous consulter ce medecin?")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }
}
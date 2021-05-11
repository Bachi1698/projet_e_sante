package com.example.e_sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button connexion_medecin;
    public int verifRole;
    Button inscription_medecin;
    Button connexion_intervenant;
    Button inscription_intervenant;
    Button connexion_patient;
    Button inscription_patient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connexion_intervenant = findViewById(R.id.connexionIntervenant);
        connexion_intervenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue();
                verifRole = 2;
            }
        });
        inscription_intervenant = findViewById(R.id.inscriptionIntervenant);
        inscription_intervenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue1();
                verifRole = 2;
            }
        });
        inscription_medecin = findViewById(R.id.inscriptionMedecin);
        inscription_medecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue1();
                verifRole = 1;
            }
        });
        connexion_medecin = findViewById(R.id.connexionMedecin);
        connexion_medecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue();
                verifRole = 1;
            }
        });
        connexion_patient = findViewById(R.id.connexionPatient);
        connexion_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue();
                verifRole = 3;
            }
        });
        inscription_medecin = findViewById(R.id.inscriptionMedecin);
        inscription_medecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue1();
                verifRole = 1;
            }
        });
        inscription_patient = findViewById(R.id.inscriptionPatient);
        inscription_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickDialogue1();
                verifRole = 3;
            }
        });

    }
    public void clickDialogue() {
        FragmentManager paypal = getSupportFragmentManager();
        ConnexionFragment connexionFragment = ConnexionFragment.newInstance("Titre");
        connexionFragment.show(paypal,"connexion");
    };
    public void clickDialogue1() {
        FragmentManager inscription = getSupportFragmentManager();
        InscriptionFragment inscriptionFragment = InscriptionFragment.newInstance("Titre");
        inscriptionFragment.show(inscription,"inscription");
    };
    public void clickDialogue2() {
        FragmentManager connexion = getSupportFragmentManager();
        ConnexionFragment connexionFragment = ConnexionFragment.newInstance("Titre");
        connexionFragment.show(connexion,"connexion");
    };
    public void clickDialogue3() {
        FragmentManager inscription = getSupportFragmentManager();
        InscriptionFragment inscriptionFragment = InscriptionFragment.newInstance("Titre");
        inscriptionFragment.show(inscription,"inscription");
    };

}
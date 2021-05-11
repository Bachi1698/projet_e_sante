package com.example.e_sante;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class InscriptionFragment extends DialogFragment {
    private EditText nom,prenom,email,password,statut;
    //    private PaiementCarteListener listener;
    private Button btn_inscription;



    public InscriptionFragment() {
        // le fragment est créé par la méthode newInstance
    }

    public static InscriptionFragment newInstance(String title) {

        InscriptionFragment frag = new InscriptionFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_inscription, container);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        listener = (PaiementCarteListener) getActivity();
        /**nom = view.findViewById(R.id.edit_name);*/
        nom = view.findViewById(R.id.inputNom);
        prenom = view.findViewById(R.id.inputPrenom);
        email = view.findViewById(R.id.inputEmailI);
        password = view.findViewById(R.id.inputPasswordI);
        btn_inscription = view.findViewById(R.id.btnInscription);
        statut = view.findViewById(R.id.inputstatutI);
        MainActivity activity =  (MainActivity) getActivity();
        if(activity.verifRole==1)
        {
            statut.setText("Medecin");
        }
        if(activity.verifRole==2)
        {
            statut.setText("INTERVENANT");
        }
        if(activity.verifRole==3)
        {
            statut.setText("PATIENT");
        }
        btn_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),EspacePatient.class);
                startActivity(intent);
                InscriptionFragment.this.dismiss();

            }
        });

    }




}


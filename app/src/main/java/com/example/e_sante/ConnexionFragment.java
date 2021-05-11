package com.example.e_sante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ConnexionFragment extends DialogFragment {
    private EditText email,password,statut;
//    private PaiementCarteListener listener;
    private Button btn_login;



    public ConnexionFragment() {
        // le fragment est créé par la méthode newInstance
    }

    public static ConnexionFragment newInstance(String title) {

        ConnexionFragment frag = new ConnexionFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_connexion, container);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        listener = (PaiementCarteListener) getActivity();
        /**nom = view.findViewById(R.id.edit_name);*/
        email = view.findViewById(R.id.inputEmail);
        password = view.findViewById(R.id.inputPassword);
        btn_login = view.findViewById(R.id.btnLogin);
        statut = view.findViewById(R.id.inputstatut);
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
        /*btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onOkClickDialog(input_name.getText().toString());
            }*//*
        });*/

    }




}


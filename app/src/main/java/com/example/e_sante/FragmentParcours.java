package com.example.e_sante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentParcours extends DialogFragment {
    private EditText titre, description, categorie;
    private Button ajouter;
    public FragmentParcours() {
        // le fragment est créé par la méthode newInstance
    }

    public static FragmentParcours newInstance(String title) {
        FragmentParcours frag = new FragmentParcours();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_parcours, container);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_carte_bancaire, container, false);
        super.onViewCreated(view, savedInstanceState);

        titre = view.findViewById(R.id.titre_parcours);
        description = view.findViewById(R.id.description_parcours);
        categorie = view.findViewById(R.id.categorie_parcours);
        ajouter = view.findViewById(R.id.btnAjouter);


    }
}

package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentListado extends Fragment {
    private Correo[] datos = new Correo[] {
            new Correo("Persona 1", "Asunto del correo 1", "Texto del correo 1"),
            new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
            new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
            new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
            new Correo("Persona 5", "Asunto del correo 5", "Texto del correo 5")
    };
    private ListView lstListado;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstListado = (ListView)getView().findViewById(R.id.LstListado);
        lstListado.setAdapter(new AdaptadorCorreos(this, datos));
    }
}
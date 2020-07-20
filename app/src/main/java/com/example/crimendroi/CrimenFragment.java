package com.example.crimendroi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class CrimenFragment extends Fragment {
    private EditText tituloTxt;
    private Button agregarFechaBtn;
    private CheckBox resueltoCh;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_crimen, container, false);

        tituloTxt = view.findViewById(R.id.titulo_text);
        agregarFechaBtn =view.findViewById(R.id.agregar_fecha_btn);
        resueltoCh =view.findViewById(R.id.resuelto_chb);

        return view;

    }
}

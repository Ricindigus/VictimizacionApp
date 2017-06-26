package pe.gob.inei.victimizacionapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Capitulo200Fragment extends Fragment {

    private RecyclerView recyclerView;
    private ResidenteAdapter residenteAdapter;
    private FloatingActionButton fab;

    public Capitulo200Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_capitulo200, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_residentes);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        inicializarDatos();
        final ResidenteAdapter residenteAdapter= new ResidenteAdapter(getActivity().getApplicationContext(),Residentes.residentes);
        recyclerView.setAdapter(residenteAdapter);

        fab = (FloatingActionButton)view.findViewById(R.id.fab_agregar_residente);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
//                final EditText editText = new EditText(getActivity());
//                editText.setBackgroundColor(Color.WHITE);
//                alert.setTitle("Registrar Residente del Hogar");
//
//                alert.setView(editText);
//                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        residentes.add(new ResidenteHogar(100,"Nombres",editText.getText().toString(),"Jefe"));
//                        residenteAdapter.notifyDataSetChanged();
//                    }
//                });
//                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        //-------
//                    }
//                });
//                alert.show();
                Intent intent = new Intent(getActivity(),AgregarResidenteActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarDatos() {
        Residentes.residentes = new ArrayList<ResidenteHogar>();
        Residentes.residentes.add(new ResidenteHogar(1,"Denis Ricardo","Morales Retamozo","Jefe"));
        Residentes.residentes.add(new ResidenteHogar(2,"Leonardo Ricardo","Morales Infante","Hijo/a"));
        Residentes.residentes.add(new ResidenteHogar(3,"Miriam Karla","Infante Gutierrez","Esposa/o"));
        Residentes.residentes.add(new ResidenteHogar(4,"Juan Carlos","Tenorio Ibañez","Trabajador/a del hogar"));
        Residentes.residentes.add(new ResidenteHogar(5,"Maria Juana","Nantes Gomez","Padres/Suegros/as"));

    }

    @Override
    public void onResume() {
        super.onResume();
        residenteAdapter = new ResidenteAdapter(getActivity(),Residentes.residentes);
        recyclerView.setAdapter(residenteAdapter);
    }
}

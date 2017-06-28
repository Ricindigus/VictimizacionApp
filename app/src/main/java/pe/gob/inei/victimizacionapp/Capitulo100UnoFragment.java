package pe.gob.inei.victimizacionapp;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Capitulo100UnoFragment extends Fragment {

    private LinearLayout layoutPrincipal;
    private RadioGroup rgTipoVivienda;
    private RadioGroup rgAccesoVivienda;
    private RadioGroup rgMaterialPredominante;
    private LinearLayout layoutOtroTipoVivienda;
    private LinearLayout layoutOtroAccesoVivienda;
    private LinearLayout layoutOtroMaterialPredominante;
    private EditText edtOtroTipoVivienda;
    private EditText edtOtroAccesoVivienda;
    private EditText edtOtroMaterialPredominante;



    public Capitulo100UnoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_capitulo100_uno, container, false);
        rgTipoVivienda = (RadioGroup) rootView.findViewById(R.id.capitulo100_pregunta1_radio);
        rgAccesoVivienda = (RadioGroup) rootView.findViewById(R.id.capitulo100_pregunta2_radio);
        rgMaterialPredominante = (RadioGroup) rootView.findViewById(R.id.capitulo100_pregunta3_radio);
        layoutOtroTipoVivienda = (LinearLayout) rootView.findViewById(R.id.capitulo100_pregunta1_sp8_layout_adicional);
        layoutOtroAccesoVivienda = (LinearLayout) rootView.findViewById(R.id.capitulo100_pregunta2_sp7_layout_adicional);
        layoutOtroMaterialPredominante = (LinearLayout) rootView.findViewById(R.id.capitulo100_pregunta3_sp8_layout_adicional);
        edtOtroTipoVivienda = (EditText) rootView.findViewById(R.id.capitulo100_pregunta1_sp8_edittext);
        edtOtroAccesoVivienda = (EditText) rootView.findViewById(R.id.capitulo100_pregunta2__sp7_edittext);
        edtOtroMaterialPredominante = (EditText) rootView.findViewById(R.id.capitulo100_pregunta3__sp8_edittext);


        rgTipoVivienda.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i != R.id.capitulo100_pregunta1_radiobutton8 && layoutOtroTipoVivienda.getVisibility() == View.VISIBLE){
                    edtOtroTipoVivienda.setText("");
                    layoutOtroTipoVivienda.setVisibility(View.GONE);
                }
                switch (i){
                    case R.id.capitulo100_pregunta1_radiobutton1:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton2:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton3:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton4:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton5:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton6:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton7:
                        break;
                    case R.id.capitulo100_pregunta1_radiobutton8:
                        layoutOtroTipoVivienda.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        rgAccesoVivienda.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i != R.id.capitulo100_pregunta2_radiobutton7 && layoutOtroAccesoVivienda.getVisibility() == View.VISIBLE){
                    edtOtroAccesoVivienda.setText("");
                    layoutOtroAccesoVivienda.setVisibility(View.GONE);
                }
                switch (i){
                    case R.id.capitulo100_pregunta2_radiobutton1:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton2:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton3:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton4:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton5:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton6:
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton7:
                        layoutOtroAccesoVivienda.setVisibility(View.VISIBLE);
                        break;
                    case R.id.capitulo100_pregunta2_radiobutton8:
                        break;
                }
            }
        });

        rgMaterialPredominante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i != R.id.capitulo100_pregunta3_radiobutton8 && layoutOtroMaterialPredominante.getVisibility() == View.VISIBLE){
                    edtOtroMaterialPredominante.setText("");
                    layoutOtroMaterialPredominante.setVisibility(View.GONE);
                }
                switch (i){
                    case R.id.capitulo100_pregunta3_radiobutton1:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton2:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton3:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton4:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton5:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton6:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton7:
                        break;
                    case R.id.capitulo100_pregunta3_radiobutton8:
                        layoutOtroMaterialPredominante.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.clearFocus();
    }

    @Override
    public void onStart() {
        super.onStart();
        layoutPrincipal = (LinearLayout) getView().findViewById(R.id.layout_principal_capitulo100_1);
        layoutPrincipal.requestFocus();
    }

    @Override
    public void onResume() {
        super.onResume();
        layoutPrincipal = (LinearLayout) getView().findViewById(R.id.layout_principal_capitulo100_1);
        layoutPrincipal.requestFocus();
    }
}

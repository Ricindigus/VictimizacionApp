package pe.gob.inei.victimizacionapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Capitulo100DosFragment extends Fragment {

    private RadioGroup rgViviendaOcupa;
    private LinearLayout layoutOtroViviendaOcupa;
    private EditText edtOtroViviendaOcupa;
    private CheckBox checkNoSabeGastoAlimentos;
    private CheckBox checkNoSabeGastoBBSS;
    private EditText edtGastoAlimentos;
    private EditText edtGastoBBSS;


    public Capitulo100DosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_capitulo100_dos, container, false);
        rgViviendaOcupa = (RadioGroup) rootView.findViewById(R.id.capitulo100_pregunta4_radio);
        layoutOtroViviendaOcupa = (LinearLayout) rootView.findViewById(R.id.capitulo100_pregunta4_sp8_layout_adicional);
        edtOtroViviendaOcupa = (EditText) rootView.findViewById(R.id.capitulo100_pregunta4__sp8_edittext);
        checkNoSabeGastoAlimentos = (CheckBox) rootView.findViewById(R.id.capitulo100_pregunta5_checkbox);
        checkNoSabeGastoBBSS = (CheckBox) rootView.findViewById(R.id.capitulo100_pregunta6_checkbox);
        edtGastoAlimentos = (EditText) rootView.findViewById(R.id.capitulo100_pregunta5_edittext);
        edtGastoBBSS = (EditText) rootView.findViewById(R.id.capitulo100_pregunta6_edittext);

        rgViviendaOcupa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i != R.id.capitulo100_pregunta3_radiobutton8 && layoutOtroViviendaOcupa.getVisibility() == View.VISIBLE){
                    edtOtroViviendaOcupa.setText("");
                    layoutOtroViviendaOcupa.setVisibility(View.GONE);
                }
                switch (i){
                    case R.id.capitulo100_pregunta4_radiobutton1:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton2:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton3:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton4:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton5:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton6:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton7:
                        break;
                    case R.id.capitulo100_pregunta4_radiobutton8:
                        layoutOtroViviendaOcupa.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        checkNoSabeGastoAlimentos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                if(checkeado){
                    edtGastoAlimentos.setText("");
                    edtGastoAlimentos.setBackgroundColor(Color.LTGRAY);
                    edtGastoAlimentos.setEnabled(false);
                }
                else {
                    edtGastoAlimentos.setEnabled(true);
                    edtGastoAlimentos.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        checkNoSabeGastoBBSS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                if(checkeado){
                    edtGastoBBSS.setText("");
                    edtGastoBBSS.setBackgroundColor(Color.LTGRAY);
                    edtGastoBBSS.setEnabled(false);
                }
                else {
                    edtGastoBBSS.setEnabled(true);
                    edtGastoBBSS.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

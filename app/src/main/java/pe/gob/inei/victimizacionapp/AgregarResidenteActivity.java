package pe.gob.inei.victimizacionapp;

import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AgregarResidenteActivity extends AppCompatActivity {
    private TextView txtNumero;
    private EditText edtNombres;
    private EditText edtApellidos;
    private RadioGroup rgParentesco;
    private Button btnAgregar;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_residente);
        numero = Residentes.residentes.size() + 1;
        txtNumero = (TextView) findViewById(R.id.agregar_txtNumero);
        edtNombres = (EditText) findViewById(R.id.agregar_edtNombres);
        edtApellidos = (EditText) findViewById(R.id.agregar_edtApellidos);
        rgParentesco = (RadioGroup) findViewById(R.id.agregar_radioParentesco);
        btnAgregar = (Button) findViewById(R.id.btn_agregar);

        txtNumero.setText("Residente n° " + numero);

        rgParentesco.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.capitulo200_pregunta3_radio_sp1:

                        break;
                    case R.id.capitulo200_pregunta3_radio_sp2:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp3:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp4:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp5:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp6:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp7:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp8:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp9:
                        break;
                    case R.id.capitulo200_pregunta3_radio_sp10:
                        break;
                }
            }
        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View radioButton = findViewById(rgParentesco.getCheckedRadioButtonId());
                int indice = rgParentesco.indexOfChild(radioButton);
                RadioButton buton = (RadioButton) rgParentesco.getChildAt(indice);
                Residentes.residentes.add(new ResidenteHogar(numero,edtNombres.getText().toString(),edtApellidos.getText().toString(),buton.getText().toString()));
                onBackPressed();
            }
        });
    }
}

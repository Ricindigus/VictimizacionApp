package pe.gob.inei.victimizacionapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EncuestaActivity extends AppCompatActivity {

    private Capitulo100Fragment capitulo100Fragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capitulo100Fragment = new Capitulo100Fragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,capitulo100Fragment);
        fragmentTransaction.commit();
    }
}

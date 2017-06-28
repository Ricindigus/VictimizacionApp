package pe.gob.inei.victimizacionapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class EncuestaActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ENCUESTA NACIONAL ESPECIALIZADA DE VICTIMIZACION 2017");
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                drawerLayout.closeDrawers();
                switch(item.getItemId()){
                    case R.id.opcion_cap100_1:
                        setFragment(0);
                        break;
                    case R.id.opcion_cap100_2:
                        setFragment(1);
                        break;
                    case R.id.opcion_cap200:
                        setFragment(2);
                        break;
                    case R.id.opcion_cap300_1:
                        setFragment(3);
                        break;
                    case R.id.opcion_cap300_2:
                        setFragment(4);
                        break;
                    case R.id.opcion_cap300_3:
                        setFragment(5);
                        break;
                    case R.id.opcion_cap300_4:
                        setFragment(6);
                        break;
                    case R.id.opcion_cap300_5:
                        setFragment(7);
                        break;
                    case R.id.opcion_cap300_6:
                        setFragment(8);
                        break;
                    case R.id.opcion_cap300_7:
                        setFragment(9);
                        break;
                    case R.id.opcion_cap401:
                        setFragment(10);
                        break;
                    case R.id.opcion_cap402:
                        setFragment(11);
                        break;
                    case R.id.opcion_cap500:
                        setFragment(12);
                        break;
                    case R.id.opcion_cap600:
                        setFragment(13);
                        break;
                    case R.id.opcion_cap700_1:
                        setFragment(14);
                        break;
                    case R.id.opcion_cap700_2:
                        setFragment(15);
                        break;
                    case R.id.opcion_cap700_3:
                        setFragment(16);
                        break;
                    case R.id.opcion_cap700_4:
                        setFragment(17);
                        break;
                    case R.id.opcion_cap700_5:
                        setFragment(18);
                        break;
                    case R.id.opcion_cap700_6:
                        setFragment(19);
                        break;
                }
                return false;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        setFragment(0);

    }

    public void setFragment(int pos){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (pos){
            case 0:
                Capitulo100UnoFragment capitulo100UnoFragment = new Capitulo100UnoFragment();
                fragmentTransaction.replace(R.id.container, capitulo100UnoFragment);
                break;
            case 1:
                Capitulo100DosFragment capitulo100DosFragment = new Capitulo100DosFragment();
                fragmentTransaction.replace(R.id.container, capitulo100DosFragment);
                break;
            case 2:
                Capitulo200Fragment capitulo200Fragment = new Capitulo200Fragment();
                fragmentTransaction.replace(R.id.container, capitulo200Fragment);
                break;
            case 3:
                Capitulo300UnoFragment capitulo300UnoFragment = new Capitulo300UnoFragment();
                fragmentTransaction.replace(R.id.container, capitulo300UnoFragment);
                break;
            case 4:
                Capitulo300DosFragment capitulo300DosFragment = new Capitulo300DosFragment();
                fragmentTransaction.replace(R.id.container, capitulo300DosFragment);
                break;
            case 5:
                Capitulo300TresFragment capitulo300TresFragment = new Capitulo300TresFragment();
                fragmentTransaction.replace(R.id.container, capitulo300TresFragment);
                break;
            case 6:
                Capitulo300CuatroFragment capitulo300CuatroFragment = new Capitulo300CuatroFragment();
                fragmentTransaction.replace(R.id.container, capitulo300CuatroFragment);
                break;
            case 7:
                Capitulo300CincoFragment capitulo300CincoFragment = new Capitulo300CincoFragment();
                fragmentTransaction.replace(R.id.container, capitulo300CincoFragment);
                break;
            case 8:
                Capitulo300SeisFragment capitulo300SeisFragment = new Capitulo300SeisFragment();
                fragmentTransaction.replace(R.id.container, capitulo300SeisFragment);
                break;
            case 9:
                Capitulo300SieteFragment capitulo300SieteFragment = new Capitulo300SieteFragment();
                fragmentTransaction.replace(R.id.container, capitulo300SieteFragment);
                break;
            case 10:
                Capitulo401Fragment capitulo401Fragment = new Capitulo401Fragment();
                fragmentTransaction.replace(R.id.container, capitulo401Fragment);
                break;
            case 11:
                Capitulo402Fragment capitulo402Fragment = new Capitulo402Fragment();
                fragmentTransaction.replace(R.id.container, capitulo402Fragment);
                break;
            case 12:
                Capitulo500Fragment capitulo500Fragment = new Capitulo500Fragment();
                fragmentTransaction.replace(R.id.container, capitulo500Fragment);
                break;
            case 13:
                Capitulo600Fragment capitulo600Fragment = new Capitulo600Fragment();
                fragmentTransaction.replace(R.id.container, capitulo600Fragment);
                break;
            case 14:
                Capitulo700UnoFragment capitulo700UnoFragment = new Capitulo700UnoFragment();
                fragmentTransaction.replace(R.id.container, capitulo700UnoFragment);
                break;
            case 15:
                Capitulo700DosFragment capitulo700DosFragment = new Capitulo700DosFragment();
                fragmentTransaction.replace(R.id.container, capitulo700DosFragment);
                break;
            case 16:
                Capitulo700TresFragment capitulo700TresFragment = new Capitulo700TresFragment();
                fragmentTransaction.replace(R.id.container, capitulo700TresFragment);
                break;
            case 17:
                Capitulo700CuatroFragment capitulo700CuatroFragment = new Capitulo700CuatroFragment();
                fragmentTransaction.replace(R.id.container, capitulo700CuatroFragment);
                break;
            case 18:
                Capitulo700CincoFragment capitulo700CincoFragment = new Capitulo700CincoFragment();
                fragmentTransaction.replace(R.id.container, capitulo700CincoFragment);
                break;
            case 19:
                Capitulo700SeisFragment capitulo700SeisFragment = new Capitulo700SeisFragment();
                fragmentTransaction.replace(R.id.container, capitulo700SeisFragment);
                break;
        }
        fragmentTransaction.commit();
    }
}

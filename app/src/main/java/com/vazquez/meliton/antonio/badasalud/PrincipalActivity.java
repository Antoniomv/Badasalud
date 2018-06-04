package com.vazquez.meliton.antonio.badasalud;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.vazquez.meliton.antonio.badasalud.Fragmentos.HospitalFragment;

public class PrincipalActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, HospitalFragment.OnFragmentInteractionListener {

    TextView titulo, emailTitulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        titulo = findViewById(R.id.menu_titulo);
//        emailTitulo = findViewById(R.id.menu_email);
//
//        Intent intent = getIntent();
//        String tituloPrincipal = intent.getStringExtra("nombre");
//        String emailPrincipal = intent.getStringExtra("email");
//
//        titulo.setText(tituloPrincipal);
//        emailTitulo.setText(emailPrincipal);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_citas) {
            cargarCitas();
        } else if (id == R.id.nav_hospitales) {
            cargarHospitales();
        } else if (id == R.id.nav_panel) {
            cargarPanel();
        } else if (id == R.id.nav_desarrollador) {
            cargarDesarrollador();
        }else if (id == R.id.nav_cerrar) {
            cargarCerrar();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void cargarCerrar() {

        
    }

    private void cargarDesarrollador() {


    }

    private void cargarPanel() {


    }

    private void cargarCitas() {


    }

    private void cargarHospitales() {
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        HospitalFragment hospitalFragment = new HospitalFragment();
//        fragmentTransaction.add(R.id.fragment_principal, hospitalFragment);
//        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
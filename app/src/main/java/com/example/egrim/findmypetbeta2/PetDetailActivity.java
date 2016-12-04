package com.example.egrim.findmypetbeta2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PetDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Pet mascota = (Pet)getIntent().getExtras().getSerializable("SelectPet");
        TextView nombre = (TextView) this.findViewById(R.id.coordenadas);
        if (nombre != null)
            nombre.setText(mascota.getComentario());

        TextView coordenadas = (TextView) this.findViewById(R.id.coordenadas);
        if (coordenadas != null)
            coordenadas.setText(mascota.getNombre());

        TextView direccion = (TextView) this.findViewById(R.id.direccion);
        if (direccion != null)
            direccion.setText(mascota.getTipo_animal());

        ImageView image = (ImageView) this.findViewById(R.id.imageView2);
        if (image != null)
            image.setImageResource(mascota.getId_imagen());

    }

}

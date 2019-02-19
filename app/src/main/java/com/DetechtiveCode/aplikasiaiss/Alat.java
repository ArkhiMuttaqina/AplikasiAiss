package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Alat extends AppCompatActivity {
    ImageButton kolintang, gambus, aramba, saluang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat);
        kolintang = findViewById(R.id.kolintang);
        gambus = findViewById(R.id.gambus);
        aramba = findViewById(R.id.aramba);
        saluang = findViewById(R.id.saluang);

        kolintang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,mkolintang.class);
                startActivity(goToX);
                Alat.this.onDestroy();
            }
        });
        gambus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,mgambus.class);
                startActivity(goToX);
                Alat.this.onDestroy();
            }
        });
        aramba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,maramba.class);
                startActivity(goToX);
                Alat.this.onDestroy();
            }
        });
        saluang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,msaluang.class);
                startActivity(goToX);
                Alat.this.onDestroy();
            }
        });
    }
}

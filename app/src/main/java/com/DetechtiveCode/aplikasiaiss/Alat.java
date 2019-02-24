package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Alat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat);
        ImageButton kolintang = findViewById(R.id.kolintang);
        ImageButton gambus = findViewById(R.id.gambus);
        ImageButton aramba = findViewById(R.id.aramba);
        ImageButton saluang = findViewById(R.id.saluang);

        kolintang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,mkolintang.class);
                startActivity(goToX);
                Alat.this.onPause();
            }
        });
        gambus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,mgambus.class);
                startActivity(goToX);
                Alat.this.onPause();
            }
        });
        aramba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,maramba.class);
                startActivity(goToX);
                Alat.this.onPause();
            }
        });
        saluang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(Alat.this,msaluang.class);
                startActivity(goToX);
                Alat.this.onPause();
            }
        });
    }
}

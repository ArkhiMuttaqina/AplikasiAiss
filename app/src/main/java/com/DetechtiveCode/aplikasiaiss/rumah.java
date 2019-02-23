package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class rumah extends AppCompatActivity {
    private ImageButton waleng;
    private ImageButton kebaya;
    private ImageButton gadang;
    private ImageButton salaso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah);
        waleng = findViewById(R.id.waleng);
        kebaya = findViewById(R.id.kebaya);
        gadang = findViewById(R.id.gadang);
        salaso = findViewById(R.id.salaso);

        waleng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(rumah.this,mwawangko.class);
                startActivity(goToX);
                rumah.this.onPause();
            }
        });
        kebaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(rumah.this,mkebaya.class);
                startActivity(goToX);
                rumah.this.onPause();
            }
        });
        gadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(rumah.this,mgadang.class);
                startActivity(goToX);
                rumah.this.onPause();
            }
        });
        salaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(rumah.this,msalaso.class);
                startActivity(goToX);
                rumah.this.onPause();
            }
        });
    }
}

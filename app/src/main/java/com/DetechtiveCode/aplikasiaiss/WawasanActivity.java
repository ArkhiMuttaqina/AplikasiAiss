package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class WawasanActivity extends AppCompatActivity {
    private ImageButton menuAlat;
    private ImageButton menuTari;
    private ImageButton menuSuku;
    private ImageButton menuRumah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wawasan);
        menuAlat = findViewById(R.id.menuAlat);
        menuTari = findViewById(R.id.menuTari);
        menuSuku = findViewById(R.id.menuSuku);
        menuRumah = findViewById(R.id.menuRumah);

        menuAlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,Alat.class);
                startActivity(goToX);
               WawasanActivity.this.onPause();
            }
        });

        menuTari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,tari.class);
                startActivity(goToX);
                WawasanActivity.this.onPause();
            }
        });
        menuSuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,suku.class);
                startActivity(goToX);
                WawasanActivity.this.onPause();
            }
        });
        menuRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,rumah.class);
                startActivity(goToX);
                WawasanActivity.this.onPause();
            }
        });
    }
}

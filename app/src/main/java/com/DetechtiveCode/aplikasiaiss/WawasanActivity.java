package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class WawasanActivity extends AppCompatActivity {
    ImageButton menuAlat,menuTari,menuSuku,menuRumah;
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
               WawasanActivity.this.onDestroy();
            }
        });

        menuTari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,tari.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
        menuSuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,suku.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
        menuRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(WawasanActivity.this,rumah.class);
                startActivity(goToX);
                WawasanActivity.this.onDestroy();
            }
        });
    }
}

package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class WawasanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wawasan);
        ImageButton menuAlat = findViewById(R.id.menuAlat);
        ImageButton menuTari = findViewById(R.id.menuTari);
        ImageButton menuSuku = findViewById(R.id.menuSuku);
        ImageButton menuRumah = findViewById(R.id.menuRumah);

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

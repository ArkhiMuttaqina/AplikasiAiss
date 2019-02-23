package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class suku extends AppCompatActivity {
    private ImageButton jawa;
    private ImageButton baduy;
    private ImageButton madura;
    private ImageButton sunda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suku);
        jawa = findViewById(R.id.jawa);
        baduy = findViewById(R.id.baduy);
        madura = findViewById(R.id.madura);
        sunda = findViewById(R.id.sunda);

        jawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(suku.this,mjawa.class);
                startActivity(goToX);
                suku.this.onPause();
            }
        });
        baduy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(suku.this,mbaduy.class);
                startActivity(goToX);
                suku.this.onPause();
            }
        });
        madura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(suku.this,mmadura.class);
                startActivity(goToX);
                suku.this.onPause();
            }
        });
        sunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(suku.this,msunda.class);
                startActivity(goToX);
                suku.this.onPause();
            }
        });
    }
}

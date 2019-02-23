package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class tari extends AppCompatActivity {
    private ImageButton guel;
    private ImageButton barong;
    private ImageButton topeng;
    private ImageButton inai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari);
        inai = findViewById(R.id.inai);
        guel = findViewById(R.id.guel);
        topeng = findViewById(R.id.topeng);
        barong = findViewById(R.id.barong);

        inai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(tari.this,minai.class);
                startActivity(goToX);
                tari.this.onPause();
            }
        });
        guel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(tari.this,mguel.class);
                startActivity(goToX);
                tari.this.onPause();
            }
        });
        topeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(tari.this,mtopeng.class);
                startActivity(goToX);
                tari.this.onPause();
            }
        });
        barong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(tari.this,mbarong.class);
                startActivity(goToX);
                tari.this.onPause();
            }
        });

    }
}

package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kami);
        ImageButton kusis = findViewById(R.id.kusis);
        kusis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDana = new Intent(kami.this, MainMenuActivity.class);
                startActivity(goToDana);
                kami.this.onPause();
            }
        });
    }

}

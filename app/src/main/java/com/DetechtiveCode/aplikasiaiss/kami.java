package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class kami extends AppCompatActivity {
    private long back_pressed = 0;
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
                kami.this.finish();
            }
        });
    }
    public void onBackPressed(){
        Toast.makeText(this, "Beri Tahu Keteman Teman", Toast.LENGTH_SHORT).show();
        if (back_pressed + 800 > System.currentTimeMillis()){
            super.onBackPressed();
        }
        else{
            Toast.makeText(getBaseContext(),
                    "Tekan sekali lagi", Toast.LENGTH_LONG)
                    .show();
        }
        back_pressed = System.currentTimeMillis();
    }
}

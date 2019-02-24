package com.DetechtiveCode.aplikasiaiss;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ImageButton cvQuiz = findViewById(R.id.cvQuiz);
        ImageButton cvKesempatan = findViewById(R.id.cvKesempatan);
        ImageButton cvWawasan = findViewById(R.id.cvWawasan);
        ImageButton cvDana = findViewById(R.id.cvDana);
        TextView yo = findViewById(R.id.yo);

        cvQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz = new Intent(MainMenuActivity.this, QuizActivity.class);
                startActivity(goToQuiz);
                MainMenuActivity.this.onPause();

            }
        });
        cvKesempatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToKesempatan = new Intent(MainMenuActivity.this, KesempatanActivity.class);
                startActivity(goToKesempatan);
                MainMenuActivity.this.onPause();
            }
        });
        cvWawasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWawasan = new Intent(MainMenuActivity.this, WawasanActivity.class);
                startActivity(goToWawasan);
                MainMenuActivity.this.onPause();
            }
        });
        cvDana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDana = new Intent(MainMenuActivity.this, DanaActivity.class);
                startActivity(goToDana);
                MainMenuActivity.this.onPause();
            }
        });
        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDana = new Intent(MainMenuActivity.this, kami.class);
                startActivity(goToDana);
                MainMenuActivity.this.onPause();
            }
        });
    }
    }

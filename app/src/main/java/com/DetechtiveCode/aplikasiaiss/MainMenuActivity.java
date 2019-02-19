package com.DetechtiveCode.aplikasiaiss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainMenuActivity extends AppCompatActivity {
    ImageButton CvQuiz,CvKesempatan,CvWawasan, CvDana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        CvQuiz = findViewById(R.id.cvQuiz);
        CvKesempatan = findViewById(R.id.cvKesempatan);
        CvWawasan = findViewById(R.id.cvWawasan);
        CvDana = findViewById(R.id.cvDana);

        CvQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz = new Intent(MainMenuActivity.this,QuizActivity.class);
                startActivity(goToQuiz);
                MainMenuActivity.this.onDestroy();

            }
        });

        CvKesempatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToKesempatan = new Intent(MainMenuActivity.this,KesempatanActivity.class);
                startActivity(goToKesempatan);
                MainMenuActivity.this.onDestroy();
            }
        });
        CvWawasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWawasan = new Intent(MainMenuActivity.this,WawasanActivity.class);
                startActivity(goToWawasan);
                MainMenuActivity.this.onDestroy();
            }
        });
        CvDana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDana = new Intent(MainMenuActivity.this,DanaActivity.class);
                startActivity(goToDana);
                MainMenuActivity.this.onDestroy();
            }
        });
    }
}

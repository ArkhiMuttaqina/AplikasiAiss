package com.DetechtiveCode.aplikasiaiss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.app.Dialog;

public class MainMenuActivity extends AppCompatActivity {
    private ImageButton kuy;
    private ImageButton CvQuiz;
    private ImageButton CvKesempatan;
    private ImageButton CvWawasan;
    private ImageButton CvDana;
    private Dialog poppop;

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
        poppop = new Dialog(this);

        @Override
        public void ShowPopup(View v) {
            ImageButton kuy;
            poppop.setContentView(R.layout.poppo);
            kuy = (ImageButton) poppop.findViewById(R.id.kuy);
            kuy.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    poppop.dismiss();
                }
            });
            poppop.getWindow();
            poppop.show();
            }

        CvQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToQuiz = new Intent(MainMenuActivity.this,QuizActivity.class);
                startActivity(goToQuiz);
                MainMenuActivity.this.onPause();

            }
        });
        CvKesempatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToKesempatan = new Intent(MainMenuActivity.this,KesempatanActivity.class);
                startActivity(goToKesempatan);
                MainMenuActivity.this.onPause();
            }
        });
        CvWawasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWawasan = new Intent(MainMenuActivity.this,WawasanActivity.class);
                startActivity(goToWawasan);
                MainMenuActivity.this.onPause();
            }
        });
        CvDana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDana = new Intent(MainMenuActivity.this,DanaActivity.class);
                startActivity(goToDana);
                MainMenuActivity.this.onPause();
            }
        });

    }
}

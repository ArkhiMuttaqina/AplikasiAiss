package com.DetechtiveCode.aplikasiaiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {

    TextView tvKuis;
    ImageButton btnKuis;
    String[] pertanyaan;
    private ArrayList<Integer> urutan = new ArrayList<>();
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvKuis = findViewById(R.id.tvResultKuis);
        btnKuis = findViewById(R.id.btnKuis);
        initQuiz();
        btnKuis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(i>pertanyaan.length){
                    tvKuis.setText(pertanyaan[urutan.get(i)]);
                    i++;
                }
                if(i==pertanyaan.length){
                    Collections.shuffle(urutan);
                    i=0;
                }
            }
        });

    }
    private void initQuiz () {
        pertanyaan = getResources().getStringArray(R.array.ArrayKuis);
        for (int id = 0; id < pertanyaan.length; id++) {
            urutan.add(id);
            Collections.shuffle(urutan);
        }
    }
}

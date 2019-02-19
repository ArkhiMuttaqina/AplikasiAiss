package com.DetechtiveCode.aplikasiaiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class DanaActivity extends AppCompatActivity {
    String[] Dana;
    private ArrayList<Integer> ind_tag;
    ImageButton cvRandomDana;
    TextView tvResultDana;
    TextView tv_cvRandomDana;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dana);
        cvRandomDana = findViewById(R.id.cvDana);
        tv_cvRandomDana = findViewById(R.id.tv_cvRandomDana);
        tvResultDana = findViewById(R.id.tvResultDana);
        initData();
        cvRandomDana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<Dana.length) {
                    tv_cvRandomDana.setText("Ambil");
                    tvResultDana.setText(Dana[ind_tag.get(i)]);
                    i++;
                }

                if(i==Dana.length){
                    tv_cvRandomDana.setText("Kocok");

                    tvResultDana.setText("");
                    for (int id = 0; id<Dana.length; id++){
                        Collections.shuffle(ind_tag);
                    }

                    i=0;

                }
            }
        });

    }

    private void initData(){
        Dana = getResources().getStringArray(R.array.ArrayDana);
        ArrayList<Integer> ind_tag = new ArrayList<>();
        for (int id = 0; id<Dana.length; id++){
            ind_tag.add(id);
            Collections.shuffle(ind_tag);
        }


        this.ind_tag=ind_tag;
    }
}

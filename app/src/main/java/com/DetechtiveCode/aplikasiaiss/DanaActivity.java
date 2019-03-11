package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class DanaActivity extends AppCompatActivity {
    private long mLastClickTime = 0;
    private  long back_pressed;
    private String[] Dana;
    private ArrayList<Integer> ind_tag;
    private TextView tvResultDana;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dana);
        ImageButton cvRandomDana = findViewById(R.id.cvRandomDana);
        tvResultDana = findViewById(R.id.tvResultDana);
        initData();
        cvRandomDana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 10000){
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                if(i<Dana.length) {
                    tvResultDana.setText(Dana[ind_tag.get(i)]);
                    i++;
                }

                if(i==Dana.length){
                    i++;
                }

                if(i>Dana.length){

                    tvResultDana.setText("Kartu habis. Saatnya untuk mengocok ulang kartu");

                    for (String Dana : Dana) {
                        Collections.shuffle(ind_tag);
                    }

                    i=0;
                }
            }
        });

    }
    public void onBackPressed(){
        Toast.makeText(this, "Beri Tahu Keteman Teman", Toast.LENGTH_SHORT).show();
        if (back_pressed + 800 > System.currentTimeMillis()){
            super.onBackPressed();
            DanaActivity.this.finish();
        }
        else{
            Toast.makeText(getBaseContext(),
                    "Tekan sekali Lagi", Toast.LENGTH_SHORT)
                    .show();
        }
        back_pressed = System.currentTimeMillis();
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

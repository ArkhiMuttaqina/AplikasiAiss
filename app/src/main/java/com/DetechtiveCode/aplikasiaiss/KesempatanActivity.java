package com.DetechtiveCode.aplikasiaiss;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class KesempatanActivity extends AppCompatActivity {
    private long mLastClickTime = 0;
    private  long back_pressed = 0;
    private String[] Kesempatan;
    private ArrayList<Integer> ind_tag;
    private TextView tvResultKesempatan;
                private int i=0;
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_kesempatan);
                    ImageButton cvRandomKesempatan = findViewById(R.id.cvRandomKesempatan);
                    tvResultKesempatan = findViewById(R.id.tvResultKesempatan);
                    initData();
                    cvRandomKesempatan.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (SystemClock.elapsedRealtime() - mLastClickTime < 10000){
                                return;
                            }
                            mLastClickTime = SystemClock.elapsedRealtime();
                            if(i<Kesempatan.length) {
                                tvResultKesempatan.setText(Kesempatan[ind_tag.get(i)]);
                                i++;
                            }

                            if(i==Kesempatan.length){
                                i++;
                            }

                            if(i>Kesempatan.length){

                                tvResultKesempatan.setText("Kartu habis. Saatnya untuk mengocok ulang kartu");

                                for (String Kesempatan : Kesempatan) {
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
            KesempatanActivity.this.finish();
        }
        else{
            Toast.makeText(getBaseContext(),
                    "Tunggu 10 Detik atau Kembali", Toast.LENGTH_LONG)
                    .show();
        }
        back_pressed = System.currentTimeMillis();
    }
    private void initData(){
        Kesempatan = getResources().getStringArray(R.array.ArrayKesempatan);
        ArrayList<Integer> ind_tag = new ArrayList<>();
        for (int id = 0; id<Kesempatan.length; id++){
            ind_tag.add(id);
            Collections.shuffle(ind_tag);
        }


        this.ind_tag=ind_tag;
    }


}

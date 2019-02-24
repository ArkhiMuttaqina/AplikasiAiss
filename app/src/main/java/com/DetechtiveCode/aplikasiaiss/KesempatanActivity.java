package com.DetechtiveCode.aplikasiaiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class KesempatanActivity extends AppCompatActivity {

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

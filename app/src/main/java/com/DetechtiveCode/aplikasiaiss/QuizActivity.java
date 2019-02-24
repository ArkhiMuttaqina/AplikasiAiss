package com.DetechtiveCode.aplikasiaiss;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    RadioGroup mrgPilihanJawaban;
    ImageButton kusi,tutup;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3;
    public  TextView tvKuis;
    public String jawaban;
    public SoalPilihanGanda pertanyaan = new SoalPilihanGanda();
    public int pertanyaanlength = pertanyaan.pertanyaan.length;
    Random r;
    Dialog Dialogku, Dialognya;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        r = new Random();
        mrgPilihanJawaban = findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = findViewById(R.id.rbPilihanJawaban3);
        ImageButton btncekcek = findViewById(R.id.btncekcek);
        ImageButton kusi = findViewById(R.id.kusi);
        ImageButton tutup = findViewById(R.id.tutup);
        Dialogku = new Dialog(this);
        cekJawaban();
        Dialognya = new Dialog(this);
        Dialognya.setContentView(R.layout.dialogslh);
        Dialogku.setContentView(R.layout.dialogbenar);
        tvKuis = findViewById(R.id.tvResultKuis);
        updatePertanyaan(r.nextInt(pertanyaanlength));
        ImageButton btnKuis = findViewById(R.id.btnKuis);
        btncekcek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }

        });
    }

    public void cekJawaban(){
        if(mrbPilihanJawaban1.isChecked()){ //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban1.getText()==(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                kusi = Dialogku.findViewById(R.id.kusi);
                kusi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialogku.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialogku.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialogku.show();
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                tutup = Dialognya.findViewById(R.id.tutup);
                tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialognya.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialognya.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialognya.show();
            }
        }else if(mrbPilihanJawaban2.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban2.getText()==(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                Dialogku.setContentView(R.layout.dialogbenar);
                kusi = Dialogku.findViewById(R.id.kusi);
                kusi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialogku.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialogku.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialogku.show();
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                tutup = Dialognya.findViewById(R.id.tutup);
                tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialognya.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialognya.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialognya.show();
            }
        }else if(mrbPilihanJawaban3.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban3.getText()==(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                Dialogku.setContentView(R.layout.dialogbenar);
                kusi = Dialogku.findViewById(R.id.kusi);
                kusi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialogku.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialogku.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialogku.show();
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                tutup = Dialognya.findViewById(R.id.tutup);
                tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialognya.dismiss();
                        Intent goToX = new Intent(QuizActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialognya.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Dialognya.show();
            }
        }else{
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
    private void updatePertanyaan(int num) {
        tvKuis.setText(pertanyaan.getPertanyaan(num));
        mrbPilihanJawaban1.setText(pertanyaan.getPilihanJawaban1(num));
        mrbPilihanJawaban2.setText(pertanyaan.getPilihanJawaban2(num));
        mrbPilihanJawaban3.setText(pertanyaan.getPilihanJawaban3(num));
        jawaban = pertanyaan.getJawabanBenar(num);
    }

}

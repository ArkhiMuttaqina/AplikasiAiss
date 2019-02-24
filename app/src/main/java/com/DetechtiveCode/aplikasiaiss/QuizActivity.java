package com.DetechtiveCode.aplikasiaiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3;
    private TextView tvKuis;
    private String jawabanBenar;
    private SoalPilihanGanda pertanyaan = new SoalPilihanGanda();
    private int pertanyaanlength = pertanyaan.pertanyaan.length;
    Random r;
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
        tvKuis = findViewById(R.id.tvResultKuis);
        ImageButton btnKuis = findViewById(R.id.btnKuis);
        btnKuis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
    }

    public void cekJawaban(){
        if(mrbPilihanJawaban1.isChecked()){ //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban1.getText().toString().equals(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten();
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban2.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban2.getText().toString().equals(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban3.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban3.getText().toString().equals(jawaban)){
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(this, "Mau Kemana ?, ayo pilih jawaban terlebih dahulu sebelum jalan", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan Pertanyaan sebelum melanjutkan permainan", Toast.LENGTH_SHORT).show();
    }

    private void setKonten() {
    }
}


package com.DetechtiveCode.aplikasiaiss;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ViewPagerActivity extends AppCompatActivity {
    private ImageButton selanjut;
    private int dot_count;
    private ImageView[] dots;
     Dialog Dialogku;
     RelativeLayout popoub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        ViewPager viewPager = findViewById(R.id.pager);
        selanjut = findViewById(R.id.selanjut);
        Dialogku = new Dialog(this, android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen
        );
        LinearLayout slider_dots = findViewById(R.id.slider_dots);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        dot_count = adapter.getCount();
        dots = new ImageView[dot_count];

        for(int i=0;i<dot_count;i++){
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8,0,8,0);

            slider_dots.addView(dots[i],params);
            selanjut.setVisibility(View.INVISIBLE);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                              @Override
                                              public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                              }

                                              @Override
                                              public void onPageSelected(int position) {
                                                  for (int i = 0; i < dot_count; i++) {
                                                      dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                                                  }
                                                  dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
                                                  if (position == dots.length - 1) {
                                                      selanjut.setVisibility(View.VISIBLE);
                                                  } else {
                                                      selanjut.setVisibility(View.GONE);
                                                  }
                                              }



                                              @Override
                                              public void onPageScrollStateChanged(int state) {

                                              }
                                          });
        selanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogku.setContentView(R.layout.poppo);
                ImageButton Kusy;
                Kusy = Dialogku.findViewById(R.id.kuy);
                Kusy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Dialogku.dismiss();
                        Intent goToX = new Intent(ViewPagerActivity.this,MainMenuActivity.class);
                        startActivity(goToX);
                    }
                });
                Dialogku.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
                Dialogku.show();

            }
        });
    }

}

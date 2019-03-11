package com.DetechtiveCode.aplikasiaiss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class caranya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caranya);
        TextView newtext = findViewById(R.id.oyi);
        newtext.setMovementMethod(LinkMovementMethod.getInstance());
        newtext.setText(Html.fromHtml(getString(R.string.html)));
    }
}

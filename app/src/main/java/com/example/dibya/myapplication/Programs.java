package com.example.dibya.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

public class Programs extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        Toolbar tb = (Toolbar) findViewById(R.id.tb_committee);
        setSupportActionBar(tb);

        tb.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setTitle("Program");
        t= (TextView) findViewById(R.id.programtext);
        t.setText(Html.fromHtml("              The resource persons in this workshop will be a mix of industry professionals and senior academic researchers who will present the cutting edge work on UCG. The speakers will include some of the key global and Indian experts in the area, who bring-in with them their expertise which spans decades of professional experience and understanding of real-world challenges in the mining and fuel industry. For instance, Dr. Michael S. Blinderman, Director (Operations), Ergo Exergy Technologies Inc, Canada, and a globally renowned expert in UCG has agreed to deliver the plenary lecture at this event. Scientists from CSIR-CIMFR have been important stakeholders for UCG in India, with their role in preparing important reports under the aegis of the Office of the Principal Scientific Advisor to the Government of India and the Technology Information, Forecasting and Assessment Council (TIFAC). CSIR-CIMFR also recently completed a major S&T project on UCG funded by the Department of Electronics and Information Technology, Government of India. In total, the event will provide an excellent platform for deliberations on UCG, and its scope in India. We are also in talks with international publishing houses for publication of the lecture notes of the event."));
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Charter.ttf");
        t.setTypeface(myTypeface);
    }
}

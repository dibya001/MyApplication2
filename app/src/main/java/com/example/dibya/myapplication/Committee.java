package com.example.dibya.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

public class Committee extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        Toolbar tb = (Toolbar) findViewById(R.id.tb_committee);
        setSupportActionBar(tb);

        tb.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setTitle("Organizers");
    }

}

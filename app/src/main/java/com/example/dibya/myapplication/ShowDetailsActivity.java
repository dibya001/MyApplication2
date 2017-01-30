package com.example.dibya.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class ShowDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        Toolbar tb= (Toolbar) findViewById(R.id.tbdetails);
        setSupportActionBar(tb);

        Intent i = getIntent();
        int pos = i.getIntExtra("id", -1);
        String title=getResources().getStringArray(R.array.guest_name)[pos];
        setTitle(title);
        tb.setTitleTextColor(Color.WHITE);
        TextView txt = (TextView) findViewById(R.id.guestdetails);

        if (pos != -1) {
            String p = getResources().getStringArray(R.array.guest_details)[pos];
            txt.setText(p);
            Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Charter.ttf");
            txt.setTypeface(myTypeface);

        }
    }
}

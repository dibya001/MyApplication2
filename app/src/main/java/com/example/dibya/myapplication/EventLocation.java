package com.example.dibya.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EventLocation extends AppCompatActivity {

    ImageView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_location);
        map= (ImageView) findViewById(R.id.map);
        Toolbar tb= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        setTitle("Location");
        tb.setTitleTextColor(Color.WHITE);
        TextView tx= (TextView) findViewById(R.id.loctext);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "Charter.ttf");
        tx.setTypeface(myTypeface);
        FloatingActionButton fab= (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float lat = 28.610821f;
                float lng = 77.2205578f;

                String maplLabel = "Maulana Azad Rd ";
//                final Intent intent = new Intent(Intent.ACTION_VIEW,
//                        Uri.parse("geo:0,0?q="+lat+","+lng+"&z=16 (" + maplLabel + ")"));
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q="+"Maulana Azad Rd" +
                                "\nSouth Block, Man Singh Road Area\nNew Delhi, Delhi 110001"));
                startActivity(intent);
            }
        });
    }
}

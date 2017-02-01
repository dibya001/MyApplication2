package com.example.dibya.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class EventPhotos extends AppCompatActivity implements View.OnClickListener {

    ImageView a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_photos);

        Toolbar tb= (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        tb.setTitleTextColor(Color.WHITE);
        setTitle("Event Photos");
        a= (ImageView) findViewById(R.id.cv1);
        b= (ImageView) findViewById(R.id.cv2);

        c= (ImageView) findViewById(R.id.cv3);
        d= (ImageView) findViewById(R.id.cv4);
        e=(ImageView) findViewById(R.id.cv5);
        f=(ImageView) findViewById(R.id.cv6);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId())
        {
            case R.id.cv1:
                i=new Intent(this,ShowImage.class);
                i.putExtra("no","1");
                startActivity(i);
            break;
            case R.id.cv2:

                i=new Intent(this,ShowImage.class);
                i.putExtra("no","2");
                startActivity(i);
                break;
            case R.id.cv3:

                i=new Intent(this,ShowImage.class);
                i.putExtra("no","3");
                startActivity(i);
                break;
            case R.id.cv4:

                i=new Intent(this,ShowImage.class);
                i.putExtra("no","4");
                startActivity(i);
                break;
            case R.id.cv5:

                i=new Intent(this,ShowImage.class);
                i.putExtra("no","5");
                startActivity(i);
                break;
            case R.id.cv6:

                i=new Intent(this,ShowImage.class);
                i.putExtra("no","6");
                startActivity(i);
                break;

        }
    }
}

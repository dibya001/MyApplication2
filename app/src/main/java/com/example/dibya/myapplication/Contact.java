package com.example.dibya.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    ImageView c1, m1, c2, m2;
int PERMISSION_REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar tb= (Toolbar) findViewById(R.id.tbdetails);
        setSupportActionBar(tb);
        tb.setTitleTextColor(Color.WHITE);
        tb.setTitle("Contact");
        c1 = (ImageView) findViewById(R.id.call1);

        c2 = (ImageView) findViewById(R.id.call2);

        m1 = (ImageView) findViewById(R.id.mail1);

        m2 = (ImageView) findViewById(R.id.mail2);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+913262296023"));

                startActivity(Intent.createChooser(callIntent, ""));

            }
        });


        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+913262296007 "));

                startActivity(Intent.createChooser(callIntent, ""));

            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/html");
                intent.setData(Uri.parse("mailto:dcmrips@yahoo.co.in"));
                startActivity(intent);

            }
        });


        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/html");
                intent.setData(Uri.parse("mailto:ajay.cimfr@gmail.com"));
              //  intent.putExtra(Intent.EXTRA_EMAIL, "ajay.cimfr@gmail.com");
                startActivity(intent);

            }
        });

    }
}

package com.example.dibya.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb= (Toolbar) findViewById(R.id.tbdetails);
        setSupportActionBar(tb);
        tb.setTitleTextColor(Color.WHITE);
        btn1= (TextView) findViewById(R.id.btn1);
        btn2= (TextView) findViewById(R.id.btn2);
        btn3= (TextView) findViewById(R.id.btn3);
        btn4= (TextView) findViewById(R.id.btn4);
        btn5= (TextView) findViewById(R.id.btn5);
        btn6= (TextView) findViewById(R.id.btn6);
        btn7= (TextView) findViewById(R.id.btn7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId())
        {
            case R.id.btn1:
                i=new Intent(this,Programs.class);
                startActivity(i);


                break;

            case R.id.btn2:
                Intent j=new Intent(this,TimeLineActivity.class);
                startActivity(j);
                break;

            case R.id.btn3:
                 i=new Intent(this,GuestActivity.class);
                startActivity(i);
                break;

            case R.id.btn4:
                i=new Intent(this,Committee.class);
                startActivity(i);


                break;

            case R.id.btn5:
                 i=new Intent(this,EventLocation.class);
                startActivity(i);

                break;

            case R.id.btn6:
                i=new Intent(this,EventPhotos.class);
                startActivity(i);

                break;

            case R.id.btn7:
                 i=new Intent(this,Contact.class);
                startActivity(i);
                break;
        }

    }
}

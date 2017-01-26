package com.example.dibya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowImage extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        img= (ImageView) findViewById(R.id.img123);

        Intent i=getIntent();
        String s=i.getStringExtra("no");
        if(s.equals("1"))
            img.setImageResource(R.drawable.pic13);
       else  if(s.equals("2"))
            img.setImageResource(R.drawable.pic14);
        else  if(s.equals("3"))
            img.setImageResource(R.drawable.pic14);
        else
            img.setImageResource(R.drawable.pic16);


    }
}

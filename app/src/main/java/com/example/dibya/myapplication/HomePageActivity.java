package com.example.dibya.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.FadeInAnimator;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;

public class HomePageActivity extends AppCompatActivity {
    TestAdapter rcAdapter;
    RecyclerView rc;
    ArrayList<String> details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar tb= (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        tb.setTitleTextColor(Color.WHITE);
        rc= (RecyclerView) findViewById(R.id.rc);
        setData();
        rcAdapter = new TestAdapter(this,details);

        makegrid();
      //  rc.setItemAnimator(new FadeInAnimator());
        //fetch();
    }

    private void setData() {
        details=new ArrayList<>();
        details.add("Program");
        details.add("Session");
        details.add("Speakers");
        details.add("Organizers");
        details.add("Location");
        details.add("Event Photos");
        details.add("Contact");


    }

    private void makegrid() {
        GridLayoutManager lLayout = new GridLayoutManager(this,2);
        rc.setHasFixedSize(true);

        rc.setLayoutManager(lLayout);

        rc.setAdapter(rcAdapter);

    }

}

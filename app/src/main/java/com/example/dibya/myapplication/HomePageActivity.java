package com.example.dibya.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

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
        //fetch();
    }

    private void setData() {
        details=new ArrayList<>();
        details.add("program");
        details.add("session");
        details.add("speakers");
        details.add("organizers");
        details.add("location");
        details.add("event photos");
        details.add("contact");


    }

    private void makegrid() {
        GridLayoutManager lLayout = new GridLayoutManager(this,2);
        rc.setHasFixedSize(true);

        rc.setLayoutManager(lLayout);

        rc.setAdapter(rcAdapter);

    }

}

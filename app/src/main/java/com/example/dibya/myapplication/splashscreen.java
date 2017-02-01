package com.example.dibya.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


       new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will startDetails the Menu-Activity. */
                Intent mainIntent = new Intent(splashscreen.this,HomePageActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 2000);
    }
}

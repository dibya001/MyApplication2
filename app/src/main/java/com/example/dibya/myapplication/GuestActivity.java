package com.example.dibya.myapplication;
import android.content.DialogInterface;
        import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
        import android.support.design.widget.Snackbar;
        import android.support.v4.widget.SwipeRefreshLayout;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.Toolbar;
        import android.util.Log;
        import android.view.View;
        import android.widget.ProgressBar;


        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;

public class GuestActivity extends AppCompatActivity {

    LinearLayoutManager lLayout;

    RecyclerView recyclerView;
    ArrayList<Guest> guest;
    RecyclerViewAdapter rcAdapter;
    String category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        Toolbar tb= (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle("Speakers");
        tb.setTitleTextColor(Color.WHITE);

        guest = new ArrayList<>();
        category=getIntent().getStringExtra("category");
        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        setData();
        rcAdapter = new RecyclerViewAdapter(this, guest,category);
        makegrid();
        //fetch();

    }

    private void setData() {
            String[] mystring=getResources().getStringArray(R.array.guest_name);
                    for(int i=0;i<12;i++)
                    {
                        Guest g=new Guest();
                        //int z=i+2;
                       // Uri z=Uri.parse("R.drawable."+"pic"+(i+2));
                        int img=0;
                        if (i<10)
                             img=getResources().getIdentifier("pic"+(i+2),"drawable",getPackageName());
                        else if (i>=10)
                            img=getResources().getIdentifier("pic"+(i+9),"drawable",getPackageName());
                        g.setImage(img);
                        g.setName(mystring[i]);
                        guest.add(g);

                    }
    }

    private void makegrid() {
        lLayout = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(lLayout);

        recyclerView.setAdapter(rcAdapter);

    }


}

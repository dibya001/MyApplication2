package com.example.dibya.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dibya on 30-Jan-17.
 */

public class TestAdapter  extends RecyclerView.Adapter<TestAdapter.MyViewHolder>{
    Context ctx;
    ArrayList<String> details;
    public TestAdapter(HomePageActivity ctx, ArrayList<String> details)
    {
        this.ctx=ctx;
        this.details=details;
    }
    @Override
    public TestAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom, parent, false);
        //layoutView.setMinimumHeight(parent.getMeasuredHeight() / 2);
     TestAdapter.MyViewHolder rcv = new TestAdapter.MyViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(TestAdapter.MyViewHolder holder, int position) {
        holder.tx.setText(details.get(position));
        int img=ctx.getResources().getIdentifier("xyz"+(position),"drawable",ctx.getPackageName());
        holder.img.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return details.size();
    }
    public void start(final int pos) {
        Intent i=null;
        switch (pos) {
            case 0:
                i = new Intent(ctx, Programs.class);
                break;
            case 1:
                i = new Intent(ctx, TimeLineActivity.class);
                break;
            case 2:
                i = new Intent(ctx, GuestActivity.class);
                break;
            case 3:
                i = new Intent(ctx, Committee.class);
                break;
            case 4:
                i = new Intent(ctx,EventLocation.class);
                break;
            case 5:
                i = new Intent(ctx, EventPhotos.class);
                break;
            case 6:
                i = new Intent(ctx, Contact.class);
                break;


        }
        if(i!=null)
        ctx.startActivity(i);


    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tx;
        ImageView img;
        LinearLayout ll;
        public MyViewHolder(View itemView) {
            super(itemView);
            tx= (TextView) itemView.findViewById(R.id.tex);
            img= (ImageView) itemView.findViewById(R.id.img);
            ll= (LinearLayout) itemView.findViewById(R.id.click);
            ll.setOnClickListener(this);
            }


        @Override
        public void onClick(View v) {
            start(getAdapterPosition());
        }
    }
}

package com.example.dibya.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by pawan on 10/18/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolders> {


    ArrayList<Guest> guest;
    Context context;
    String category;
    int lastPosition=-1;

    public RecyclerViewAdapter(Context mainActivity, ArrayList<Guest> guest,String category) {
        this.guest = guest;
        this.context = mainActivity;
        this.category=category;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {


        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        //layoutView.setMinimumHeight(parent.getMeasuredHeight() / 2);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolders holder, final int position) {
        holder.gName.setText(guest.get(position).getName());
        holder.gPhoto.setImageResource(guest.get(position).getImage());
       // setAnimation(holder.card, position);

    }

    private void setAnimation(CardView card, int position) {
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            card.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return this.guest.size();

    }
    public void openWindow(final int pos)
    {
        View tagView =LayoutInflater.from(context).inflate(R.layout.dialoglayout, null, false);

        AlertDialog.Builder ab=new AlertDialog.Builder(context);
        ImageView img= (ImageView) tagView.findViewById(R.id.alertimage);
        int imm=context.getResources().getIdentifier("pic"+(pos+2),"drawable",context.getPackageName());
        img.setImageResource(imm);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        ab.setView(tagView);


        AlertDialog ad = ab.create();
        ad.show();
        ad.getWindow().setLayout(800, 800);
    }

    public void start(final int pos) {
                Intent i = new Intent(context, ShowDetailsActivity.class);
                i.putExtra("id",pos);

                //Log.i("eee", guest.get(pos).getId() + "");
                context.startActivity(i);


    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView gName;
        public ImageView gPhoto;

        public CardView card;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
           gName = (TextView) itemView.findViewById(R.id.guestname);
            gPhoto = (ImageView) itemView.findViewById(R.id.guestimage);
            gPhoto.setOnClickListener(this);
            card = (CardView) itemView.findViewById(R.id.card_view);
            card.setOnClickListener(this);

        }


        @Override
        public void onClick(View view)
        {
            if(view.getId()==R.id.guestimage)
            {
                //openWindow(getAdapterPosition());
            }
            else
            start(getAdapterPosition());
        }


    }
}

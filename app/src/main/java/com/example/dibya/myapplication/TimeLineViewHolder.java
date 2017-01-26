package com.example.dibya.myapplication;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.vipul.hp_hp.timelineview.TimelineView;

/**
 * Created by HP-HP on 05-12-2015.
 */
public class TimeLineViewHolder extends RecyclerView.ViewHolder {
    public TextView time,eventname,speakername;
    public TimelineView mTimelineView;

    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);

        mTimelineView = (TimelineView) itemView.findViewById(R.id.time_marker);
        time=(TextView)itemView.findViewById(R.id.tx_time);
        eventname=(TextView)itemView.findViewById(R.id.tx_eventname);
        speakername=(TextView)itemView.findViewById(R.id.tx_speakername);
        mTimelineView.initLine(viewType);
    }
}
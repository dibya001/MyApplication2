package com.example.dibya.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    RecyclerView rc;
    private List<TimeLineModel> mDataList = new ArrayList<>();

    private RecyclerView mRecyclerView;

    private TimeLineAdapter mTimeLineAdapter;
    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_one, container, false);
          mRecyclerView = (RecyclerView) v.findViewById(R.id.recyclerView1);
         mRecyclerView.setLayoutManager(getLinearLayoutManager());
        mRecyclerView.setHasFixedSize(true);
        initView();
        return v;
    }

    private LinearLayoutManager getLinearLayoutManager() {



            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            return linearLayoutManager;


    }

    private void initView() {

        String time[]=getResources().getStringArray(R.array.eventtime);
        String ename[]=getResources().getStringArray(R.array.eventname);
        String sname[]=getResources().getStringArray(R.array.eventspeaker);

        for(int i = 0;i <9;i++) {
            TimeLineModel model = new TimeLineModel();
            model.setEventname(ename[i]);
            model.setTime(time[i]);
            if(sname[i].equals("zz"))
                model.setSpeaker(" ");
            else
                model.setSpeaker(sname[i]);
            mDataList.add(model);
        }

        mTimeLineAdapter = new TimeLineAdapter(mDataList, Orientation.vertical);
        mRecyclerView.setAdapter(mTimeLineAdapter);
    }

}

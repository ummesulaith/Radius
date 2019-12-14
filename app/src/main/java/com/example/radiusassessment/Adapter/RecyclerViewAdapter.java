package com.example.radiusassessment.Adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.radiusassessment.Model.children.Trips;
import com.example.radiusassessment.R;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<Trips> mData;



    public RecyclerViewAdapter(Context mContext, ArrayList<Trips> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.itemlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        DateFormat simple = new SimpleDateFormat("MMM dd,  HH:mm");

        holder.source.setText(mData.get(position).getFrom());

        String frommiliSec = mData.get(position).getFrom_time();
        long fnum = Long.parseLong(frommiliSec);
        Date res = new Date(fnum);
        holder.fromtime.setText(simple.format(res));


        holder.destination.setText(mData.get(position).getTo());

        String miliSec = mData.get(position).getTo_time();
        long num = Long.parseLong(miliSec);
        Date result = new Date(num);
        holder.totime.setText(simple.format(result));

        holder.totalvalue.setText(mData.get(position).getCost().getValue());
        holder.symbol.setText(mData.get(position).getCost().getCurrency_symbol());

        String travel = mData.get(position).getTrip_duration();
        int time = Integer.parseInt(travel);
        int r = time/60;
        int minutes = time % 60;

        String outcome = (String.valueOf(r)+"h "+String.valueOf(minutes)+"mins");

        holder.tripduration.setText((outcome));
        System.out.println("Value of travel"+outcome);
    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public void setTrips(ArrayList<Trips> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public View view;
        TextView source,fromtime,destination,totime,totalvalue,tripduration,symbol;


        public MyViewHolder(View itemView) {
            super(itemView);

            source = (TextView) itemView.findViewById(R.id.from);
            fromtime = (TextView) itemView.findViewById(R.id.fromtime);
            destination = (TextView) itemView.findViewById(R.id.to);
            totime = (TextView) itemView.findViewById(R.id.totime);
            totalvalue = (TextView) itemView.findViewById(R.id.totalvalue);
            tripduration = (TextView) itemView.findViewById(R.id.tripduration);
            symbol =(TextView)itemView.findViewById(R.id.totalsym);


        }

    }



}
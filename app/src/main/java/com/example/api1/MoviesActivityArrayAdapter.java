package com.example.api1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

public class MoviesActivityArrayAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mTypes;
    private  int[] images;


    public MoviesActivityArrayAdapter(Context mContext, String[] mTypes, int[] images) {
        this.mContext = mContext;
        this.mTypes = mTypes;
        this.images = images;
    }

    @Override
    public int getCount() {
        return mTypes.length;
    }

    @Override
    public Object getItem(int position) {
        return mTypes[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View emma = convertView;
        if (emma == null) {
            LayoutInflater val = (LayoutInflater).mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            emma=val.inflate(R.layout.activity_movies,null);
        }

        return null;
    }
    //    private String[] mAuthors;

}




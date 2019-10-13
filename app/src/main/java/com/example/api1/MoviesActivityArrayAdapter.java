package com.example.api1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MoviesActivityArrayAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mTypes;
    private  int[] images;


    public MoviesActivityArrayAdapter(@Nullable Context mContext, String[] mTypes, int[] images) {
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
        LayoutInflater val = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View emma = convertView;
        if (emma == null) {
          emma = val.inflate(R.layout.activity_movies, null);
        }
        ImageView img = (ImageView)emma.findViewById(R.id.act);
        TextView text = (TextView)emma.findViewById(R.id.tel);
        img.setImageResource(images[position]);
        text.setText(mTypes[position]);

        return emma;
    }

}




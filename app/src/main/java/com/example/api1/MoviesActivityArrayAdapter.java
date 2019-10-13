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

        View emma = convertView;
        if (emma == null) {
            LayoutInflater val = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          emma = val.inflate(R.layout.activity_movies, null);
        }
//        TextView text = (TextView)emma.findViewById(R.id.tel);
//        text.setText(mTypes[position]);
        ImageView img = (ImageView)emma.findViewById(R.id.act);
        img.setImageResource(images[position]);

        return emma;
    }

}




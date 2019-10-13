package com.example.api1;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MoviesActivityArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mTypes;
    //    private String[] mAuthors;
    public MoviesActivityArrayAdapter(Context mContext, int resource, String[] mTypes) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mTypes = mTypes;
//        this.mAuthors = mAuthors;
    }
    @Override
    public Object getItem(int position) {
        String type = mTypes[position];
//        String author = mAuthors[position];
        return String.format( type);
    }

    @Override
    public int getCount() {
        return mTypes.length;
    }
}




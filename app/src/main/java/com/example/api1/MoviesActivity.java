package com.example.api1;


import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesActivity extends AppCompatActivity {
    GridView gridView;
    private String[] types = new String[]{"Action", "Comedy ", "Thriller", "Horror", "Christian", "Romance"};
    private int [] images = {R.drawable. action,
                             R.drawable. comedy,
                             R.drawable. thriller,
                             R.drawable. horror,
                             R.drawable. christian,
                             R.drawable. romance
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        gridView=(GridView)findViewById(R.id.grid);
        MoviesActivityArrayAdapter MoviesActivityArrayAdapter = new MoviesActivityArrayAdapter(MoviesActivity.this, types, images);
        gridView.setAdapter(MoviesActivityArrayAdapter);






    }
}

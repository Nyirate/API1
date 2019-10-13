package com.example.api1;


import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesActivity extends AppCompatActivity {
    @BindView(R.id.grid)
    GridView gridView;
    private int [] images = {R.drawable. action,
                             R.drawable. comedy,
                             R.drawable. thriller,
                             R.drawable. horror,
                             R.drawable. christian,
                             R.drawable. romance
    };
    private String[] types = new String[]{"Action", "Comedy ", "Thriller", "Horror", "Christian", "Romance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);
        MoviesActivityArrayAdapter adapter = new MoviesActivityArrayAdapter(this, android.R.layout.simple_list_item_1, images, types);
        gridView.setAdapter(adapter);
        gridView=(GridView)findViewById(R.id.grid);





    }
}

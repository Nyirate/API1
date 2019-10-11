package com.example.api1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MoviesActivity extends AppCompatActivity {

    private String[] types = new String[]{"Action", "Comedy", "Horror", "Romance", "Thriller", "Christian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        mListView = (ListView) findViewById(R.id.listView);

    }
}

package com.example.api1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MoviesActivity extends AppCompatActivity {
    private ListView mView1;
    GridView gridView;
    private int [] images = {R

    };
    private String[] types = new String[]{"Action Film", "Comedy Film", "Horror Film", "Romance Film", "Thriller Film", "Christian Film"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        MoviesActivityArrayAdapter adapter = new MoviesActivityArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        mView1.setAdapter(adapter);
        mView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String type = ((TextView)view).getText().toString();

            }
        });

        Intent intent = getIntent();



    }
}

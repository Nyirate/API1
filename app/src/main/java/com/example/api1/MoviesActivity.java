package com.example.api1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MoviesActivity extends AppCompatActivity {
    private ListView mView1;
    private TextView mGoView;

    private String[] types = new String[]{"Action", "Comedy", "Horror", "Romance", "Thriller", "Christian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        mView1 = (ListView) findViewById(R.id.view1);
        mGoView = (TextView) findViewById(R.id.goview);
        MoviesActivityArrayAdapter adapter = new MoviesActivityArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        mView1.setAdapter(adapter);
        mView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String type = ((TextView)view).getText().toString();
//
            }
        });

        Intent intent = getIntent();



    }
}

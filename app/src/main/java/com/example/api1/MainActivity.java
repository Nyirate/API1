package com.example.api1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mWatch;
    private EditText mGoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWatch = (Button)findViewById(R.id.watch);

        mWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String go = mGoEditText.getText().toString();
                Log.d(TAG, go);
                Intent intent = new Intent(MainActivity.this, MoviesActivity.class);
                startActivity(intent);

            }

        });
    }

}

package com.example.mywanapp.Mine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mywanapp.R;

public class Sign extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
    }
    TextView  mTextView=findViewById(R.id.mypoints);
}
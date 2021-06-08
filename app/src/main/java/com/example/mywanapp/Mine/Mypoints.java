package com.example.mywanapp.Mine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mywanapp.R;

//我的积分点击事件
public class Mypoints extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titlebar4);
    }

    TextView mTextView = findViewById(R.id.mypoints);

}


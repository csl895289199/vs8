package com.example.mywanapp.Mine;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mywanapp.Base.BaseFragment;
import com.example.mywanapp.Home.HomeFragment;
import com.example.mywanapp.R;

public class MineFragment extends BaseFragment {
    private static final String TAG = HomeFragment.class.getSimpleName();
    private RecyclerView rvHome;
    private ImageView ib_top;
    private TextView tv_search_home;
    private TextView tv_message_home;

    @Override
    public View initView() {

        View view = View.inflate(mContext, R.layout.fragment_mine,
                null);
        rvHome = (RecyclerView) view.findViewById(R.id.rv_home);
        tv_search_home = (TextView) view.findViewById(R.id.tv_search_home);
        tv_message_home = (TextView)
                view.findViewById(R.id.tv_message_home);

//设置点击事件

        return view;
    }
}
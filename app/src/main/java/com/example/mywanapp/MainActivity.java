package com.example.mywanapp;

import android.os.Bundle;


import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mywanapp.Home.HomeFragment;
import com.example.mywanapp.Mine.MineFragment;
import com.example.mywanapp.Navi.NaviFragment;
import com.example.mywanapp.Ques.QuesFragment;


public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;//单选组
    private FragmentTransaction mFragmentTransaction;//fragment事务
    private FragmentManager mFragmentManager;//fragment管理者
    private HomeFragment mHomeFragment;
    private QuesFragment mQuesFragment;
    private NaviFragment mNaviFragment;
    private MineFragment mMineFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setClick(0);//默认进去显示主页fragment
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_main);
        mFragmentManager = getSupportFragmentManager();//获取到fragment的管理对象
        //RadioGroup的选中监听
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home://主页
                        setClick(0);
                        break;
                    case R.id.rb_ques://问答
                        setClick(1);
                        break;
                    case R.id.rb_navi://体系
                        setClick(2);
                        break;
                    case R.id.rb_mine://我的
                        setClick(3);
                        break;

                }
            }
        });
    }

    private void setClick(int type) {
        //开启事务
        mFragmentTransaction = mFragmentManager.beginTransaction();
        //显示之前将所有的fragment都隐藏起来,在去显示我们想要显示的fragment
        hideFragment(mFragmentTransaction);
        switch (type) {
            case 0://主页
                //如果主页的fragment是null的话,就创建一个
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mHomeFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mHomeFragment);
                }
                break;
            case 1:
                if (mQuesFragment == null) {
                    mQuesFragment = new QuesFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mQuesFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mQuesFragment);
                }
                break;
            case 2:
                if (mNaviFragment == null) {
                    mNaviFragment = new NaviFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mNaviFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mNaviFragment);
                }
                break;
            case 3:
                if (mMineFragment == null) {
                    mMineFragment = new MineFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mMineFragment);

                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mMineFragment);
                }
                break;
            case 4:
        }
        //提交事务
        mFragmentTransaction.commit();
    }

    /**
     * 用来隐藏fragment的方法
     *
     * @param fragmentTransaction
     */
    private void hideFragment(FragmentTransaction fragmentTransaction) {
        //如果此fragment不为空的话就隐藏起来
        if (mHomeFragment != null) {
            fragmentTransaction.hide(mHomeFragment);
        }
        if (mQuesFragment != null) {
            fragmentTransaction.hide(mQuesFragment);
        }
        if (mNaviFragment != null) {
            fragmentTransaction.hide(mNaviFragment);
        }
        if (mMineFragment != null) {
            fragmentTransaction.hide(mMineFragment);
        }

    }

}
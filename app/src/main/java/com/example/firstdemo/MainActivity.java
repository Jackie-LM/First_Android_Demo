package com.example.firstdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private class myPageAdapter extends FragmentStatePagerAdapter {

        public myPageAdapter(FragmentManager fm) {
            super(fm);
        }

        private String name[] = {"One","Two","Three"};

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return name[position];
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FirstFragment();
                case 1:
                    return new SecondFragment();
                case 2:
                    return new FirstFragment();
                default:
                    return new FirstFragment();
            }

        }

    }

    private ViewPager mPage;
    private PagerAdapter mAdapter;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPage = (ViewPager) findViewById(R.id.pagers);
        tab = (TabLayout) findViewById(R.id.tab_layout);
        tab.setupWithViewPager(mPage);
        mAdapter = new myPageAdapter(getSupportFragmentManager());
        mPage.setAdapter(mAdapter);
    }

}
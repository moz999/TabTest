package com.example.m0z.tabtest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTabLayout();
    }

    private void setTabLayout(){
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        //タブをカスタマイズ
        for(int i = 0; i < adapter.getCount(); i++){
            TabLayout.Tab tab = tabLayout.getTabAt(i);

            tab.setCustomView(adapter.getTabView(tabLayout, i));
        }
    }
}

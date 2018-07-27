package com.example.m0z.tabtest;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private String tabTitles[]    = {"Tab 1", "Tab 2", "Tab 3"};
    private final int PAGE_COUNT = tabTitles.length;

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;

    }

    //-----------------------------------------
    // implements of FragmentStatePagerAdapter
    @Override
    public Fragment getItem(int position) {
        return ContentsFragment.newInstance(String.valueOf(position));
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }

    public View getTabView(TabLayout tabLayout, int position){
        View view = LayoutInflater.from(this.context).
                inflate(R.layout.tab_item, tabLayout, false);

        TextView textView = (TextView)view.findViewById(R.id.tab_text);
        textView.setText(tabTitles[position]);

        return view;
    }
}

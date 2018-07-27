package com.example.m0z.tabtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContentsFragment extends Fragment {

    //Key
    public final static String FRAGMENT_TEXT = "fragmentText";

    public static ContentsFragment newInstance(String text){
        ContentsFragment fragment = new ContentsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(FRAGMENT_TEXT, text);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //containerにfragment_page.xmlのレイアウトを追加
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        //Keyを使って値を取得
        String bundleValue = getArguments().getString(FRAGMENT_TEXT);

        //TextViewの値を変更する
        TextView textView = (TextView)view.findViewById(R.id.fragment_page_text);
        textView.setText("Fragment : " + bundleValue);

        return view;

    }
}

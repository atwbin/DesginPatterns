package com.wangcaigu.adapter_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangcaigu.adapter_demo.simple3.ListAdapter;
import com.wangcaigu.adapter_demo.simple3.WbinListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WbinListView mListView;

    private List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.wbin_iv);

        for (int i = 0; i < 100; i++) {
            items.add(i + "");
        }

        mListView.setAdapter(new ListAdapter(this, items));
    }
}

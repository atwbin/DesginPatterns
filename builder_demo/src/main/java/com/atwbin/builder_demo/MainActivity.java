package com.atwbin.builder_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup parent = findViewById(R.id.view_root);

//        NavigationBar navigationBar = new NavigationBar
//                .Builder(this, R.layout.ui_navigation_bar, parent)
//                .setText(R.id.back_tv, "返回")
//                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        finish();
//                    }
//                }).create();


        DefaultNavitationBar defaultNavitationBar = new DefaultNavitationBar
                .Builder(this,parent)
                .setLeftText("返回")
                .setHideLeftText()
                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                })
                .create();

    }
}

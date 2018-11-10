package com.atwbin.builder_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.atwbin.builder_demo.navigationbar.DefaultNavitationBar;
import com.atwbin.builder_demo.navigationbar.NavigationBar;
import com.atwbin.builder_demo.practice.MeNavitationBar;
import com.atwbin.builder_demo.practice2.MeNavitationBar3;

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
                .Builder(this, parent)
                .setLeftText("返回")
                .setHideLeftText()
                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                })
                .create();


        //自己的
      /*  MeNavitationBar meNavitationBar = new MeNavitationBar.Builder2(this, parent)
                .setText("回退")
                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                })
                .create2();*/


        MeNavitationBar3 meNavitationBar3 = new MeNavitationBar3.Builder(this, parent)
                .setText("返回键")
                .setOnClickLitener(R.id.back_tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }).create();

    }
}

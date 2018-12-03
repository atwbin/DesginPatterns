package com.wangcaigu.log_demo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = null;
        //属性动画
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "translationY", 1f);
    }
}

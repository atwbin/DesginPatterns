package com.atwbin.singleton_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.atwbin.singleton_demo.manage.ActivityManager;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityManager.getmInstance().attach(this);

        setTitle("LoginActivity");

    }


    public void click(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        ActivityManager.getmInstance().detach(this);
        super.onDestroy();
    }
}

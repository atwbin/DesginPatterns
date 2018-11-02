package com.atwbin.singleton_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.atwbin.singleton_demo.manage.ActivityManager;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityManager.getmInstance().attach(this);

        setTitle("RegisterActivity");
    }


    public void click(View view) {

        //不只关闭自己  还有关闭LoginActivity  让其回到主页
        ActivityManager.getmInstance().finish(this);
        ActivityManager.getmInstance().finish(LoginActivity.class);

    }


    @Override
    protected void onDestroy() {
        ActivityManager.getmInstance().detach(this);
        super.onDestroy();
    }
}

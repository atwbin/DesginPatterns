package com.atwbin.singleton_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.atwbin.singleton_demo.manage.ActivityManager;
import com.atwbin.singleton_demo.simple1.Singleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityManager.getmInstance().attach(this);
        setTitle("MainActivity");

    }


    public void click(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onDestroy() {
        ActivityManager.getmInstance().detach(this);
        super.onDestroy();

    }
}

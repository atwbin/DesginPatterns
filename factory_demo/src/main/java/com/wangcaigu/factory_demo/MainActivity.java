package com.wangcaigu.factory_demo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences sharedPreferences = getSharedPreferences("cache", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString("useName", "wbin");
//        editor.putString("useAge", "28");
//        editor.commit();


        SharedPreferencesUtils.getInstance()
                .saveString("useName", "wbin")
                .saveString("useAge", "28")
                .commit();


    }
}

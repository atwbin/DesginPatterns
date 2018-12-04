package com.atwbin.desgin.pie;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atwbin.desgin.R;

public class PieActivity extends AppCompatActivity {


    public static void starter(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, PieActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
    }


}

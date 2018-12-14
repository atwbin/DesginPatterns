package com.wangcaigu.observer_demo.simple4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wangcaigu.observer_demo.R;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class InsuranceActivity extends AppCompatActivity {

    private EditText mName, mAge;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
        mName = findViewById(R.id.et_name);
        mAge = findViewById(R.id.et_age);
    }

    public void add(View view) {
        if (TextUtils.isEmpty(mName.getText().toString()) || TextUtils.isEmpty(mAge.getText().toString())) {
            Toast.makeText(this, "内容为空!!!", Toast.LENGTH_LONG).show();
            return;
        } else {
            DataBaseManager.getInstance().insert(new Member(mName.getText().toString(), mAge.getText().toString()));
        }

    }


    public void finish(View view) {
        finish();
    }
}

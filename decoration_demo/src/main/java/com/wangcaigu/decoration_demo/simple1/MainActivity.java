package com.wangcaigu.decoration_demo.simple1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangcaigu.decoration_demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersionalEat eat = new PersionalEat();
        TeacherEat teacherEat = new TeacherEat(eat);
        teacherEat.eat();
    }
}

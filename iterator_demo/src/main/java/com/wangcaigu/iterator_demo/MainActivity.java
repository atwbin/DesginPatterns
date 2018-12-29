package com.wangcaigu.iterator_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangcaigu.iterator_demo.simple2.BottomTabItem;
import com.wangcaigu.iterator_demo.simple2.MainBottomTabItem;
import com.wangcaigu.iterator_demo.simple2.TabBottomNavigation;
import com.wangcaigu.iterator_demo.simple2.TabListIterator;

public class MainActivity extends AppCompatActivity {

    private TabBottomNavigation tabBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabBottomNavigation = findViewById(R.id.tab_bottom);

        TabListIterator<BottomTabItem> listIterator = new TabListIterator<>();
        listIterator.addItem(new MainBottomTabItem.Builder(this)
                .resIconId(R.drawable.ic_launcher_background).text("测试1").create());
        listIterator.addItem(new MainBottomTabItem.Builder(this)
                .resIconId(R.drawable.ic_launcher_background).text("测试2").create());
        listIterator.addItem(new MainBottomTabItem.Builder(this)
                .resIconId(R.drawable.ic_launcher_background).text("测试3").create());
        listIterator.addItem(new MainBottomTabItem.Builder(this)
                .resIconId(R.drawable.ic_launcher_background).text("测试4").create());

        tabBottomNavigation.addTabItem(listIterator);
    }
}

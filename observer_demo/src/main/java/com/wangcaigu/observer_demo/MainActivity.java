package com.wangcaigu.observer_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.wangcaigu.observer_demo.simple4.DataBaseManager;
import com.wangcaigu.observer_demo.simple4.InsuranceActivity;
import com.wangcaigu.observer_demo.simple4.Member;
import com.wangcaigu.observer_demo.simple4.Observer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Observer<Member> {

    private ListView mMemberLv;
    private List<Member> mMemberList;
    private BaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMemberLv = findViewById(R.id.lv_member);
        mMemberList = new ArrayList<>();

        DataBaseManager.getInstance().register(this);
        setAdapter();
    }

    private void setAdapter() {
        if (mAdapter == null) {
            mAdapter = new BaseAdapter() {
                @Override
                public int getCount() {
                    return mMemberList.size();
                }

                @Override
                public Object getItem(int position) {
                    return mMemberList.get(position);
                }

                @Override
                public long getItemId(int position) {
                    return position;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    //不考虑 convertView 复用
                    LinearLayout view = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.item_lv, parent, false);
                    TextView nameTv = view.findViewById(R.id.tv_item_name);
                    TextView ageTv = view.findViewById(R.id.tv_item_age);
                    nameTv.setText(mMemberList.get(position).getName());
                    ageTv.setText(mMemberList.get(position).getAge());
                    return view;
                }
            };
            mMemberLv.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }


    public void startInsuranceActivity(View view) {
        Intent intent = new Intent(this, InsuranceActivity.class);
        startActivity(intent);
    }

    @Override
    public void update(Member member) {
        mMemberList.add(member);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataBaseManager.getInstance().unregister(this);
    }
}

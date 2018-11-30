package com.wangcaigu.decoration_demo.simple2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wangcaigu.decoration_demo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WrapRecyclerView mRecyclerView;
    private List<Integer> mDatas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);

        mDatas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mDatas.add(i);
        }

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerAdapter());

        //添加头部
        View headView = LayoutInflater.from(this).inflate(R.layout.layout_header_view, mRecyclerView, false);
        mRecyclerView.addHeaderView(headView);
    }

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_ui, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.textView.setText(mDatas.get(position) + "测试");
            holder.textView.setTextColor(Color.GREEN);
            holder.textView.setGravity(Gravity.CENTER);
            Log.d("tag", "");
        }


        @Override
        public int getItemCount() {
            return mDatas.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder {

            TextView textView;

            ViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.item_tv);
            }
        }
    }
}

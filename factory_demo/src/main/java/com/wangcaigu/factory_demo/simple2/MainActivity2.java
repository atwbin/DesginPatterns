package com.wangcaigu.factory_demo.simple2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wangcaigu.factory_demo.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IOHandler ioHandler = IOHanderFactory.createIOHandle(IOHanderFactory.IOType.MEMORY);
        ioHandler.save("useName", "王斌老公爱添花妹妹哦！！！");
        ioHandler.save("useAge", "是哒");

    }

    public void click(View view) {
        IOHandler ioHandler = IOHanderFactory.createIOHandle(IOHanderFactory.IOType.MEMORY);
        String useName = ioHandler.getString("useName");
        String useAge = ioHandler.getString("useAge");
        TextView textView = findViewById(R.id.text);
        textView.setText(useName + "****" + useAge);
    }
}

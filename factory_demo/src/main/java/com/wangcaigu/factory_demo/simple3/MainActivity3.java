package com.wangcaigu.factory_demo.simple3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wangcaigu.factory_demo.R;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IOFactory ioFactory = new MemoryIOFactory();
        IOHandler ioHandler = ioFactory.createIOHandler();
        ioHandler.save("useName", "wbin！！！");
        ioHandler.save("useAge", "911010");
    }

    public void click(View view) {

        IOFactory ioFactory = new MemoryIOFactory();
        IOHandler ioHandler = ioFactory.createIOHandler();
        String useName = ioHandler.getString("useName");
        String useAge = ioHandler.getString("useAge");
        TextView textView = findViewById(R.id.text);
        textView.setText(useName + "****" + useAge);
    }
}

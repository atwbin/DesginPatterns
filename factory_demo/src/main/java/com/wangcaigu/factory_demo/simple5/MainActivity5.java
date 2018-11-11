package com.wangcaigu.factory_demo.simple5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wangcaigu.factory_demo.R;
import com.wangcaigu.factory_demo.simple4.IOHandler;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IOHandler ioHandler = IOHandlerFactory.getInstance().getPreferencesIOHandler();
        ioHandler.save("useName", "wbin！！！");
        ioHandler.save("useAge", "911010");
    }

    public void click(View view) {

        IOHandler ioHandler = IOHandlerFactory.getInstance().getPreferencesIOHandler();
        String useName = ioHandler.getString("useName");
        String useAge = ioHandler.getString("useAge");
        TextView textView = findViewById(R.id.text);
        textView.setText(useName + "****" + useAge);
    }
}

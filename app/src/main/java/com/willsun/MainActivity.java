package com.willsun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import willsun.com.library.MyTimeUtil;

public class MainActivity extends AppCompatActivity {

    TextView tv_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_time=findViewById(R.id.tv_time);
        tv_time.setText(MyTimeUtil.getTimes(System.currentTimeMillis(),"yyyy-MM-dd HH:mm:ss"));
    }
}

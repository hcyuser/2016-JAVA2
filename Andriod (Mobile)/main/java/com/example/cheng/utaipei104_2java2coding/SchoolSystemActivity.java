package com.example.cheng.utaipei104_2java2coding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SchoolSystemActivity extends AppCompatActivity {

    private WebView w1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_system);

        w1=(WebView)findViewById(R.id.web);
        w1.loadUrl("http://210.71.24.124/utaipei/index_main.html");

    }
}

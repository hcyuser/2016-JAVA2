package com.example.cheng.utaipei104_2java2coding;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class LMSActivity extends Activity {

    private WebView w1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lms);

        w1=(WebView)findViewById(R.id.web);
        w1.loadUrl("http://lms.utaipei.edu.tw/");

    }
}

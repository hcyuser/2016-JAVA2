package com.example.cheng.utaipei104_2java2coding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button l1,l2,l3,l4,l5,l6,l7,l8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1= (Button)findViewById(R.id.link1);
        l2= (Button)findViewById(R.id.link2);
        l3= (Button)findViewById(R.id.link3);
        l4= (Button)findViewById(R.id.link4);
        l5= (Button)findViewById(R.id.link5);
        l6= (Button)findViewById(R.id.link6);
        l7= (Button)findViewById(R.id.link7);
        l8= (Button)findViewById(R.id.link8);

        l1.setOnClickListener(listener);
        l2.setOnClickListener(listener);
        l3.setOnClickListener(listener);
        l4.setOnClickListener(listener);
        l5.setOnClickListener(listener);
        l6.setOnClickListener(listener);
        l7.setOnClickListener(listener);
        l8.setOnClickListener(listener);

    }//end onCreate method
    private Button.OnClickListener listener=new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.link1:
                    //校務系統
                    Intent intent1 = new Intent();
                    intent1.setClass(MainActivity.this, SchoolSystemActivity.class);
                    startActivity(intent1);
                    //TestExam001.this.finish();//按返回不可回上一頁
                    break;
                case R.id.link2:
                    //LMS
                    Intent intent2 = new Intent();
                    intent2.setClass(MainActivity.this, LMSActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.link3:
                    //二手拍賣中心
                    Intent intent3 = new Intent();
                    intent3.setClass(MainActivity.this, UsedAuctionsActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.link4:
                    //個人儲存雲
                    Intent intent4 = new Intent();
                    intent4.setClass(MainActivity.this, PersonalCloudStorageActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.link5:
                    //計畫專頁
                    Intent intent5 = new Intent();
                    intent5.setClass(MainActivity.this, ProjectPageActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.link6:
                    //遠距離會議系統(會開瀏覽器)
                    Intent intent6 = new Intent();
                    intent6.setClass(MainActivity.this, TeleconferencingSystemActivity.class);
                    startActivity(intent6);
                    break;
                case R.id.link7:
                    //系網(開不起來)
                    Intent intent7 = new Intent();
                    intent7.setClass(MainActivity.this, CSWebActivity.class);
                    startActivity(intent7);
                    break;
                case R.id.link8:
                    //線上聊天室(會開瀏覽器)
                    Intent intent8 = new Intent();
                    intent8.setClass(MainActivity.this, OnlineChatActivity.class);
                    startActivity(intent8);
                    break;
            }//end switch
        }//end onClick
    };//end listener method
}

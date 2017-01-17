package com.itheima.materialdialog.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.itheima.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){


        new MaterialDialog.Builder(this)
                .title("这是标题")
                .content("这是描述的内容")
                .positiveText("确定")
                .negativeText("取消")
                .show();

    }
}

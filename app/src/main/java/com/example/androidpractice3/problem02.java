package com.example.androidpractice3;

import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class problem02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem02);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginClick();
            }
        });
    }

    public void loginClick(){
        AlertDialog.Builder builder = new AlertDialog.Builder(problem02.this);
        final AlertDialog dialog = builder.create();
        View dialogView = View.inflate(problem02.this, R.layout.login_layout, null);
        //设置对话框布局
        dialog.setView(dialogView);
        dialog.show();
        //得到文本框对象
        EditText name = dialogView.findViewById(R.id.et_name);
        EditText pwd = dialogView.findViewById(R.id.et_pwd);
        //得到输入的文本
        final String etName = name.getText().toString();
        final String etPwd = pwd.getText().toString();
        //得到按钮
        Button login = dialogView.findViewById(R.id.btn_login);
        Button cancel = dialogView.findViewById(R.id.btn_cancel);
        //定义login点击事件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etName) && TextUtils.isEmpty(etPwd)){
                    Toast.makeText(problem02.this, "用户名和密码不能为空", Toast.LENGTH_SHORT);
                }
                else{
                    Log.e("name", "用户名:" + etName);
                    Log.e("pwd", "密码:" + etPwd);
                }
            }
        });
        //定义cancel点击事件
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}

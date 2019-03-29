package com.example.androidpractice3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class problem03 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView = findViewById(R.id.testText);
        switch (item.getItemId()) {
            case R.id.set_size:
                Toast.makeText(this, "设置字体大小", Toast.LENGTH_SHORT).show();
                break;
            case R.id.small:
                Toast.makeText(this, "小", Toast.LENGTH_SHORT).show();
                textView.setTextSize(10);
                break;
            case R.id.middle:
                Toast.makeText(this, "中", Toast.LENGTH_SHORT).show();
                textView.setTextSize(16);
                break;
            case R.id.big:
                Toast.makeText(this, "大", Toast.LENGTH_SHORT).show();
                textView.setTextSize(20);
                break;
            case R.id.menu_item:
                Toast.makeText(this, "普通菜单项", Toast.LENGTH_SHORT).show();
                break;
            case R.id.set_color:
                Toast.makeText(this, "设置字体颜色", Toast.LENGTH_SHORT).show();
                break;
            case R.id.red:
                Toast.makeText(this, "红色", Toast.LENGTH_SHORT).show();
                int red = Color.parseColor("#FF0033");
                textView.setTextColor(red);
                break;
            case R.id.black:
                Toast.makeText(this, "黑色", Toast.LENGTH_SHORT).show();
                int black = Color.parseColor("#000000");
                textView.setTextColor(black);
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem03);
    }
}

package com.example.androidpractice3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = findViewById(R.id.btn_problem01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, problem01.class);
                startActivity(intent1);
            }
        });

        Button button02 = findViewById(R.id.btn_problem02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, problem02.class);
                startActivity(intent2);
            }
        });

        Button button03 = findViewById(R.id.btn_problem03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, problem03.class);
                startActivity(intent3);
            }
        });

        Button button04 = findViewById(R.id.btn_problem04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, problem04.class);
                startActivity(intent4);
            }
        });
    }
}

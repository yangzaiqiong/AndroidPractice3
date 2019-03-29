package com.example.androidpractice3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem01 extends AppCompatActivity {

    private ListView listView;
    private List<Map<String, Object>> list;
    int img[] = { R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant };
    String title[] = {"lion", "tiger", "monkey", "dog", "cat", "elephant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem01);

        listView = findViewById(R.id.lv);
        list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 6; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title",  "  " + title[i]);
            map.put("img", img[i]);
            list.add(map);
        }
        String[] from = { "title", "img"}; // 列表项组件Id 数组
        int[] to = { R.id.item_title , R.id.item_img};

        final SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.listview_item, from, to);
        listView.setAdapter(adapter);
        /**
         * 单击
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String, Object> map = list.get(position);
                String animal = (String)map.get("title");
                Toast.makeText(problem01.this, animal, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

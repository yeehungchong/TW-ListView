package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> yearList;
    ArrayAdapter<String> aaYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvYear);

        yearList = new ArrayList();
        yearList.add("Year 1");
        yearList.add("Year 2");
        yearList.add("Year 3");

        aaYear = new ArrayAdapter(this, android.R.layout.simple_list_item_1, yearList);
        lv.setAdapter(aaYear);
    }
}

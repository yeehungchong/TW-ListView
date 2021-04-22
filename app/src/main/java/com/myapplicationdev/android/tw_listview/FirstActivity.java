package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> SelectionList;
    ArrayAdapter<String> aaSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvYear);

        SelectionList = new ArrayList();
        SelectionList.add("Secular");

        aaSelection = new ArrayAdapter(this, android.R.layout.simple_list_item_1, SelectionList);
        lv.setAdapter(aaSelection);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            String selectionType = SelectionList.get(position);

            // start the SecondActivity
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("selectionType", selectionType);
            startActivity(intent);
            }
        });


    }
}

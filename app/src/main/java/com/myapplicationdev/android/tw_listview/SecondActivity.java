package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvSelection;
    ArrayAdapter aa;
    ArrayList<Secular> secular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = findViewById(R.id.lvSecular);
        tvSelection = findViewById(R.id.tvSelection);

        Intent i = getIntent();
        final String selectionType = i.getStringExtra("selectionType");
        tvSelection.setText(selectionType);

        secular = new ArrayList<Secular>();

        if (selectionType.equals("Secular")) {
            secular.add(new Secular("New Year's Day", "NYD", "1 January 2021"));
            secular.add(new Secular("Chinese New Year", "CNY", "12 February 2021\n" + "13 February 2021"));
            secular.add(new Secular("Good Friday", "GFD", "2 April 2021"));
            secular.add(new Secular("Labour Day", "LBD", "1 May 2021"));
            secular.add(new Secular("Hari Raya Puasa", "HRP", "13 May 2021"));
            secular.add(new Secular("Vesak Day", "VSD", "26 May 2021"));
            secular.add(new Secular("Hari Raya Haji", "HRH", "20 July 2021"));
            secular.add(new Secular("National Day", "ND", "9 August 2021"));
            secular.add(new Secular("Deepavali", "DPVL", "4 November 2021"));
            secular.add(new Secular("Christmas Day", "CM", "25 December 2021"));
        }

        aa = new SecularAdapter(this, R.layout.row, secular);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Secular selectionType = secular.get(position);

                Toast.makeText(SecondActivity.this, selectionType.getName()
                                 + "\n" +selectionType.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }



}

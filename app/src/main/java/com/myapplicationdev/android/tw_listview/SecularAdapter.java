package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecularAdapter extends ArrayAdapter<Secular> {

    private ArrayList<Secular> secular;
    private Context context;
    private TextView tvSecular;
    private TextView tvSecularDate;
    private ImageView ivSecular;

    public SecularAdapter(Context context, int resource, ArrayList<Secular> objects){
        super(context, resource, objects);
        secular = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvSecular = rowView.findViewById(R.id.tvSecular1);
        tvSecularDate = rowView.findViewById(R.id.tvSecular2);
        ivSecular = rowView.findViewById(R.id.ivSecular1);

        Secular currentSecular = secular.get(position);

        //Secular Holiday Text
        tvSecular.setText(currentSecular.getName());
        //Secular Holiday Text
        if(currentSecular.getHoliday() == "NYD") {
            ivSecular.setImageResource(R.drawable.newyear);
            tvSecularDate.setText("1 January 2021");
        }
        else if (currentSecular.getHoliday() == "CNY"){
            ivSecular.setImageResource(R.drawable.chinesenewyear);
            tvSecularDate.setText("12 February 2021\n" +
                    "13 February 2021");
        }
        else if (currentSecular.getHoliday() == "GFD"){
            ivSecular.setImageResource(R.drawable.goodfriday);
            tvSecularDate.setText("2 April 2021");
        }
        else if (currentSecular.getHoliday() == "LBD"){
            ivSecular.setImageResource(R.drawable.labourday);
            tvSecularDate.setText("1 May 2021");
        }
        else if (currentSecular.getHoliday() == "HRP"){
            ivSecular.setImageResource(R.drawable.harirayapusah);
            tvSecularDate.setText("13 May 2021");
        }
        else if (currentSecular.getHoliday() == "VSD"){
            ivSecular.setImageResource(R.drawable.vesakday);
            tvSecularDate.setText("26 May 2021");
        }
        else if (currentSecular.getHoliday() == "HRH"){
            ivSecular.setImageResource(R.drawable.harirayahaji);
            tvSecularDate.setText("20 July 2021");
        }
        else if (currentSecular.getHoliday() == "ND"){
            ivSecular.setImageResource(R.drawable.nationalday);
            tvSecularDate.setText("9 August 2021");
        }
        else if (currentSecular.getHoliday() == "DPVL"){
            ivSecular.setImageResource(R.drawable.deepavali);
            tvSecularDate.setText("4 November 2021");
        }
        else if (currentSecular.getHoliday() == "CM"){
            ivSecular.setImageResource(R.drawable.christmas);
            tvSecularDate.setText("25 December 2021");
        }
        return rowView;


    }




}

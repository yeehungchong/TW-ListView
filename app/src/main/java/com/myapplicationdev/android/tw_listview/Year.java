package com.myapplicationdev.android.tw_listview;

public class Year {
    public String year;
    public String module;
    public Year(String year, String module){
        this.year = year;
        this.module = module;
    }

    public String getYear(){
        return year;
    }

    public String getModule(){
        return module;
    }
}

package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean program;
    public void module(String name, boolean program) {
        this.name = name;
        this.program = program;
    }
    public String getModule() {
        return name;
    }
    public boolean isProgram() {
        return program;
    }

}

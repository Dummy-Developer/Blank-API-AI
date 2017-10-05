package com.example.chungwei.placetogo.services.foursquare;

import java.util.ArrayList;

public class HereNow {
    private int count;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String summary;

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    private ArrayList<String> groups;

    public ArrayList<String> getGroups() {
        return this.groups;
    }

    public void setGroups(ArrayList<String> groups) {
        this.groups = groups;
    }
}

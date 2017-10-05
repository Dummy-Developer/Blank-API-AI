package com.example.chungwei.placetogo.services.foursquare;

import java.util.ArrayList;

public class RichStatus {
    private ArrayList<String> entities;

    public ArrayList<String> getEntities() {
        return this.entities;
    }

    public void setEntities(ArrayList<String> entities) {
        this.entities = entities;
    }

    private String text;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

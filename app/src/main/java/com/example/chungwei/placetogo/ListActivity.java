package com.example.chungwei.placetogo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.chungwei.placetogo.adapters.ListAdapter;
import com.example.chungwei.placetogo.services.foursquare.Item;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapater;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Item> items = (ArrayList<Item>) getIntent().getSerializableExtra("result");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerViewAdapater = new ListAdapter(this, items);
        recyclerView.setAdapter(recyclerViewAdapater);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}

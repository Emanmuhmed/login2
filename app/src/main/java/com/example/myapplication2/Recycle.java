package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;



public class Recycle extends AppCompatActivity {
    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        initiviews();
    }
    private void initiviews() {
        recyclerView =findViewById(R.id.recycler);
        ArrayList<Example_item> items = new ArrayList<>();
        items.add(new Example_item("Line1","Line2"));
        items.add(new Example_item("Line3","Line4"));
        items.add(new Example_item("Line5","Line6"));
        items.add(new Example_item("Line7","Line8"));
        items.add(new Example_item("Line9","Line10"));
        items.add(new Example_item("Line11","Line12"));
        items.add(new Example_item("Line13","Line14"));
        items.add(new Example_item("Line15","Line16"));
        items.add(new Example_item("Line17","Line18"));
        items.add(new Example_item("Line19 "," Line20"));
        items.add(new Example_item());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( Recycle.this,RecyclerView.VERTICAL,false);
        RecyclerView.Adapter adapter = new Example_Adapter(items);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
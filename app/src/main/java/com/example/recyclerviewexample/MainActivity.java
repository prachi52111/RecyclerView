package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> arrayList;
    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);

        arrayList = new ArrayList<>();
        arrayList.add(new Model("Shopping",R.drawable.shopping));
        arrayList.add(new Model("Bridge",R.drawable.bridge));
        arrayList.add(new Model("Working",R.drawable.working));
        arrayList.add(new Model("Busy",R.drawable.busy));

        LinearLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter =  new Adapter(arrayList,this);
        recyclerView.setAdapter(adapter);



    }
}
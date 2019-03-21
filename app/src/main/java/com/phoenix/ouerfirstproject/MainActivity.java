package com.phoenix.ouerfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.phoenix.ouerfirstproject.Model.Data;
import com.phoenix.ouerfirstproject.ViewHolderAdapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Data> listData = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create Init Data
        initData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(listData);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));
        //Copy
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));
        //Copy
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));
        //Copy
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));
        //Copy
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));
        //Copy
        listData.add(new Data("SuperMan", R.drawable.pic1));
        listData.add(new Data("LogoBat", R.drawable.pic2));
        listData.add(new Data("LogoTiger", R.drawable.pic3));

    }

}
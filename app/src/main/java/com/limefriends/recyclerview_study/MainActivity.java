package com.limefriends.recyclerview_study;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<ChatElem> chatElemList = new ArrayList<ChatElem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        setData();
        setRecyclerView();
    }

    void setRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(getApplicationContext(),chatElemList);
        recyclerView.setAdapter(adapter);
    }
    void setData(){
        ChatElem chatElem = new ChatElem("이름", "텍스트");
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
        chatElemList.add(chatElem);
    }


}

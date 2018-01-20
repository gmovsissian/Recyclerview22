package com.example.mmovsissian.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapterRecycler;
    List<Header> sections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        List<Child> childList = new ArrayList<>();





        //Create a List of Section DataModel implements Section
        sections = new ArrayList<>();
//        sections.add(new Header(childList, "Favourites") {
//        });

        childList = new ArrayList<>();
        childList.add(new Child("Gor Manukyan"));
        childList.add(new Child("Anna Sahakyan"));
        childList.add(new Child("Arman Hovhannisyan"));
        sections.add(new Header(childList, "Favourites",6) {
        });

        childList = new ArrayList<>();
        childList.add(new Child("Bella Qocharyan"));
        childList.add(new Child("Gohar Azatyan"));
        sections.add(new Header(childList, "All Contacts",5 ) {
        });



        adapterRecycler = new Adapter(this, sections) {
        }
        ;
        recyclerView.setAdapter(adapterRecycler);
    }

}

package com.example.mmovsissian.recyclerview;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapterRecycler;
    List<Header> sections;
   public Button button_add;
   public Button delete_button;
  TextView name;




//    public void add(){
//        button_add=(Button)findViewById(R.id.button_add);
//        button_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent1=new Intent(MainActivity.this,Main2Activity.class);
//                startActivity(intent1);
//            }
//
//        });
//    }
public void fragmen() {
    button_add=(Button)findViewById(R.id.button_add);
    button_add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FullScreenDialog dialog = new FullScreenDialog();

            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
             dialog.show(ft,"asfs");
        }
    });

}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        add();

        fragmen();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(false);


        List<Child> childList = new ArrayList<>();





        //Create a List of Section DataModel implements Section
        sections = new ArrayList<>();
//        sections.add(new Header(childList, "Favourites") {
//        });

        childList = new ArrayList<>();
        childList.add(new Child("Gor Manukyan"));
        childList.add(new Child("Anna Sahakyan"));
        childList.add(new Child("Arman Hovhannisyan"));
        childList.add(new Child("Arman Hovhannisyan"));
        childList.add(new Child("Arman Hovhannisyan"));
        sections.add(new Header(childList, "Favourites",6) {
        });

        childList = new ArrayList<>();
        childList.add(new Child("Bella Qocharyan"));
        childList.add(new Child("Bella Qocharyan"));
        childList.add(new Child("Gohar Azatyan"));
        childList.add(new Child("Gohar Azatyan"));
        childList.add(new Child("Gohar Azatyan"));

        if (getIntent().getStringExtra("Name")!=null){
        childList.add(new Child(getIntent().getStringExtra("Name")+" "+getIntent().getStringExtra("Surname")));}

        sections.add(new Header(childList, "All Contacts",5 ) {
        });



        adapterRecycler = new Adapter(this, sections) {
        }
        ;
        recyclerView.setAdapter(adapterRecycler);
    }

}


package com.example.mmovsissian.recyclerview;



import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;


import com.example.mmovsissian.recyclerview.Child;
import com.example.mmovsissian.recyclerview.Childholder;
import com.example.mmovsissian.recyclerview.Header;
import com.example.mmovsissian.recyclerview.Headerholder;
import com.example.mmovsissian.recyclerview.R;
import com.intrusoft.sectionedrecyclerview.SectionRecyclerViewAdapter;



import java.util.List;
/**
 * Created by mmovsissian on 20-Jan-18.
 */

public class Adapter extends SectionRecyclerViewAdapter<Header,Child,Headerholder,Childholder> {


    Context context;



    public Adapter(Context context, List<Header> sectionHeaderItemList) {

        super(context, sectionHeaderItemList);

        this.context = context;


    }



    @Override

    public Headerholder onCreateSectionViewHolder(ViewGroup sectionViewGroup, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.header, sectionViewGroup, false);

        return new Headerholder(view);

    }



    @Override

    public Childholder onCreateChildViewHolder(ViewGroup childViewGroup, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.child, childViewGroup, false);

        return new Childholder(view);

    }

    @Override
    public void onBindSectionViewHolder(Headerholder headerholder, int i, Header header) {
        headerholder.name.setText(header.getSectionText());
    }






    @Override

    public void onBindChildViewHolder(Childholder childViewHolder, int sectionPosition, int childPosition, Child child) {

        childViewHolder.name.setText(child.getName());

    }
}

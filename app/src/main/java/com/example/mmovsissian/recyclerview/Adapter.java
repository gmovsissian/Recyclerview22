
package com.example.mmovsissian.recyclerview;



import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


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
private List<Header> mDataset;


    public Adapter(Context context, List<Header> sectionHeaderItemList) {

        super(context, sectionHeaderItemList);

        this.context = context;
        LinearLayout linear;
        mDataset=sectionHeaderItemList;


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

    public void onBindChildViewHolder(Childholder childViewHolder, final int sectionPosition, final int childPosition, final Child child) {

        childViewHolder.name.setText(child.getName());
        LinearLayout linear;


        childViewHolder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Header person = mDataset.get(childPosition);
                Toast.makeText(context, (CharSequence) person,Toast.LENGTH_SHORT).show();
            }
        });



        childViewHolder.button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the clicked item label
                Header itemLabel = mDataset.get(childPosition);

                // Remove the item on remove/button click
                mDataset.remove(childPosition);
                notifyItemRemoved(childPosition);
                notifyItemChanged(childPosition,mDataset.size());
                Toast.makeText(context,"Removed  ",Toast.LENGTH_SHORT).show();


    }

});}}

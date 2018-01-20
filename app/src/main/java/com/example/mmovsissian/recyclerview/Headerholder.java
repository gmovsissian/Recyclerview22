package com.example.mmovsissian.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mmovsissian on 19-Jan-18.
 */

public class Headerholder  extends RecyclerView.ViewHolder {
    public TextView name;
    public Headerholder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.section);
    }
}

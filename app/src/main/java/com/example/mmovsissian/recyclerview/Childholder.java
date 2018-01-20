package com.example.mmovsissian.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mmovsissian on 19-Jan-18.
 */

public class Childholder extends RecyclerView.ViewHolder {

    public TextView name;
    public Childholder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.child);
    }
}

package com.example.mmovsissian.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mmovsissian on 19-Jan-18.
 */

public class Childholder extends RecyclerView.ViewHolder {

    public TextView name;
    public Button button_delete;
    public Childholder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.child);
          button_delete=(Button)itemView.findViewById(R.id.button_delete);
    }

}

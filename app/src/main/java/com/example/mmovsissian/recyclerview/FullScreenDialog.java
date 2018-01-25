package com.example.mmovsissian.recyclerview;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;

/**
 * Created by mmovsissian on 25-Jan-18.
 */

public class FullScreenDialog extends DialogFragment {

    public static final String TAG = "FullScreenDialog";
    Activity context;


      Button button_confirm;

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
           context=getActivity();

    }



    @Override

    public void onStart() {
        EditText text1;
        EditText text2;


        Button button_confirm;
        button_confirm=(Button)context.findViewById(R.id.button_confirm);
        super.onStart();


        Dialog dialog = getDialog();
        text1=(EditText)context.findViewById(R.id.text1);
        text2=(EditText)context.findViewById(R.id.text2);
        if (dialog != null) {

            int width = ViewGroup.LayoutParams.MATCH_PARENT;

            int height = ViewGroup.LayoutParams.MATCH_PARENT;
            button_confirm=(Button)context.findViewById(R.id.button_add);
            button_confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String name=text1.getText().toString();
                    String surname=text2.getText().toString();
                    Intent intent=new Intent(context,MainActivity.class);
                    intent.putExtra("Name", text1.getText().toString());
                    intent.putExtra("Surname",text2.getText().toString());
                    startActivity(intent);
                   getActivity().finish();


                }
            });
        }

    }



    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle state) {

        super.onCreateView(inflater, parent, state);



        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_layout, parent, false);

        return view;

    }

}

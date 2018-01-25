package com.example.mmovsissian.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText text1;
    EditText text2;

          Button button_confirm;
          public void close2(){
              text1=(EditText)findViewById(R.id.text1);
              text2=(EditText)findViewById(R.id.text2);
              button_confirm=(Button)findViewById(R.id.button_confirm);
              button_confirm.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                   String name=text1.getText().toString();
                   String surname=text2.getText().toString();
                   Intent intent3=new Intent(Main2Activity.this,MainActivity.class);
                   intent3.putExtra("Name", name);
                   intent3.putExtra("Surname",surname);
                   if (text1==null||text2==null){
                       Main2Activity.this.finish();
                   }else {
                   startActivity(intent3);

                      Main2Activity.this.finish();
                  }}
              });
          }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    text1=(EditText)findViewById(R.id.text1);
    text2=(EditText)findViewById(R.id.text2);

        close2();
        }

    }


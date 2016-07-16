package com.activity.catingub.addmeupcatingub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText first;
    private EditText second;
    private TextView answer;
    private Button add;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add();
    }




    public void add(){

        first = (EditText) findViewById(R.id.etFirst);
        second = (EditText) findViewById(R.id.etSecond);
        answer = (TextView) findViewById(R.id.txtResult);
        add = (Button) findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                        double first1 = Double.parseDouble(first.getText().toString());
                        double second2 = Double.parseDouble(second.getText().toString());
                        double total = first1 + second2;
                        first.setText("");
                        second.setText("");
                        answer.setText(total+"");

                }catch(Exception e){
                    first.setText("");
                    second.setText("");
                }


            }
        });
    }



}

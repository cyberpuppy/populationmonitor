package com.example.d.populationmonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class questions6 extends AppCompatActivity implements AsyncResponse,View.OnClickListener {
    Spinner spinner6,spinner7,spinner8,spinner9,spinner10,spinner11;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        spinner10 = (Spinner) findViewById(R.id.spinner10);
        spinner11 = (Spinner) findViewById(R.id.spinner11);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);


            }


    @Override
    public void onClick(View view) {
        HashMap PostData = new HashMap();
        PostData.put("h_21",spinner6.getSelectedItem().toString());
        PostData.put("h_22",spinner7.getSelectedItem().toString());
        PostData.put("h_23",spinner8.getSelectedItem().toString());
        PostData.put("h_24",spinner9.getSelectedItem().toString());
        PostData.put("h_25",spinner10.getSelectedItem().toString());
        PostData.put("h_27",spinner11.getSelectedItem().toString());

        PostResponseAsyncTask task = new PostResponseAsyncTask(this,PostData);
        task.execute("");
    }

    @Override
    public void processFinish(String s) {

    }
}







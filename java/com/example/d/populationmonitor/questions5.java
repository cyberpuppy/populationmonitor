package com.example.d.populationmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class questions5 extends AppCompatActivity implements AsyncResponse,View.OnClickListener {

    Spinner h_20;
    EditText h_11,h_18,h_19;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions5);

        h_20 = (Spinner) findViewById(R.id.spinner4);
        h_11 = (EditText) findViewById(R.id.editText_H11);
        h_18 = (EditText) findViewById(R.id.editText_h18);
        h_19 = (EditText) findViewById(R.id.editText_h19);
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if ((h_11.length()==0)||(h_18.length()==0)||(h_19.length()==0)) {
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_LONG).show();
        } else {
            HashMap PostData = new HashMap();
            PostData.put("h_11", h_11.getText().toString());
            PostData.put("h_18", h_18.getText().toString());
            PostData.put("h_19", h_19.getText().toString());

            PostResponseAsyncTask task = new PostResponseAsyncTask(this, PostData);
            task.execute("http://10.0.3.2/myfiles/questionare5.php");
        }
    }

    @Override
    public void processFinish(String result) {
        if(result.equals("sending success !")){
            Intent in= new Intent(this, questions6.class);
            startActivity(in);
        }
        else{
            Toast.makeText(this,"submission failed try again",Toast.LENGTH_LONG).show();
        }
    }
}


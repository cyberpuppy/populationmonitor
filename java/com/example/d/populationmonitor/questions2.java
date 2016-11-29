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

public class questions2 extends AppCompatActivity implements AsyncResponse,View.OnClickListener {
    EditText name, p_00, p_12, p_14, p_15, p_16, p_17, p_18, p_19, p_20;
    Spinner p_10, p_11, p_22, p_23;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);

        name = (EditText) findViewById(R.id.edittext_name);
        p_00 = (EditText) findViewById(R.id.edittext_p00);
        p_10 = (Spinner) findViewById(R.id.p_10);
        p_11 = (Spinner) findViewById(R.id.p_11);
        p_12 = (EditText) findViewById(R.id.edittext_p12);
        p_14 = (EditText) findViewById(R.id.edittext_p14);
        p_15 = (EditText) findViewById(R.id.edittext_p15);
        p_16 = (EditText) findViewById(R.id.edittext_p16);
        p_17 = (EditText) findViewById(R.id.edittext_p17);
        p_18 = (EditText) findViewById(R.id.edittext_p18);
        p_19 = (EditText) findViewById(R.id.edittext_p19);
        p_20 = (EditText) findViewById(R.id.edittext_p20);
        p_22 = (Spinner) findViewById(R.id.edittext_p22);
        p_23 = (Spinner) findViewById(R.id.edittext_p23);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if((name.length()==0)||(p_12.length()==0)||(p_18.length()==0)){
            Toast.makeText(this, "Insert Name,Age and Place of birth ", Toast.LENGTH_LONG).show();
        }
        else {
            HashMap PostData = new HashMap();
            PostData.put("p_name", name.getText().toString());
            PostData.put("p_00", p_00.getText().toString());
            PostData.put("p_10", p_10.getSelectedItem().toString());
            PostData.put("p_11", p_11.getSelectedItem().toString());
            PostData.put("p_12", p_12.getText().toString());
            PostData.put("p_14", p_14.getText().toString());
            PostData.put("p_15", p_15.getText().toString());
            PostData.put("p_16", p_16.getText().toString());
            PostData.put("p_17", p_17.getText().toString());
            PostData.put("p_18", p_18.getText().toString());
            PostData.put("p_19", p_19.getText().toString());
            PostData.put("p_20", p_20.getText().toString());
            PostData.put("p_22", p_22.getSelectedItem().toString());
            PostData.put("p_23", p_23.getSelectedItem().toString());
            PostResponseAsyncTask task = new PostResponseAsyncTask(this, PostData);
            task.execute("http://10.0.3.2/myfiles/questionare2.php");
        }
    }

    @Override
    public void processFinish(String result) {
        if (result.equals("sending success !")) {
            if (p_11.getSelectedItem().toString().equals("Male")) {
                Intent in = new Intent(this, activity_questions4.class);
                startActivity(in);
            } else {
                Toast.makeText(this, "submission failed try again", Toast.LENGTH_LONG).show();
            }
        }
    }
}



package com.example.d.populationmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

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
        HashMap PostDate = new HashMap();
        PostDate.put("h_11",h_11.getText().toString());
        PostDate.put("h_18",h_18.getText().toString());
        PostDate.put("h_19",h_19.getText().toString());

        PostResponseAsyncTask task = new PostResponseAsyncTask(this,PostDate);
        task.execute("http://10.0.3.2/myfiles/questionare5.php");
    }

    @Override
    public void processFinish(String s) {
        Intent q3 = new Intent(questions5.this, questions6.class);
        startActivity(q3);
    }
}


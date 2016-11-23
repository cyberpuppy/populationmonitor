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

public class activity_questions4 extends AppCompatActivity implements AsyncResponse,View.OnClickListener {
    Spinner p_37,p_38,p_39;
    EditText h_10;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);

        p_37 = (Spinner) findViewById(R.id.spinner);
        p_38 = (Spinner) findViewById(R.id.spinner2);
        p_39 = (Spinner) findViewById(R.id.spinner3);
        h_10 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);




        }

    @Override
    public void onClick(View view) {
        HashMap PostData = new HashMap();
        PostData.put("p_37",p_37.getSelectedItem().toString());
        PostData.put("p_38",p_38.getSelectedItem().toString());
        PostData.put("p_39",p_39.getSelectedItem().toString());
        PostData.put("h_10",h_10.getText().toString());
        PostResponseAsyncTask task = new PostResponseAsyncTask(this,PostData);
        task.execute("http://10.0.3.2/myfiles/questionare4.php");
    }

    @Override
    public void processFinish(String s) {
        Intent q3 = new Intent(activity_questions4.this, questions5.class);
        startActivity(q3);
    }
}









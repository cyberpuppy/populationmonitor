package com.example.d.populationmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class questions3 extends AppCompatActivity implements AsyncResponse,View.OnClickListener {

    EditText p_24,p_26,p_28,p_30,p_32 ;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions3);

        p_24 = (EditText) findViewById(R.id.editText_p24);
        p_26 = (EditText) findViewById(R.id.editText_p26);
        p_28 = (EditText) findViewById(R.id.edittext_p28);
        p_30 = (EditText) findViewById(R.id.editText_p30);
        p_32 = (EditText) findViewById(R.id.edittext_p32);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        HashMap PostData = new HashMap();
        PostData.put("p_24",p_24.getText().toString());
        PostData.put("p_26",p_26.getText().toString());
        PostData.put("p_28",p_28.getText().toString());
        PostData.put("p_30",p_30.getText().toString());
        PostData.put("p_32",p_32.getText().toString());
        PostResponseAsyncTask task = new PostResponseAsyncTask(this,PostData);
        task.execute("http://10.0.3.2/myfiles/questionare3.php");
    }

    @Override
    public void processFinish(String result) {
        if(result.equals("sending success !")){
            Intent in= new Intent(this, activity_questions4.class);
            startActivity(in);
        }
        else{
            Toast.makeText(this,"submission failed try again",Toast.LENGTH_LONG).show();
        }
    }
}

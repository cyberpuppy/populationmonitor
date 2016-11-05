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


public class sign_inActivity extends AppCompatActivity implements AsyncResponse, View.OnClickListener {
    EditText IdEt, PasswordEt;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        IdEt = (EditText) findViewById(R.id.Idtext);
        PasswordEt = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(this); {



        };

    }

    @Override
    public void onClick(View v) {

        HashMap postData = new HashMap();
        postData.put("mobile","android");
        postData.put("id", IdEt.getText().toString());
        postData.put("password", PasswordEt.getText().toString());

                PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
                task.execute("http://192.168.0.14/myfiles/connection2.1.php");
    }

    @Override
    public void processFinish(String result) {
            if(result.equals("login success !")){
                Intent in= new Intent(this, questions1.class);
                startActivity(in);
            }
        else{
                Toast.makeText(this,"Login failed try again.",Toast.LENGTH_LONG).show();
            }

    }
}
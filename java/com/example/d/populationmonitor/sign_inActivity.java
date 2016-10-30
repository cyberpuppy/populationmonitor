package com.example.d.populationmonitor;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;



public class sign_inActivity extends ActionBarActivity {
    EditText IdEt, PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        IdEt= (EditText)findViewById(R.id.Idtext);
        PasswordEt = (EditText)findViewById(R.id.password);
    }

    public void OnLogin(View view) {
        String id = IdEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        background background = new background(this);

        background.execute(type, id, password);
    }

}
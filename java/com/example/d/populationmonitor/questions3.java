package com.example.d.populationmonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class questions3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions3);
    }
    public void questions4(View view)
    {
        Intent q4 = new Intent(questions3.this,activity_questions4.class);
        startActivity(q4);
    }
}

package com.example.d.populationmonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class questions2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);
    }

    public void gender(View view) {
        final EditText gender = (EditText) findViewById(R.id.edittext_p11);
    }

//    if(gender.getText().toString.equals("Female"))
//
//    {
//        Intent intent = new Intent(questions2.this, questions3.class);
//        startActivity(intent);
//    }
//
//    else
//
//    {
//        Intent intent = new Intent(questions2.this, questions3.class);
//        startActivity(intent);
//    }
}



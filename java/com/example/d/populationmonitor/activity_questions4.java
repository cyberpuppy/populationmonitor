package com.example.d.populationmonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_questions4 extends AppCompatActivity {
    Spinner spinneruse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);

        spinneruse = (Spinner) findViewById(R.id.spinner);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Visual", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Hearing", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Speech", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Physical", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Mental", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Self care", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Others", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "None", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }



    protected void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);

        spinneruse = (Spinner) findViewById(R.id.spinner2);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Yes", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "No", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "NA", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "DK", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate3(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions4);

        spinneruse = (Spinner) findViewById(R.id.spinner3);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "At school", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Left school", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Never went to school", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "DK", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }
}




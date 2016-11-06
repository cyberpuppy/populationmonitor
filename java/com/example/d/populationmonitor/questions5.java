package com.example.d.populationmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class questions5 extends AppCompatActivity {

    Spinner spinneruse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions5);

        spinneruse = (Spinner) findViewById(R.id.spinner4);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Purchased", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Constructed", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Inherited", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String owned=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate1(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions5);

        spinneruse = (Spinner) findViewById(R.id.spinner5);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Government", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Local Authority", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Parastatal", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Private company", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Individual", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Faith based organization/ NGO", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Other form", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String rent=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }
    public void questions6(View view)
    {
        Intent q4 = new Intent(questions5.this,questions6.class);
        startActivity(q4);
    }
}


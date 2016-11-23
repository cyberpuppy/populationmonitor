package com.example.d.populationmonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class questions6 extends AppCompatActivity {
    Spinner spinneruse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner6);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Corrugated Iron Sheets", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Iron", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Concrete", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Asbestos Sheets", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Grass", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Makuti", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Tin ", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Mud/Dung", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String roof=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }

    
    protected void onCreate1(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner7);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Stone", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Brick/ Block", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Mud/ Wood", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Mud/ Cement", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Wood only", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Corrugated iron sheets", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Grass/ reeds", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Tin", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String wall=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner8);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Cement", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Tiles", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Wood", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Earth", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String floor=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate3(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner9);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Pond", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Dam", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Lake", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Stream/ River", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Protected Spring water", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Unprotected spring water", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Protected well", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Unprotected well", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(), "Borehole", Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        Toast.makeText(getApplicationContext(), "Piped into dwelling", Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        Toast.makeText(getApplicationContext(), "Piped", Toast.LENGTH_LONG).show();
                        break;
                    case 11:
                        Toast.makeText(getApplicationContext(), "Jabia", Toast.LENGTH_LONG).show();
                        break;
                    case 12:
                        Toast.makeText(getApplicationContext(), "Rain/ Harvested", Toast.LENGTH_LONG).show();
                        break;
                    case 13:
                        Toast.makeText(getApplicationContext(), "Water vendor", Toast.LENGTH_LONG).show();
                        break;
                    case 14:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String water=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate4(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner10);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Main sewer", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Septic tank", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Cess pool", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "VIP Pit latrine", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Pit latrine covered", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Pit latrine uncovered", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Bucket latrine", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Bush", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;

                }
                String waste_disposal=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }


    protected void onCreate5(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions6);

        spinneruse = (Spinner) findViewById(R.id.spinner11);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Electricity", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Pressure lamp", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Lanten", Toast.LENGTH_LONG).show();
                        break;
                    default:
                    case 3:
                        Toast.makeText(getApplicationContext(), "Tin lamp", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Gas lamp", Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Fuel wood", Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Solar", Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Other", Toast.LENGTH_LONG).show();
                        break;

                }
                String lighting=spinneruse.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });

    }
//    public void questions7(View view) {
//
//        Intent intent = new Intent(questions6.this, questions7.class);
//        startActivity(intent);
//    }


}



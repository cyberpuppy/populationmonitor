package com.example.d.populationmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class questions1 extends AppCompatActivity implements AsyncResponse, AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener, View.OnClickListener {

    AutoCompleteTextView county;
    private ArrayAdapter<String> adapter;

    EditText Males,females,household_no, Total;
    Button button;


    //These values show in autocomplete
    String counties[] = {"Baringo County", "Bomet County", "Bungoma County", "Busia County", "Elgeyo Marakwet County", "Embu County", "Garissa County",
            "Homa Bay County", "Isiolo County", "Kajiado County", "Kakamega County", "Kericho County", "Kiambu County", "Kilifi County",
            "Kirinyaga County", "Kisii County", "Kisumu County", "Kitui County", "Kwale County", "Laikipia County", "Machakos County", "Makueni County",
            "Mandera County", "Meru County", "Migori County", "Marsabit County", "Mombasa County", "Nairobi County", "Nakuru County", "Nandi County", "Narok County", "Nyamira County",
            "Nyandarua County", "Nyeri County", "Samburu County", "Siaya County", "Taita Taveta County", "Tana River County", "Trans Nzoia County", "Turkana County", "Uasin Gishu County",
            "Vihiga County", "Wajir County", "West Pokot County"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions1);

//        county = (AutoCompleteTextView) findViewById(R.id.county);
        Males = (EditText) findViewById(R.id.editText13);
        females = (EditText) findViewById(R.id.editText14);
        household_no = (EditText) findViewById(R.id.editText9);
        Total =(EditText) findViewById(R.id.editText15);
        county =(AutoCompleteTextView) findViewById(R.id.county);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

        //Create adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, counties );
        county.setThreshold(1);

        //Set adapter to AutoCompleteTextView
        county.setAdapter(adapter);
        county.setOnItemSelectedListener(this);
        county.setOnItemClickListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();

    }


    @Override
    public void onClick(View view) {
        if ((county.length() == 0) || (Males.length() == 0) || (females.length() == 0) || Total.length() == 0 || household_no.length() == 0) {

            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_LONG).show();
        }
        else {
            HashMap PostData = new HashMap();
            PostData.put("mobile", "android");
            PostData.put("Males", Males.getText().toString());
            PostData.put("Females", females.getText().toString());
            PostData.put("Household_NO", household_no.getText().toString());
            PostData.put("Total", Total.getText().toString());
            PostData.put("County", county.getText().toString());
            PostResponseAsyncTask task = new PostResponseAsyncTask(this, PostData);
            task.execute("http://10.0.3.2/myfiles/questionare1.php");
        }
    }
    @Override
    public void processFinish(String result) {
        if(result.equals("sending success !")){
            Intent in= new Intent(this, questions2.class);
            startActivity(in);
        }
        else{
            Toast.makeText(this,"submission failed try again",Toast.LENGTH_LONG).show();
        }
    }





}



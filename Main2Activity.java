package com.example.student.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] banknames={"IOB","SBI","HDFC"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,banknames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), banknames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

            }
        };




package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner_one = findViewById(R.id.spinner_two);
        Spinner spinner_two = findViewById(R.id.spinner_two);
        Spinner spinner_three = findViewById(R.id.spinner_three);
        Spinner spinner_four = findViewById(R.id.spinner_four);
        Spinner spinner_five = findViewById(R.id.spinner_five);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_one.setAdapter(adapter);
        spinner_one.setOnItemSelectedListener(this);
        spinner_two.setAdapter(adapter);
        spinner_two.setOnItemSelectedListener(this);
        spinner_three.setAdapter(adapter);
        spinner_three.setOnItemSelectedListener(this);
        spinner_four.setAdapter(adapter);
        spinner_four.setOnItemSelectedListener(this);
        spinner_five.setAdapter(adapter);
        spinner_five.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
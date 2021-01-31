package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Hashtable;

public class ThreeRingsActivity extends AppCompatActivity {
    Spinner spinner_3_1;
    Spinner spinner_3_2;
    Spinner spinner_3_3;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_rings);
        btn = findViewById(R.id.btn);

        spinner_3_1 = findViewById(R.id.spinner_3_1);
        spinner_3_2 = findViewById(R.id.spinner_3_2);
        spinner_3_3 = findViewById(R.id.spinner_3_3);

        ArrayAdapter<CharSequence> adapter_3_1 = ArrayAdapter.createFromResource(this, R.array.rings, android.R.layout.simple_spinner_item);
        adapter_3_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3_1.setAdapter(adapter_3_1);
        spinner_3_2.setAdapter(adapter_3_1);

        ArrayAdapter<CharSequence> adapter_3_2 = ArrayAdapter.createFromResource(this, R.array.multi, android.R.layout.simple_spinner_item);
        adapter_3_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3_3.setAdapter(adapter_3_2);

        findViewById(R.id.btn_Back_ThreeRings).setOnClickListener(v -> onBack());


        //Values values = ((Values) getApplicationContext());
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onClick(View view) {

    }
}


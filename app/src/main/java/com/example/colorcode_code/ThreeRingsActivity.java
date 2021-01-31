package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ThreeRingsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_rings);
        Spinner spinner_3_1 = findViewById(R.id.spinner_3_1);
        Spinner spinner_3_2 = findViewById(R.id.spinner_3_2);
        Spinner spinner_3_3 = findViewById(R.id.spinner_3_3);
        ArrayAdapter<CharSequence> adapter_3_1 = ArrayAdapter.createFromResource(this, R.array.rings, android.R.layout.simple_spinner_item);
        adapter_3_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3_1.setAdapter(adapter_3_1);
        spinner_3_2.setAdapter(adapter_3_1);
        ArrayAdapter<CharSequence> adapter_3_2 = ArrayAdapter.createFromResource(this, R.array.multi, android.R.layout.simple_spinner_item);
        adapter_3_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3_3.setAdapter(adapter_3_2);


        findViewById(R.id.btn_Back_ThreeRings).setOnClickListener(v -> onBack());
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }
}

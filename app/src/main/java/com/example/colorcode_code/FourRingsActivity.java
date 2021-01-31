package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FourRingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_rings);
        Spinner spinner_4_1 = findViewById(R.id.spinner_4_1);
        Spinner spinner_4_2 = findViewById(R.id.spinner_4_2);
        Spinner spinner_4_3 = findViewById(R.id.spinner_4_3);
        Spinner spinner_4_4 = findViewById(R.id.spinner_4_4);



        ArrayAdapter<CharSequence> adapter_4_1 = ArrayAdapter.createFromResource(this, R.array.rings, android.R.layout.simple_spinner_item);
        adapter_4_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_4_1.setAdapter(adapter_4_1);
        spinner_4_2.setAdapter(adapter_4_1);

        ArrayAdapter<CharSequence> adapter_4_2 = ArrayAdapter.createFromResource(this, R.array.multi, android.R.layout.simple_spinner_item);
        adapter_4_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_4_3.setAdapter(adapter_4_2);

        ArrayAdapter<CharSequence> adapter_4_3 = ArrayAdapter.createFromResource(this, R.array.tole, android.R.layout.simple_spinner_item);
        adapter_4_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_4_4.setAdapter(adapter_4_3);

        findViewById(R.id.btn_BackFourRings).setOnClickListener(v -> onBack());
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
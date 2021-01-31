package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FiveRingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_rings);
        Spinner spinner_5_1 = findViewById(R.id.spinner_5_1);
        Spinner spinner_5_2 = findViewById(R.id.spinner_5_2);
        Spinner spinner_5_3 = findViewById(R.id.spinner_5_3);
        Spinner spinner_5_4 = findViewById(R.id.spinner_5_4);
        Spinner spinner_5_5 = findViewById(R.id.spinner_5_5);

        ArrayAdapter<CharSequence> adapter_5_1 = ArrayAdapter.createFromResource(this, R.array.rings, android.R.layout.simple_spinner_item);
        adapter_5_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_5_1.setAdapter(adapter_5_1);
        spinner_5_2.setAdapter(adapter_5_1);
        spinner_5_3.setAdapter(adapter_5_1);

        ArrayAdapter<CharSequence> adapter_5_2 = ArrayAdapter.createFromResource(this, R.array.multi, android.R.layout.simple_spinner_item);
        adapter_5_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_5_4.setAdapter(adapter_5_2);

        ArrayAdapter<CharSequence> adapter_5_3 = ArrayAdapter.createFromResource(this, R.array.tole, android.R.layout.simple_spinner_item);
        adapter_5_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_5_5.setAdapter(adapter_5_3);

        findViewById(R.id.btn_BackFiveRings).setOnClickListener(v -> onBack());
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }

}


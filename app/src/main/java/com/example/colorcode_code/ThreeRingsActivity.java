package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ThreeRingsActivity extends AppCompatActivity {
    Spinner spinner_3_1;
    Spinner spinner_3_2;
    Spinner spinner_3_3;
    Button btn;
    TextView tv_1 = findViewById(R.id.tv_3_1);
    Values value = ((Values) getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_rings);
        btn = findViewById(R.id.btn_3);

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

    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onClick(View view) {
        String spinner_1 = spinner_3_1.getSelectedItem().toString();
        String spinner_2 = spinner_3_2.getSelectedItem().toString();
        String spinner_3 = spinner_3_3.getSelectedItem().toString();
        String num;

        if (value.dict_ring.get(spinner_1) != 0){
            num = value.dict_ring.get(spinner_1).toString() + value.dict_ring.get(spinner_2).toString();
        }
        else{
            num = value.dict_ring.get(spinner_2).toString();
        }

        int erg = Integer.parseInt(num) * value.dict_multi.get(spinner_3).intValue();
        tv_1.setText(erg);
    }
}


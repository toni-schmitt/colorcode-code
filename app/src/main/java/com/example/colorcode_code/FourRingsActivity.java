package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FourRingsActivity extends AppCompatActivity {
    Spinner spinner_4_1;
    Spinner spinner_4_2;
    Spinner spinner_4_3;
    Spinner spinner_4_4;
    TextView tv_4_1 = findViewById(R.id.tv_4_1);
    TextView tv_4_2 = findViewById(R.id.tv_4_2);
    Values value = ((Values) getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_rings);
        spinner_4_1 = findViewById(R.id.spinner_4_1);
        spinner_4_2 = findViewById(R.id.spinner_4_2);
        spinner_4_3 = findViewById(R.id.spinner_4_3);
        spinner_4_4 = findViewById(R.id.spinner_4_4);



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


    public void onClick(View view) {
        String spinner_1 = spinner_4_1.getSelectedItem().toString();
        String spinner_2 = spinner_4_2.getSelectedItem().toString();
        String spinner_3 = spinner_4_3.getSelectedItem().toString();
        String spinner_4 = spinner_4_4.getSelectedItem().toString();
        String num;

        if (value.dict_ring.get(spinner_1) != 0){
            num = value.dict_ring.get(spinner_1).toString() + value.dict_ring.get(spinner_2).toString();
        }
        else{
            num = value.dict_ring.get(spinner_2).toString();
        }

        int erg = Integer.parseInt(num) * value.dict_multi.get(spinner_3).intValue();
        tv_4_1.setText(erg);
        tv_4_2.setText((erg * value.dict_tole.get(spinner_4)) + " +-");

    }
}
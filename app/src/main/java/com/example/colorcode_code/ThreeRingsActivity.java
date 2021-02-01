package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class ThreeRingsActivity extends AppCompatActivity {
    private Spinner spinner_3_1;
    private Spinner spinner_3_2;
    private Spinner spinner_3_3;
    private TextView tv_Resistance;
    private Values values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_rings);

        tv_Resistance = findViewById(R.id.tv_Resistance_ThreeRings);
        values = ((Values) getApplicationContext());
        values.Init();

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
        findViewById(R.id.btn_Continue_ThreeRings).setOnClickListener(this::onClickThreeRings);

    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onClickThreeRings(View view) {
        String ring1_selected = spinner_3_1.getSelectedItem().toString();
        String ring2_selected = spinner_3_2.getSelectedItem().toString();
        String ring3_selected = spinner_3_3.getSelectedItem().toString();

        if (ring1_selected != null && ring2_selected != null && ring3_selected != null){
            String num = Objects.requireNonNull(values.dict_ring.get(ring1_selected)).toString() + Objects.requireNonNull(values.dict_ring.get(ring2_selected)).toString();
            int erg = Integer.parseInt(num) * Objects.requireNonNull(values.dict_multi.get(ring3_selected)).intValue();
            tv_Resistance.setText(erg);
        }
    }
}


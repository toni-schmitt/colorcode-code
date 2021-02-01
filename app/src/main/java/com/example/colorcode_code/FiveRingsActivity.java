package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class FiveRingsActivity extends AppCompatActivity {
    private Spinner spinner_5_1;
    private Spinner spinner_5_2;
    private Spinner spinner_5_3;
    private Spinner spinner_5_4;
    private Spinner spinner_5_5;
    private TextView tv_Resistance;
    private TextView tv_Tolerance;
    private Values values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_rings);

        tv_Resistance = findViewById(R.id.tv_Resistance_FiveRings);
        tv_Tolerance = findViewById(R.id.tv_Tolerance_FiveRings);
        values = ((Values) getApplicationContext());
        values.Init();

        spinner_5_1 = findViewById(R.id.spinner_5_1);
        spinner_5_2 = findViewById(R.id.spinner_5_2);
        spinner_5_3 = findViewById(R.id.spinner_5_3);
        spinner_5_4 = findViewById(R.id.spinner_5_4);
        spinner_5_5 = findViewById(R.id.spinner_5_5);

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
        findViewById(R.id.btn_Continue_FiveRings).setOnClickListener(this::onClickFiveRings);
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }
//
    public void onClickFiveRings(View view) {
        String ring1_selected = spinner_5_1.getSelectedItem().toString();
        String ring2_selected = spinner_5_2.getSelectedItem().toString();
        String ring3_selected = spinner_5_3.getSelectedItem().toString();
        String ring4_selected = spinner_5_4.getSelectedItem().toString();
        String ring5_selected = spinner_5_5.getSelectedItem().toString();

        String num = values.dict_ring.get(ring1_selected).toString() + values.dict_ring.get(ring2_selected).toString() + values.dict_ring.get(ring3_selected).toString();
        String multi = Objects.requireNonNull(values.dict_multi.get(ring4_selected)).toString();
        String tole = Objects.requireNonNull(values.dict_tole.get(ring5_selected)).toString();

        //int erg_num = Integer.parseInt(num) * (int)Double.parseDouble(multi);

        String erg = (Integer.parseInt(num) * (int)Double.parseDouble(multi)) + " ";
        String erg_tole = (Integer.parseInt(num) * Double.parseDouble(tole)) + " ";
        //erg.replaceAll("0","");
        tv_Resistance.setText(erg);
        tv_Tolerance.setText(erg_tole + " +-");


    }
}


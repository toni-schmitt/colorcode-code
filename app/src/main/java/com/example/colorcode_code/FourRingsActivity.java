package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class FourRingsActivity extends AppCompatActivity {
    private Spinner spinner_4_1;
    private Spinner spinner_4_2;
    private Spinner spinner_4_3;
    private Spinner spinner_4_4;
    private TextView tv_Resistance;
    private TextView tv_Tolerance;
    private Values values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_rings);
        spinner_4_1 = findViewById(R.id.spinner_4_1);
        spinner_4_2 = findViewById(R.id.spinner_4_2);
        spinner_4_3 = findViewById(R.id.spinner_4_3);
        spinner_4_4 = findViewById(R.id.spinner_4_4);

        tv_Resistance = findViewById(R.id.tv_Resistance_FourRings);
        tv_Tolerance = findViewById(R.id.tv_Tolerance_FourRings);
        values = ((Values) getApplicationContext());
        values.Init();

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
        findViewById(R.id.btn_Continue_FourRings).setOnClickListener(this::onClickFourRings);

        Spinner[] spinners = new Spinner[] {
                spinner_4_1,
                spinner_4_2,
                spinner_4_3,
                spinner_4_4
        };

        for (Spinner sp : spinners){
            sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    if (position != -1){
                        values.setColor(sp, sp.getSelectedItem().toString());
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                }

            });
        }
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }


    public void onClickFourRings(View view) {

        tv_Resistance.setText(R.string.tvResistance);
        tv_Tolerance.setText(R.string.tvTolerance);

        String ring1_selected = spinner_4_1.getSelectedItem().toString();
        String ring2_selected = spinner_4_2.getSelectedItem().toString();
        String ring3_selected = spinner_4_3.getSelectedItem().toString();
        String ring4_selected = spinner_4_4.getSelectedItem().toString();

        String num = Objects.requireNonNull(values.dict_ring.get(ring1_selected)).toString() + Objects.requireNonNull(values.dict_ring.get(ring2_selected)).toString();
        String multi = Objects.requireNonNull(values.dict_multi.get(ring3_selected)).toString();
        String tole = Objects.requireNonNull(values.dict_tole.get(ring4_selected)).toString();


        String erg = tv_Resistance.getText() + " " + values.formatNumber(Integer.parseInt(num) * Double.parseDouble(multi)) + " ";
        String erg_tole = tv_Tolerance.getText() + " " + (Integer.parseInt(num) * Double.parseDouble(tole)) + " " + getResources().getString(R.string.plus_minus);
        //erg.replaceAll("0","");
        tv_Resistance.setText(erg);
        tv_Tolerance.setText(erg_tole);

    }
}
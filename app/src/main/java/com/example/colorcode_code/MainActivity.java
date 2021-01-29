package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    final float[] TOLERANCE = new float[]{0f, 1f, 2f, 0f, 0f, 0.5f, 0.25f, 0.1f, 0f, 0f, 5f, 10f};
    // EXTEND THIS TO ALL COLORS
    final int[] COLORS = new int[]{R.color.black};

    private static int _ringCounter = 3;

    private Spinner[] _one_to_three;
    private Spinner[] _four_to_five;

    private TextView _tv_result;
    private TextView _tv_tolerance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _tv_result = findViewById(R.id.tv_result);
        _tv_result = findViewById(R.id.tv_tolerance);

        _one_to_three = new Spinner[]
                {
                        findViewById(R.id.spinner_one),
                        findViewById(R.id.spinner_two),
                        findViewById(R.id.spinner_three)
                };
        _four_to_five = new Spinner[]
                {
                        findViewById(R.id.spinner_four),
                        findViewById(R.id.spinner_five)
                };


        for (Spinner spinner : _one_to_three) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors_till_3, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
        }

        for (Spinner spinner : _four_to_five) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        if (!Arrays.asList(_one_to_three).contains(parent)) {
            if (position != 0)
                _ringCounter++;
            else
                _ringCounter--;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
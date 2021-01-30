package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_Continue).setOnClickListener(v -> openActivity());
    }

    public void openActivity() {
        RadioGroup rg_Rings = findViewById(R.id.rg_RingGroup);

        if (rg_Rings.getCheckedRadioButtonId() == -1) {
            Snackbar.make(findViewById(R.id.btn_Continue), "Choose a Ring count", Snackbar.LENGTH_LONG).show();
            return;
        }

        Intent intent;
        switch (rg_Rings.getResources().getResourceEntryName(rg_Rings.getCheckedRadioButtonId())) {
            case "rb_ThreeRings":
                intent = new Intent(this, ThreeRingsActivity.class);
                break;
            case "rb_FourRings":
                intent = new Intent(this, FourRingsActivity.class);
                break;
            case "rb_FiveRings":
                intent = new Intent(this, FiveRingsActivity.class);
                break;
            default:
                Snackbar.make(findViewById(R.id.btn_Continue), "Something went wrong", Snackbar.LENGTH_LONG);
                return;
        }
        startActivity(intent);

    }

}
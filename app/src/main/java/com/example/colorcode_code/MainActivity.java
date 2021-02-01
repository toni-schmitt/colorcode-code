package com.example.colorcode_code;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_Continue).setOnClickListener(v -> openActivity());
    }

    public void openActivity() {
        RadioGroup rg_Rings = findViewById(R.id.rg_RingGroup);

        if (rg_Rings.getCheckedRadioButtonId() == -1) {
            Snackbar.make(findViewById(R.id.btn_Continue), R.string.err_select_radiobutton, Snackbar.LENGTH_LONG).show();
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
                Snackbar.make(findViewById(R.id.btn_Continue), R.string.err_smth_wrong, Snackbar.LENGTH_LONG);
                return;
        }
        startActivity(intent);

    }



}
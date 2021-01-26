package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_Ring1, btn_Ring2, btn_Ring3, btn_Ring4, btn_Ring5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Ring1 = findViewById(R.id.ring_one);
        btn_Ring2 = findViewById(R.id.ring_two);
        btn_Ring3 = findViewById(R.id.ring_three);
        btn_Ring4 = findViewById(R.id.ring_four);
        btn_Ring5 = findViewById(R.id.ring_five);
    }

    public void calculateResistor() {

    }
}
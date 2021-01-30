package com.example.colorcode_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiveRingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_rings);

        findViewById(R.id.btn_BackFiveRings).setOnClickListener(v -> onBack());
    }

    public void onBack() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
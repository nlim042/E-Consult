package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class DrugNameQ3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_name_q3);

    }

    public void Back(View view) {
        // Create an Intent to start the second activity
        Intent backtoQ3 = new Intent(this, Question3.class);

        // Start the intended activity
        startActivity(backtoQ3);
    }

    public void Next(View view) {
        // Create an Intent to start the second activity
        Intent toQ4 = new Intent(this, Question4.class);

        // Start the intended activity
        startActivity(toQ4);
    }
}

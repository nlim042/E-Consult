package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {
    RadioButton radioYes, radioNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

    }

    public void Next(View view) {
        // Create an Intent to start the second activity
        radioYes = findViewById(R.id.radioYes);
        radioNo = findViewById(R.id.radioNo);
        if (radioYes.isChecked() && !radioNo.isChecked()) {
            Intent drugname = new Intent(this, DrugNameQ3.class);
            startActivity(drugname);
        } else if (radioNo.isChecked() && !radioYes.isChecked()) {
            Intent questionfour = new Intent(this, Question4.class);
            startActivity(questionfour);
        } else {
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_LONG).show();
        }

    }

    public void Back(View view) {
        // Create an Intent to start the second activity
        Intent backToQ2 = new Intent(this, Question2.class);

        // Start the intended activity
        startActivity(backToQ2);
    }

}
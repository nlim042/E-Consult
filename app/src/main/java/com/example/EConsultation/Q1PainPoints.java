package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;

public class Q1PainPoints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_pain_points);
    }

    public void BackQ1Handler(View view){
        Intent backtoQ1 = new Intent(this, Question1.class);
        startActivity(backtoQ1);
    }

    public void NextQ2Handler(View view){
        Intent nexttoQ2 = new Intent(this, Question2.class);
        startActivity(nexttoQ2);
    }
}
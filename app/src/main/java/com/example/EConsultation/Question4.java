package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        Intent intent = getIntent();
    }

    public void Back(View view) {
        // Create an Intent to start the second activity
        Intent intent = new Intent(this, Question3.class);

        // Start the intended activity
        startActivity(intent);
    }
}

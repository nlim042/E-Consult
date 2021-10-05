package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnYesHandler(View view) {
        Intent QuestionOne = new Intent(this, Question1.class);
        startActivity(QuestionOne);
    } //to go to first symptoms question

    //remember to add in btnNoHandler to go back to Home page
}
package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {
    RadioButton yesButton, noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void NextbtnHandler(View view) {
        yesButton = findViewById(R.id.yesmedicineradioButton); //check if Yes is checked
        noButton = findViewById(R.id.nomedicineradioButton2); //check if No is checked
        if (yesButton.isChecked() && !noButton.isChecked()) { //if Yes is checked
            Intent PainPoints = new Intent(this, Q2_medicinetaking.class);
            startActivity(PainPoints); //go to medicine input selection page
        } else if (noButton.isChecked() && !yesButton.isChecked()){ //if No is checked
            Intent QuestionThree = new Intent(this, Question3.class); //CHANGE TO Q3
            startActivity(QuestionThree); //go to Question three
        } else {
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_LONG).show();
        }
    }

    public void BackbtnHandler(View view) {
        Intent backtoQ2 = new Intent(this, Question1.class);
        startActivity(backtoQ2);
    }
}
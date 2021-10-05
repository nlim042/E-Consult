package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {
    CheckBox cbPain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

    }
    public void btnNextHandler(View view) {
        cbPain = findViewById(R.id.PaincheckBox5); //check if Body Pain is checked
        if (cbPain.isChecked()) { //if it is
            Intent PainPoints = new Intent(this, Q1PainPoints.class);
            startActivity(PainPoints); //go to Pain selection page
        } else { //if not
            Intent QuestionTwo = new Intent(this, Question2.class);
            startActivity(QuestionTwo); //go to Question two
        }
    }

    public void btnBackHandler(View view) {
        Intent backtoMain = new Intent(this, MainActivity.class);
        startActivity(backtoMain);
    }

}
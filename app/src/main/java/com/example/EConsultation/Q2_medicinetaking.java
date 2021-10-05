package com.example.EConsultation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;

public class Q2_medicinetaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_medicinetaking);
    }

    public void BackHandler (View view) {
        Intent backtoQ2 = new Intent(this, Question2.class);
        startActivity(backtoQ2); //go to Q2
    }

    public void NextHandler (View view){
        Intent nextToQ3 = new Intent(this, Question3.class); //go to q3
        startActivity(nextToQ3);
    }
}
package com.hyperclock.prashant.basketballcounter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.hyperclock.prashant.basketballcounter.R;

public class MainActivity extends AppCompatActivity {

    Button threePointerA,threePointerB, twoPointerA, twoPointerB, freethrowA, freethrowB, foulA, foulB;
    TextView scoreOfA, scoreOfB;
    int pointsA = 0;
    int pointsB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        threePointerA = findViewById(R.id.threePointersA_b);
        threePointerB = findViewById(R.id.threePoitersB_b);
        twoPointerA = findViewById(R.id.twoPointersA_b);
        twoPointerB = findViewById(R.id.twoPointersB_b);
        freethrowA = findViewById(R.id.freethrowA_b);
        freethrowB = findViewById(R.id.freethrowA_b);
        foulA = findViewById(R.id.foulA_b);
        foulB = findViewById(R.id.foulB_b);
        scoreOfA = findViewById(R.id.teamApoints);
        scoreOfB = findViewById(R.id.teamBpoints);
    }


    public void Add3pointerA(View view) {
        pointsA = pointsA + 3;
        scoreOfA.setText(pointsA);
    }

    public void Add3pointerB(View view){
        pointsB = pointsB + 3;
        scoreOfA.setText(pointsB);
    }


    public void Add2pointerA(View view) {
        pointsA = pointsA + 2;
        scoreOfA.setText(pointsA);
    }

    public void Add2pointerB(View view){
        pointsB = pointsB + 2;
        scoreOfA.setText(pointsB);
    }


    public void AddFreethrowA(View view) {
        pointsA = pointsA + 1;
        scoreOfA.setText(pointsA);
    }

    public void AddFreethrowB(View view){
        pointsB = pointsB + 1;
        scoreOfA.setText(pointsB);
    }


    public void AddFoulA(View view) {
        foulsA++;
        foulA.setText("Fouls = "+foulsA);
    }

    public void AddFoulB(View view){
        foulsB++;
        foulB.setText("Fouls = "+foulsB);
    }
}

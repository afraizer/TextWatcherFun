package com.example.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText gradeWanted = (EditText) findViewById(R.id.gradeEditText);
        EditText minAverageGrade = (EditText) findViewById(R.id.minAverageGrade);
        EditText currentAverageGrade = (EditText) findViewById(R.id.currentAverageGrade);
        EditText finalWeight = (EditText) findViewById(R.id.finalWeight);
    }
}

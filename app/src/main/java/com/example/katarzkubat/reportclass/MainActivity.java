package com.example.katarzkubat.reportclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Double> grade = new ArrayList<Double>(){{add(3.5); add( 2.4); add(4.6);}};
        ArrayList<String> subject =  new ArrayList<String>(){{ add("Math"); add("Chemistry"); add("Philosophy");}};
        String student = "Frank Foucault";
        ReportCard myReport = new ReportCard(student, grade, subject);

        TextView myText = (TextView) findViewById(R.id.myTextView);
        myText.setText(myReport.toString());
    }
}

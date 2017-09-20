package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);

        ReportCard reportCard = new ReportCard(3, 4, 5, 5);
        reportCard.getQ1Grade();
        Log.v("Main Activity", "Display Q1 grade: " + reportCard.getQ1Grade());
        reportCard.setQ1Grade(5);
        Log.v("Main Activity", "Display Q1 grade: " + reportCard.getQ1Grade());
        reportCard.getAverage();
        textView.setText(reportCard.toString());

    }
}

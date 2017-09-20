package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the Result button is pressed
    public void scoreResult(View view) {
        //scoreResult method calls for private methods that increase the score integer value
        //RadioButtons
        getQ1();
        getQ2();
        getQ4();
        getQ5();
        //Checkbox
        getQ3();
        //EditText
        getQ6();
        //If the score is 6, display congratulation toast. If score is < 6, display try again toast
        if (score == 6) {
            Toast.makeText(MainActivity.this, "Congratulations, 6 out of 6. You sure know, how to google!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Your score is " + score + "/6. Please try again.", Toast.LENGTH_SHORT).show();
        }
        //Set the score back to zero so score cannot be bigger than 6
        score = 0;
    }

    //These methods are called by scoreResult. They determine if the correct radio button is checked.
    // Increase Integer score value
    private void getQ1() {
        RadioButton rB = (RadioButton) (findViewById(R.id.Q1A2));
        Boolean buttonTrue = rB.isChecked();
        if (buttonTrue) {
            score++;
        }
    }

    private void getQ2() {
        RadioButton rB = (RadioButton) (findViewById(R.id.Q2A4));
        Boolean buttonTrue = rB.isChecked();
        if (buttonTrue) {
            score++;
        }
    }

    private void getQ4() {
        RadioButton rB = (RadioButton) (findViewById(R.id.Q4A4));
        Boolean buttonTrue = rB.isChecked();
        if (buttonTrue) {
            score++;
        }
    }

    private void getQ5() {
        RadioButton rB = (RadioButton) (findViewById(R.id.Q5A2));
        Boolean buttonTrue = rB.isChecked();
        if (buttonTrue) {
            score++;
        }
    }

    // This method is called by scoreResult. It determines if the correct checkboxes are checked.
    //Increase Integer score value
    private void getQ3() {
        CheckBox rB1 = (CheckBox) (findViewById(R.id.Q3A1));
        Boolean button1True = rB1.isChecked();

        CheckBox rB2 = (CheckBox) (findViewById(R.id.Q3A2));
        Boolean button2True = rB2.isChecked();

        CheckBox rB3 = (CheckBox) (findViewById(R.id.Q3A3));
        Boolean button3True = rB3.isChecked();

        CheckBox rB4 = (CheckBox) (findViewById(R.id.Q3A4));
        Boolean button4True = rB4.isChecked();

        CheckBox rB5 = (CheckBox) (findViewById(R.id.Q3A5));
        Boolean button5True = rB5.isChecked();

        if (!button1True && button2True && button3True && button4True && !button5True) {
            score++;
        }
    }

    //This method is called by scoreResult. It determines if the EditText is valid.
    //Increase Integer score value
    private void getQ6() {
        EditText answer = (EditText) findViewById(R.id.Q6A1);

        if (answer.getText().toString().contains("42")) {
            score++;
        }
    }

}

package com.example.android.snooker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerOneScore = 0;
    int playerTwoScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // These SEVEN methods will be called when Player One buttons 1-7 are clicked.
    public void buttonPO1(View view) {
        playerOneScore = playerOneScore + 1;
        displayForPO(playerOneScore);
    }

    public void buttonPO2(View view) {
        playerOneScore = playerOneScore + 2;
        displayForPO(playerOneScore);
    }

    public void buttonPO3(View view) {
        playerOneScore = playerOneScore + 3;
        displayForPO(playerOneScore);
    }

    public void buttonPO4(View view) {
        playerOneScore = playerOneScore + 4;
        displayForPO(playerOneScore);
    }

    public void buttonPO5(View view) {
        playerOneScore = playerOneScore + 5;
        displayForPO(playerOneScore);
    }

    public void buttonPO6(View view) {
        playerOneScore = playerOneScore + 6;
        displayForPO(playerOneScore);
    }

    public void buttonPO7(View view) {
        playerOneScore = playerOneScore + 7;
        displayForPO(playerOneScore);
    }


    // These SEVEN methods will be called when Player Two buttons 1-7 are clicked.
    public void buttonPT1(View view) {
        playerTwoScore = playerTwoScore + 1;
        displayForPT(playerTwoScore);
    }

    public void buttonPT2(View view) {
        playerTwoScore = playerTwoScore + 2;
        displayForPT(playerTwoScore);
    }

    public void buttonPT3(View view) {
        playerTwoScore = playerTwoScore + 3;
        displayForPT(playerTwoScore);
    }

    public void buttonPT4(View view) {
        playerTwoScore = playerTwoScore + 4;
        displayForPT(playerTwoScore);
    }

    public void buttonPT5(View view) {
        playerTwoScore = playerTwoScore + 5;
        displayForPT(playerTwoScore);
    }

    public void buttonPT6(View view) {
        playerTwoScore = playerTwoScore + 6;
        displayForPT(playerTwoScore);
    }

    public void buttonPT7(View view) {
        playerTwoScore = playerTwoScore + 7;
        displayForPT(playerTwoScore);
    }

    //This method is for the RESET button.
    public void resetScore(View view) {
        playerOneScore = 0;
        playerTwoScore = 0;
        displayForPO(playerOneScore);
        displayForPT(playerTwoScore);
    }

    /**
     * Displays the given score for Player One.
     */
    public void displayForPO(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p_o_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player Two.
     */
    public void displayForPT(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p_t_score);
        scoreView.setText(String.valueOf(score));
    }
}

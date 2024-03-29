package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePoint(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPoint(View view) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreePoint(View view) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    /*Team B*/
    public void addThreePointForTeamB(View view) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointForTeamB(View view) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreePointForTeamB(View view) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void BtnReset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

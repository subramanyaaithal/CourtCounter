package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int TeamAScore = 0;
    int TeamBScore = 0;
    int TeamAPrevScore = TeamAScore;
    int TeamBPrevScore = TeamBScore;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void teamA3points(View view) {
        TeamAPrevScore = TeamAScore;
        TeamAScore = TeamAScore+3;
        displayForTeamA(TeamAScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamA2points(View view) {
        TeamAPrevScore = TeamAScore;
        TeamAScore = TeamAScore+2;
        displayForTeamA(TeamAScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamA1points(View view) {
        TeamAPrevScore = TeamAScore;
        TeamAScore = TeamAScore+1;
        displayForTeamA(TeamAScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamB3points(View view) {
        TeamBPrevScore = TeamBScore;
        TeamBScore = TeamBScore+3;
        displayForTeamB(TeamBScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamB2points(View view) {
        TeamBPrevScore = TeamBScore;
        TeamBScore = TeamBScore+2;
        displayForTeamB(TeamBScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamB1points(View view) {
        TeamBPrevScore = TeamBScore;
        TeamBScore = TeamBScore+1;
        displayForTeamB(TeamBScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void resetScore(View view) {
        TeamAPrevScore = TeamAScore;
        TeamBPrevScore = TeamBScore;
        TeamBScore = 0;
        TeamAScore = 0;
        displayForTeamB(TeamBScore);
        displayForTeamA(TeamAScore);
    }
    /**
     * Reverts the chages done to Score of Team B.
     */
    public void teamBUndo(View view) {
        TeamBScore = TeamBPrevScore;
        displayForTeamB(TeamBScore);

    }
    /**
     * Displays the given score for Team A.
     */
    public void teamAUndo(View view) {
        TeamAScore = TeamAPrevScore;
        displayForTeamA(TeamAScore);

    }
}

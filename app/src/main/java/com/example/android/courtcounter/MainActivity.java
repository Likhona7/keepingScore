package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // displayTeamA(8);
    }
int scoreA = 0;
    int scoreB = 0;

    public void addThreeForTeamA(View view){
        scoreA = 2 + scoreA;
displayTeamA(scoreA);

    }
    public void addTwoForTeamA(View view){
        scoreA = 3 + scoreA;
        displayTeamA(scoreA);
    }
    public void addOneForTeamA(View view){
        scoreA = 1 + scoreA;
        displayTeamA(scoreA);
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public void addThreeForTeamB(View view){
        scoreB = 2 + scoreB;
        displayTeamB(scoreB);

    }
    public void addTwoForTeamB(View view){
        scoreB = 3 + scoreB;
        displayTeamB(scoreB);
    }
    public void addOneForTeamB(View view){
        scoreB = 1 + scoreB;
        displayTeamB(scoreB);
    }

    public void resetBtnA(View view){
        scoreA = 0;
        displayTeamA(scoreA);
    }
    public void resetBtnB(View view){
        scoreB =0;
        displayTeamB(scoreB);
    }
   public void resetGame(View view){
       scoreA =0;
       scoreB =0;
       displayTeamA(scoreA);
       displayTeamB(scoreB);


   }

    public void displayTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }


}

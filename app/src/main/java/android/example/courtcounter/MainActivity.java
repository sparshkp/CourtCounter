package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreTeamA=0;
    int scoreTeamB=0;
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View view)
    {
        scoreTeamA=scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View view)
    {
        scoreTeamA=scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points..
     */
    public void addThreeForTeamA(View view)
    {
        scoreTeamA=scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View view)
    {
        scoreTeamB=scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View view)
    {
        scoreTeamB=scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points..
     */
    public void addThreeForTeamB(View view)
    {
        scoreTeamB=scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void resets_score(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
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
}
package com.example.android.rugbyunionscorecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScores();
    }
    //Global Variable Declaration
    int teamAScore = 0;
    int teamBScore = 0;

    private void displayScores(){
        TextView text = (TextView)findViewById(R.id.teamA_score);
        text.setText("" + teamAScore);
        text = (TextView)findViewById(R.id.teamB_score);
        text.setText("" + teamBScore);
    }
    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScores();
    }
    public void updateTry(View view){
        String parent_id = getResources().getResourceEntryName(((View)view.getParent()).getId());
        switch (parent_id){
            case "teamA":
                teamAScore += 5;
                break;
            case "teamB":
                teamBScore += 5;
                break;
            default:
                break;
        }
        displayScores();
    }
    public void updateKick(View view){
        String parent_id = getResources().getResourceEntryName(((View)view.getParent()).getId());
        switch (parent_id){
            case "teamA":
                teamAScore += 2;
                break;
            case "teamB":
                teamBScore += 2;
                break;
            default:
                break;
        }
        displayScores();
    }
    public void updatePenalty(View view){
        String parent_id = getResources().getResourceEntryName(((View)view.getParent()).getId());
        switch (parent_id){
            case "teamA":
                teamAScore += 3;
                break;
            case "teamB":
                teamBScore += 3;
                break;
            default:
                break;
        }
        displayScores();
    }
    public void updateDrop(View view){
        String parent_id = getResources().getResourceEntryName(((View)view.getParent()).getId());
        switch (parent_id){
            case "teamA":
                teamAScore += 3;
                break;
            case "teamB":
                teamBScore += 3;
                break;
            default:
                break;
        }
        displayScores();
    }

}

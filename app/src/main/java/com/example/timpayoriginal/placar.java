package com.example.timpayoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

public class placar extends AppCompatActivity {
    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;
    private Button btnVoltar1;
    int scoreLeftTeam = 0;
    int scoreRightTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);
        chronometer = findViewById(R.id.chronometer);
        chronometer.setBase(SystemClock.elapsedRealtime());
        btnVoltar1 = (Button) findViewById(R.id.btnVoltar1);
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 10000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(placar.this, "Bing!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVoltar();
            }
            private void btnVoltar(){startActivity(new Intent(placar.this, menu.class));}
        });
    }
    public void submitScoreLeft(View v){
        scoreLeftTeam = scoreLeftTeam +1;
        displayForLeftTeam(scoreLeftTeam);
    }
    public void submitScoreRight (View v){
        scoreRightTeam = scoreRightTeam +1;
        displayForRightTeam(scoreRightTeam);
    }

    private void displayForRightTeam(int scoreRightTeam) {
    }

    private void displayForLeftTeam(int scoreLeftTeam) {
    }

    public void startChronometer(View v) {
        if (!running) {
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            running = true;
        }
    }
    public void pauseChronometer(View v) {
        if (running) {
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }
    }
    public void resetChronometer(View v) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}
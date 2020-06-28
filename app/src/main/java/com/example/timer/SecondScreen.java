package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    private TextView timerText;
    private Button timerButton;

    private CountDownTimer countDownTimer;
    private long timeLeftMilliseconds = 600000;
    private boolean timerRunning;

    int numOfHours;
    int numOfMinutes;
    int numOfRounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        timerText = findViewById(R.id.timer_text);
        timerButton = findViewById(R.id.timer_button);

        timerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAndStop();
            }
        });
    }

    public void initialize(int hours, int minutes, int rounds) {
        numOfHours = hours;
        numOfMinutes = minutes;
        numOfRounds = rounds;
    }

    public void startAndStop() {
        if (timerRunning) {
            stopTimer();
        } else {
            startTimer();
        }
    }

    public void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftMilliseconds = l;
                updateTimeLeft();
            }

            @Override
            public void onFinish() {

            }
        }.start();

        timerButton.setText("PAUSE");
        timerRunning = true;
    }

    public void stopTimer() {
        countDownTimer.cancel();
        timerButton.setText("RESUME");
        timerRunning = false;

    }

    public void updateTimeLeft() {
        int minutes = (int) timeLeftMilliseconds / 60000;
        int seconds = (int) timeLeftMilliseconds % 60000 / 1000;

        String timeRemainingText;
        timeRemainingText = "" + minutes;
        timeRemainingText += ":";
        if (seconds < 10) {
            timeRemainingText += "0";
        }
        timeRemainingText += seconds;
        timerText.setText(timeRemainingText);

    }
}

package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    private TextView timerText;
    private Button timerButton;

    private CountDownTimer countDownTimer;
    private long timeLeftMilliseconds;
    private boolean timerRunning;

    Integer numOfHours;
    Integer numOfMinutes;
    Integer numOfRounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent intent = getIntent();

        numOfHours = Integer.valueOf(intent.getStringExtra("myHours"));
        numOfMinutes = Integer.valueOf(intent.getStringExtra("myMinutes"));
        numOfRounds = Integer.valueOf(intent.getStringExtra("myRounds"));

        timerText = findViewById(R.id.timer_text);
        timerButton = findViewById(R.id.timer_button);

        timeLeftMilliseconds = 3600000 * numOfHours + 60000 * numOfMinutes;

        timerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAndStop();
            }
        });
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

        System.out.println("IN HERE");
        int hours = (int) timeLeftMilliseconds / 3600000;
        int minutes = (int) timeLeftMilliseconds % 3600000 / 60000;
        int seconds = (int) timeLeftMilliseconds % 60000 / 1000;

        System.out.println(minutes);
        System.out.println(seconds);

        String timeRemainingText;
        if (hours > 0) {
            timeRemainingText = "" + hours;
            timeRemainingText += ":";
            if (minutes < 10) {
                timeRemainingText += "0";
            }
            timeRemainingText += minutes;
        } else {
            timeRemainingText = "" + minutes;
        }

        //timeRemainingText = "" + minutes;
        timeRemainingText += ":";
        if (seconds < 10) {
            timeRemainingText += "0";
        }
        timeRemainingText += seconds;
        timerText.setText(timeRemainingText);

        System.out.println(timeRemainingText);

    }
}

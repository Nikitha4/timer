package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner totalTimeHours;
    private Spinner totalTimeMinutes;
    private Spinner intervalTimeHours;
    private Spinner intervalTimeMinutes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTimeHours = findViewById(R.id.totalTimeHours);
        totalTimeMinutes = findViewById(R.id.totalTimeMinutes);
        intervalTimeHours = findViewById(R.id.intervalTimeHours);
        intervalTimeMinutes = findViewById(R.id.intervalTimeMinutes);

        List<Integer> hourOptions = new ArrayList<>();
        hourOptions.add(0);
        hourOptions.add(1);
        hourOptions.add(2);
        hourOptions.add(3);
        hourOptions.add(4);
        hourOptions.add(5);
        hourOptions.add(6);
        hourOptions.add(7);
        hourOptions.add(8);
        hourOptions.add(9);
        hourOptions.add(10);
        hourOptions.add(11);
        hourOptions.add(12);
        hourOptions.add(13);
        hourOptions.add(14);
        hourOptions.add(15);
        hourOptions.add(16);
        hourOptions.add(17);
        hourOptions.add(18);
        hourOptions.add(19);
        hourOptions.add(20);
        hourOptions.add(21);
        hourOptions.add(22);
        hourOptions.add(23);

        List<Integer> minuteOptions = new ArrayList<>();
        minuteOptions.add(0);
        minuteOptions.add(1);
        minuteOptions.add(2);
        minuteOptions.add(3);
        minuteOptions.add(4);
        minuteOptions.add(5);
        minuteOptions.add(6);
        minuteOptions.add(7);
        minuteOptions.add(8);
        minuteOptions.add(9);
        minuteOptions.add(10);
        minuteOptions.add(11);
        minuteOptions.add(12);
        minuteOptions.add(13);
        minuteOptions.add(14);
        minuteOptions.add(15);
        minuteOptions.add(16);
        minuteOptions.add(17);
        minuteOptions.add(18);
        minuteOptions.add(19);
        minuteOptions.add(20);
        minuteOptions.add(21);
        minuteOptions.add(22);
        minuteOptions.add(23);
        minuteOptions.add(24);
        minuteOptions.add(25);
        minuteOptions.add(26);
        minuteOptions.add(27);
        minuteOptions.add(28);
        minuteOptions.add(29);
        minuteOptions.add(30);
        minuteOptions.add(31);
        minuteOptions.add(32);
        minuteOptions.add(33);
        minuteOptions.add(34);
        minuteOptions.add(35);
        minuteOptions.add(36);
        minuteOptions.add(37);
        minuteOptions.add(38);
        minuteOptions.add(39);
        minuteOptions.add(40);
        minuteOptions.add(41);
        minuteOptions.add(42);
        minuteOptions.add(43);
        minuteOptions.add(44);
        minuteOptions.add(45);
        minuteOptions.add(46);
        minuteOptions.add(47);
        minuteOptions.add(48);
        minuteOptions.add(49);
        minuteOptions.add(50);
        minuteOptions.add(51);
        minuteOptions.add(52);
        minuteOptions.add(53);
        minuteOptions.add(54);
        minuteOptions.add(55);
        minuteOptions.add(56);
        minuteOptions.add(57);
        minuteOptions.add(58);
        minuteOptions.add(59);

        ArrayAdapter<Integer> hourAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, hourOptions);
        hourAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        totalTimeHours.setAdapter(hourAdapter);

        ArrayAdapter<Integer> minuteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, minuteOptions);
        minuteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        totalTimeMinutes.setAdapter(minuteAdapter);

        intervalTimeHours.setAdapter(hourAdapter);
        intervalTimeMinutes.setAdapter(minuteAdapter);
    }
}

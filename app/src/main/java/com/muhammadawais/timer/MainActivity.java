package com.muhammadawais.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar timerSeekBar = findViewById(R.id.timerSeekBar);
        final TextView timerTextView = findViewById(R.id.countDown);

//        set max of 60 min and current of 30 seconds
        timerSeekBar.setMax(600);
        timerSeekBar.setProgress(30);

//        change listener
        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                int minutes = i / 60;
                int seconds = i - (minutes * 60);

                String secondString = Integer.toString(seconds);

                if(secondString == "0")
                {
                    secondString = "00";
                }

                timerTextView.setText(Integer.toString(minutes) + ":" + secondString);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

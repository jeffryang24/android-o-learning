package com.example.jeffryangtoni.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.naruto_morning);
        mediaPlayer.start();
    }

    public void doFavor(View view) {
        Button button = (Button)view;

        Log.i("[Player]", String.valueOf(mediaPlayer.getDuration()));

        if (button.getTag().equals("play")) {
            mediaPlayer.start();
        } else if (button.getTag().equals("pause")) {
            mediaPlayer.pause();
        }
    }
}

package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  FirstActivity extends AppCompatActivity {
    Button btnplay;
    MediaPlayer play;
    Button btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnplay=findViewById(R.id.btnplay);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play=MediaPlayer.create(getApplicationContext(),R.raw.chikibombe);
                play.start();
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play!=null && play.isPlaying());

                play.stop();
            }
        });


    }

}

package com.priyanshparekh.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        try {
//            VideoView videoView = new VideoView(this);
//            setContentView(videoView);
            VideoView videoView = findViewById(R.id.video_view);
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_screen_video);
            videoView.setVideoURI(uri);

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    jump();
                }
            });
            videoView.start();
        }
        catch (Exception e) {
            jump();
        }
    }

    private void jump() {
        if (isFinishing())
            return;
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
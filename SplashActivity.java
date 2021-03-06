package com.example.kpgoldtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Button sub;
    Animation frombottom, fromtop;
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sub = (Button) findViewById(R.id.splashbtm);
        imv = (ImageView) findViewById(R.id.splashlogo);



        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        sub.setAnimation(frombottom);
        imv.setAnimation(fromtop);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainActivity();

            }
        }) ;


    };


    private void goToMainActivity() { Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
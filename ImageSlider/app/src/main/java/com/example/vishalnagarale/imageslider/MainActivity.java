package com.example.vishalnagarale.imageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Animation Fade_in, Fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.flipper);
        Fade_in = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out = AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        //Set out flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }
}

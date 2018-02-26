package com.sulekha.animationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = new MyAnimation(image, 100);
                anim.setDuration(3000);
                image.startAnimation(anim);
            }
        });
        /*Circle circle = findViewById(R.id.circle);

        CircleAngleAnimation animation = new CircleAngleAnimation(circle, 240);
        animation.setDuration(1000);
        circle.startAnimation(animation);*/
    }
}

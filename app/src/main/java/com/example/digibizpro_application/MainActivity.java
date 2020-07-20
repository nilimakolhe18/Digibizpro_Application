package com.example.digibizpro_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout laytop, laybottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move();
        laytop = findViewById(R.id.lineartop);
        laybottom = findViewById(R.id.linearbottom);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
    }

    private void move() {
        ImageView img_animation1 = (ImageView) findViewById(R.id.imageView);
        ImageView img_animation2 = (ImageView) findViewById(R.id.imageView1);

        TranslateAnimation animation1 = new TranslateAnimation(-500.0f, 0.0f, 0.0f, 0.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)

        animation1.setDuration(3000);            // animation duration


        img_animation1.startAnimation(animation1);

        TranslateAnimation animation2 = new TranslateAnimation(500.0f, 0.0f, 0.0f, 0.0f);       //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation2.setDuration(3000);            // animation duration


        img_animation2.setAnimation(animation2);
        img_animation2.startAnimation(animation2);

        animation2.setAnimationListener(new Animation.AnimationListener() {


            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Start your activity here.
                laytop.setVisibility(View.GONE);
                laybottom.setVisibility(View.VISIBLE);
                move2();

            }


            private void move2() {
                ImageView img_animation3 = (ImageView) findViewById(R.id.imageViewleftbottom);
                ImageView img_animation4 = (ImageView) findViewById(R.id.imageViewrightbottom);

                TranslateAnimation animation3 = new TranslateAnimation(0.0f, -500.0f, 0.0f, 0.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
                animation3.setDuration(4000);            // animation duration


                img_animation3.startAnimation(animation3);


                TranslateAnimation animation4 = new TranslateAnimation(0.0f, 550.0f, 0.0f, 0.0f);       //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
                animation4.setDuration(4000);            // animation duration


                img_animation4.setAnimation(animation4);
                img_animation4.startAnimation(animation4);

                animation3.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        laytop.setVisibility(View.GONE);
                        laybottom.setVisibility(View.GONE);
                        Intent intent = new Intent(MainActivity.this, Welcome_Activity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

            }
        });


    }


}
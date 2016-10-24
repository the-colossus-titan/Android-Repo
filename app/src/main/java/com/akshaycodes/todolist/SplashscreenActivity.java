package com.akshaycodes.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //create thread to show the screen for certain time(3sec)
        final Thread splashScreenThread=new Thread(){
            @Override
            public void run()
            {
                try
                {
                    sleep(3000);
                    Intent i=new Intent(SplashscreenActivity.this,LandingActivity.class);
                    startActivity(i);
                    finish();
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        splashScreenThread.start();
    }
}

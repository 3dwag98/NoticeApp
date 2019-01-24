package com.example.admin.noticeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screeen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screeen);
    Thread mythread = new Thread(){
        @Override
        public void run() {
            try {
                sleep(3000);
                Intent intent = new Intent(getApplicationContext(),Login_window.class);
                startActivity(intent);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
        mythread.start();
    }
}

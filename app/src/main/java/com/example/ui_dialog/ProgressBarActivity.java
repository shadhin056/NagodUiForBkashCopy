package com.example.ui_dialog;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBarActivity extends AppCompatActivity {

    Button btn;
    ProgressBar pB;
    int mProgressStatus=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        btn = findViewById(R.id.btn);
        pB = findViewById(R.id.pB);


        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.post(rotationRunnable);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mProgressStatus=0;
                    pB.setProgress(mProgressStatus);
                }
                return false;
            }
        });
        mProgressStatus=0;
    }

    private Runnable rotationRunnable = new Runnable() {
        @Override
        public void run() {

            if (btn.isPressed()) {
                mProgressStatus++;
                if(mProgressStatus==100){
                    Toast.makeText(ProgressBarActivity.this,"Congratulation",Toast.LENGTH_LONG).show();
                }
                pB.setProgress(mProgressStatus);
                btn.postDelayed(rotationRunnable, 10);
            }
        }
    };

}

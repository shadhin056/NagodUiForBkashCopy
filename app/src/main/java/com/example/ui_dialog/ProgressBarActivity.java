package com.example.ui_dialog;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBarActivity extends AppCompatActivity {

    RelativeLayout btn;
    ProgressBar pB;
    int mProgressStatus=0;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        btn = findViewById(R.id.btn);
        pB = findViewById(R.id.pB);
        textview = findViewById(R.id.textview);


        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.post(rotationRunnable);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mProgressStatus=0;
                    textview.setText(mProgressStatus + " %");
                    pB.setProgress(mProgressStatus);
                }
                return false;
            }
        });
    }

    private Runnable rotationRunnable = new Runnable() {
        @Override
        public void run() {

            if (btn.isPressed()) {

                if( mProgressStatus!=100){
                    textview.setText(mProgressStatus + " %");
                    pB.setProgress(mProgressStatus);
                    mProgressStatus=mProgressStatus+2;
                }else if(mProgressStatus==100){
                    pB.setProgress(mProgressStatus);
                    Toast.makeText(ProgressBarActivity.this,"Congratulation",Toast.LENGTH_SHORT).show();
                    textview.setText(mProgressStatus + " %");
                }else {
                    pB.setProgress(mProgressStatus);
                }
                btn.postDelayed(rotationRunnable, 10);
            }
        }
    };

}

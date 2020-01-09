package com.example.ui_dialog;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Processbar2Activity extends AppCompatActivity {
   private TextView txtProgress;
    RelativeLayout btn;
    ProgressBar pB;
    int mProgressStatus=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processbar2);
        txtProgress = (TextView) findViewById(R.id.txtProgress);
        pB = (ProgressBar) findViewById(R.id.pB);
        btn =   findViewById(R.id.btn);


        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.post(rotationRunnable);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mProgressStatus=0;
                    txtProgress.setText(mProgressStatus + " %");
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
                    txtProgress.setText(mProgressStatus + " %");
                    mProgressStatus++;
                }
                if(mProgressStatus==100){
                    Toast.makeText(Processbar2Activity.this,"Congratulation",Toast.LENGTH_LONG).show();
                    txtProgress.setText(mProgressStatus + " %");
                }
                pB.setProgress(mProgressStatus);
                btn.postDelayed(rotationRunnable, 10);
            }
        }
    };
    }


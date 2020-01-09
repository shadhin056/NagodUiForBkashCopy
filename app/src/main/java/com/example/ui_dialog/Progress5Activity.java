package com.example.ui_dialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Progress5Activity extends AppCompatActivity {
    private TextView txtProgress;
    RelativeLayout btn;
    com.github.lzyzsd.circleprogress.ArcProgress pB;
    int mProgressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress5);
        txtProgress = (TextView) findViewById(R.id.txtProgress);
        pB = findViewById(R.id.pB);
        btn = findViewById(R.id.btn);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.post(rotationRunnable);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    mProgressStatus = 0;
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
                if (btn.isPressed()) {

                    if (mProgressStatus != 100) {
                        txtProgress.setText(mProgressStatus + " %");
                        pB.setProgress(mProgressStatus);
                        mProgressStatus++;
                    } else if (mProgressStatus == 100) {
                        pB.setProgress(mProgressStatus);
                        Toast.makeText(Progress5Activity.this, "Congratulation", Toast.LENGTH_SHORT).show();
                        txtProgress.setText(mProgressStatus + " %");
                    } else {
                        pB.setProgress(mProgressStatus);
                    }
                    btn.postDelayed(rotationRunnable, 10);
                }
            }
        }
    };
}

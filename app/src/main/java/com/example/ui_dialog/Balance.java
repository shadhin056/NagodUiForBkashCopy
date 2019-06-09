package com.example.ui_dialog;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.loadingview.LoadingDialog;

public class Balance extends AppCompatActivity {
    com.github.loadingview.LoadingView loading_view;
    TextView checkBalance;
    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_balance);

        checkBalance=findViewById(R.id.checkBalance);
        loading_view=findViewById(R.id.loading_view);

        checkBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading_view.start();
                checkBalance.setText("Loading");
                new Handler().postDelayed(new Runnable() {

                    /*
                     * Showing splash screen with a timer. This will be useful when you
                     * want to show case your app logo / company
                     */

                    @Override
                    public void run() {
                        loading_view.stop();
                        loading_view.setVisibility(View.GONE);
                        checkBalance.setText("10tk");
                        // This method will be executed once the timer is over
                        // Start your app main activity
                        // close this activity
                        //finish();
                    }
                }, SPLASH_TIME_OUT);


            }
        });


    }
}

package com.example.ui_dialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {
    Button btnAlert;
    Button btnBalance;
    Button btnCOnfirmation;
    Button btnDIalogPaymentSuccess;
    Button DPDC;
    Button Main;
    Button Success;
    Button Success2;
    Button Utility;
    Button WASA;
    Button Dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        btnAlert = findViewById(R.id.btnAlert);
        btnBalance = findViewById(R.id.btnBalance);
        btnCOnfirmation = findViewById(R.id.btnCOnfirmation);

        DPDC = findViewById(R.id.DPDC);
        Main = findViewById(R.id.Main);
        Success = findViewById(R.id.Success);
        Success2 = findViewById(R.id.Success2);
        Utility = findViewById(R.id.Utility);
        WASA = findViewById(R.id.WASA);
        Dashboard = findViewById(R.id.Dashboard);


        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, Alert.class);
                startActivity(intent);
            }
        });
        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, Balance.class);
                startActivity(intent);
            }
        });
        btnCOnfirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, Confirmation.class);
                startActivity(intent);
            }
        });

        DPDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, DPDCActivity.class);
                startActivity(intent);
            }
        });
        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, success.class);
                startActivity(intent);
            }
        });
        Success2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, SuccessActivity.class);
                startActivity(intent);
            }
        });
        Utility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, UtilityBills.class);
                startActivity(intent);
            }
        });
        WASA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, WASAActivity.class);
                startActivity(intent);
            }
        }); Dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(IndexActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}

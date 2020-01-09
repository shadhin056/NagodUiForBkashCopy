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
    Button btnT1;
    Button btnT2;
    Button btnT3;
    Button btnT4;
    Button btnT5;
    Button btnReg;
    Button btnDashboard2;
    Button btnDashboard3;
    Button Dashboard0;
    Button btnProgress;
    Button btnProgress1;
    Button btnProgress2;
    Button btnProgress3;
    Button btnProgress4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        btnAlert = findViewById(R.id.btnAlert);
        btnBalance = findViewById(R.id.btnBalance);
        btnCOnfirmation = findViewById(R.id.btnCOnfirmation);
        btnProgress = findViewById(R.id.btnProgress);
        btnProgress1 = findViewById(R.id.btnProgress1);
        btnProgress2 = findViewById(R.id.btnProgress2);
        btnProgress3 = findViewById(R.id.btnProgress3);
        btnProgress4 = findViewById(R.id.btnProgress4);

        DPDC = findViewById(R.id.DPDC);
        Main = findViewById(R.id.Main);
        Success = findViewById(R.id.Success);
        Success2 = findViewById(R.id.Success2);
        Utility = findViewById(R.id.Utility);
        WASA = findViewById(R.id.WASA);
        Dashboard = findViewById(R.id.Dashboard);
        btnT1 = findViewById(R.id.btnT1);
        btnT2 = findViewById(R.id.btnT2);
        btnT3 = findViewById(R.id.btnT3);
        btnT4 = findViewById(R.id.btnT4);
        btnT5 = findViewById(R.id.btnT5);
        btnReg = findViewById(R.id.btnReg);
        btnDashboard2 = findViewById(R.id.btnDashboard2);
        btnDashboard3 = findViewById(R.id.btnDashboard3);
        Dashboard0 = findViewById(R.id.Dashboard0);


        btnProgress4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Progress5Activity.class);
                startActivity(intent);
            }
        }); btnProgress3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Process4Activity.class);
                startActivity(intent);
            }
        }); btnProgress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Progress3Activity.class);
                startActivity(intent);
            }
        }); btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, ProgressBarActivity.class);
                startActivity(intent);
            }
        });btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Alert.class);
                startActivity(intent);
            }
        });
        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Balance.class);
                startActivity(intent);
            }
        });
        btnCOnfirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, Confirmation.class);
                startActivity(intent);
            }
        });

        DPDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DPDCActivity.class);
                startActivity(intent);
            }
        });
        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, success.class);
                startActivity(intent);
            }
        });
        Success2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, SuccessActivity.class);
                startActivity(intent);
            }
        });
        Utility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, UtilityBills.class);
                startActivity(intent);
            }
        });
        WASA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, WASAActivity.class);
                startActivity(intent);
            }
        }); Dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        }); btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, T1Activity.class);
                startActivity(intent);
            }
        }); btnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, T2Activity.class);
                startActivity(intent);
            }
        }); btnT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, T3Activity.class);
                startActivity(intent);
            }
        });


        btnT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, T4Activity.class);
                startActivity(intent);
            }
        });

        btnT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, T5Activity.class);
                startActivity(intent);
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndexActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });
        btnDashboard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndexActivity.this, Dashboard2Activity.class);
                startActivity(intent);
            }
        });btnDashboard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndexActivity.this, Dashboard3Activity.class);
                startActivity(intent);
            }
        });Dashboard0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndexActivity.this, Dashboard4Activity.class);
                startActivity(intent);
            }
        });btnProgress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IndexActivity.this, Processbar2Activity.class);
                startActivity(intent);
            }
        });



    }
}

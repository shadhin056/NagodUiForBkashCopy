package com.example.ui_dialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class UtilityBills extends AppCompatActivity {
    Spinner sp_source_account;
    Button btnSubmit;
    LinearLayout llnext;
    ImageView ivnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility_bills);
        sp_source_account = findViewById(R.id.sp_source_account);
        btnSubmit = findViewById(R.id.btnSubmit);
        ivnext = findViewById(R.id.ivnext);
        llnext = findViewById(R.id.llnext);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(UtilityBills.this,
                R.array.country, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
// Apply the adapter to the spinner
        sp_source_account.setAdapter(adapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent = new Intent(UtilityBills.this, SuccessActivity.class);
                startActivity(intent);
            }
        });
        ivnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llnext.setVisibility(View.VISIBLE);

            }
        });
    }
}

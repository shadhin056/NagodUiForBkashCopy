package com.example.ui_dialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class UtilityBills extends AppCompatActivity {
    Spinner sp_source_account;
    ImageView btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility_bills);
        sp_source_account = findViewById(R.id.sp_source_account);
        btnSubmit = findViewById(R.id.btnSubmit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(UtilityBills.this,
                R.array.country, R.layout.spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.spinner_item);
// Apply the adapter to the spinner
        sp_source_account.setAdapter(adapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String action;
                Intent intent=new Intent(UtilityBills.this,Confirmation.class);
                startActivity(intent);
            }
        });
    }
}

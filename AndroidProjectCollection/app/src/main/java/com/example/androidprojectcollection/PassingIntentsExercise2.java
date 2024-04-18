package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        TextView firstname = findViewById(R.id.textView27);
        TextView lastname = findViewById(R.id.textView29);
        TextView gender = findViewById(R.id.textView31);
        TextView bdate = findViewById(R.id.textView33);
        TextView phone = findViewById(R.id.textView35);
        TextView email = findViewById(R.id.textView37);
        TextView age = findViewById(R.id.textView39);
        TextView address = findViewById(R.id.textView41);
        TextView bplace = findViewById(R.id.textView43);
        TextView year = findViewById(R.id.textView45);
        TextView eth = findViewById(R.id.textView47);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String gen = intent.getStringExtra("gender");
        String bdater = intent.getStringExtra("bdate");
        String phoner = intent.getStringExtra("phone");
        String emailr = intent.getStringExtra("email");
        String ager = intent.getStringExtra("age");
        String addressr = intent.getStringExtra("address");
        String bplacer = intent.getStringExtra("bplace");
        String yearr = intent.getStringExtra("year");
        String ethr = intent.getStringExtra("eth");

        firstname.setText(fname);
        lastname.setText(lname);
        gender.setText(gen);
        bdate.setText(bdater);
        phone.setText(phoner);
        email.setText(emailr);
        age.setText(ager);
        address.setText(addressr);
        bplace.setText(bplacer);
        year.setText(yearr);
        eth.setText(ethr);

        Button ret = findViewById(R.id.button60);
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class PassingIntentsExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        Button submitbut =findViewById(R.id.button59);
        submitbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
                EditText editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
                RadioButton rmale = findViewById(R.id.radioButton4);
                RadioButton rfemale = findViewById(R.id.radioButton5);
                RadioButton rboth = findViewById(R.id.radioButton6);

                EditText bdate = findViewById(R.id.editTextTextPersonName4);
                EditText phone = findViewById(R.id.editTextTextPersonName5);
                EditText emial = findViewById(R.id.editTextTextPersonName6);
                EditText age = findViewById(R.id.editTextTextPersonName7);
                EditText address = findViewById(R.id.editTextTextPersonName8);
                EditText bplace = findViewById(R.id.editTextTextPersonName9);
                EditText year = findViewById(R.id.editTextTextPersonName10);
                EditText eth= findViewById(R.id.editTextTextPersonName11);

                if(editTextTextPersonName.getText().toString().length() == 0 || editTextTextPersonName3.getText().toString().length() == 0|| bdate.getText().toString().length() == 0 || phone.getText().toString().length() == 0 || emial.getText().toString().length() == 0|| age.getText().toString().length() == 0 || address.getText().toString().length() == 0 || bplace.getText().toString().length() == 0 || year.getText().toString().length() == 0 || eth.getText().toString().length() == 0){
                    return;
                }

                if(rmale.isChecked() == false && rfemale.isChecked() == false && rboth.isChecked() == false){
                    return;
                }

                String fname = editTextTextPersonName.getText().toString();
                String lname = editTextTextPersonName3.getText().toString();

                String gender;
                if(rmale.isChecked()){
                    gender = "Male";
                }
                else if(rfemale.isChecked()){
                    gender = "Female";
                }
                else{
                    gender = "Both";
                }

                String bd = bdate.getText().toString();
                String ph = phone.getText().toString();
                String em = emial.getText().toString();
                String ag = age.getText().toString();
                String ad = address.getText().toString();
                String bp = bplace.getText().toString();
                String yr = year.getText().toString();
                String et = eth.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this,PassingIntentsExercise2.class);
                intent.putExtra("fname",fname);
                intent.putExtra("lname",lname);
                intent.putExtra("gender",gender);
                intent.putExtra("bdate",bd);
                intent.putExtra("phone",ph);
                intent.putExtra("email",em);
                intent.putExtra("age",ag);
                intent.putExtra("address",ad);
                intent.putExtra("bplace",bp);
                intent.putExtra("year",yr);
                intent.putExtra("eth",et);

                startActivity(intent);


            }
        });

        Button clear = findViewById(R.id.button58);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
                EditText editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
                RadioButton rmale = findViewById(R.id.radioButton4);
                RadioButton rfemale = findViewById(R.id.radioButton5);
                RadioButton rboth = findViewById(R.id.radioButton6);

                EditText bdate = findViewById(R.id.editTextTextPersonName4);
                EditText phone = findViewById(R.id.editTextTextPersonName5);
                EditText emial = findViewById(R.id.editTextTextPersonName6);
                EditText age = findViewById(R.id.editTextTextPersonName7);
                EditText address = findViewById(R.id.editTextTextPersonName8);
                EditText bplace = findViewById(R.id.editTextTextPersonName9);
                EditText year = findViewById(R.id.editTextTextPersonName10);
                EditText eth= findViewById(R.id.editTextTextPersonName11);




                editTextTextPersonName.setText("");
                editTextTextPersonName3.setText("");
                rmale.setChecked(false);
                rfemale.setChecked(false);
                rboth.setChecked(false);
                bdate.setText("");
                phone.setText("");
                emial.setText("");
                age.setText("");
                address.setText("");
                bplace.setText("");
                year.setText("");
                eth.setText("");
            }
        });

        RadioButton rmale = findViewById(R.id.radioButton4);
        RadioButton rfemale = findViewById(R.id.radioButton5);
        RadioButton rboth = findViewById(R.id.radioButton6);

        rmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rfemale.setChecked(false);
                rboth.setChecked(false);
                rmale.setChecked(true);
            }
        });

        rfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rfemale.setChecked(true);
                rboth.setChecked(false);
                rmale.setChecked(false);
            }
        });

        rboth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rfemale.setChecked(false);
                rboth.setChecked(true);
                rmale.setChecked(false);
            }
        });
    }


}
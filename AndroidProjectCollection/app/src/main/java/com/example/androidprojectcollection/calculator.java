package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    boolean goodtogo = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btn22 = (Button) findViewById(R.id.button22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn22.getText().charAt(0) == '+' || btn22.getText().charAt(0) == '-' || btn22.getText().charAt(0) == '*' || btn22.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn22.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn22.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });


        Button btn21 = (Button) findViewById(R.id.button21);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn21.getText().charAt(0) == '+' || btn21.getText().charAt(0) == '-' || btn21.getText().charAt(0) == '*' || btn21.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn21.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn21.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn19 = (Button) findViewById(R.id.button19);

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn19.getText().charAt(0) == '+' || btn19.getText().charAt(0) == '-' || btn19.getText().charAt(0) == '*' || btn19.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn19.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn19.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });


        Button btn12 = (Button) findViewById(R.id.button12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn12.getText().charAt(0) == '+' || btn12.getText().charAt(0) == '-' || btn12.getText().charAt(0) == '*' || btn12.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn12.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn12.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });


        Button btn25 = (Button) findViewById(R.id.button25);

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn25.getText().charAt(0) == '+' || btn25.getText().charAt(0) == '-' || btn25.getText().charAt(0) == '*' || btn25.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn25.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn25.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn24 = (Button) findViewById(R.id.button24);

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn24.getText().charAt(0) == '+' || btn24.getText().charAt(0) == '-' || btn24.getText().charAt(0) == '*' || btn24.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn24.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn24.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn23 = (Button) findViewById(R.id.button23);

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn23.getText().charAt(0) == '+' || btn23.getText().charAt(0) == '-' || btn23.getText().charAt(0) == '*' || btn23.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn23.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn23.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn13 = (Button) findViewById(R.id.button13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn13.getText().charAt(0) == '+' || btn13.getText().charAt(0) == '-' || btn13.getText().charAt(0) == '*' || btn13.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn13.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn13.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });

        Button btn28 = (Button) findViewById(R.id.button28);

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn28.getText().charAt(0) == '+' || btn28.getText().charAt(0) == '-' || btn28.getText().charAt(0) == '*' || btn28.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn28.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn28.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });


        Button btn27 = (Button) findViewById(R.id.button27);

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn27.getText().charAt(0) == '+' || btn27.getText().charAt(0) == '-' || btn27.getText().charAt(0) == '*' || btn27.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn27.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn27.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn26 = (Button) findViewById(R.id.button26);

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn26.getText().charAt(0) == '+' || btn26.getText().charAt(0) == '-' || btn26.getText().charAt(0) == '*' || btn26.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn26.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn26.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });


        Button btn14 = (Button) findViewById(R.id.button14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn14.getText().charAt(0) == '+' || btn14.getText().charAt(0) == '-' || btn14.getText().charAt(0) == '*' || btn14.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn14.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn14.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }
                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });

        Button btn15 = (Button) findViewById(R.id.button15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if(goodtogo == false){
                    return;
                }
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn15.getText().charAt(0) == '+' || btn15.getText().charAt(0) == '-' || btn15.getText().charAt(0) == '*' || btn15.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn15.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = false;
                }
                else{
                        String newstring = (String) textview2.getText();
                        newstring+=btn15.getText().toString();
                        textview2.setText(newstring);
                        goodtogo = false;
                }
            }
        });

        Button btn16 = (Button) findViewById(R.id.button16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn16.getText().charAt(0) == '+' || btn16.getText().charAt(0) == '-' || btn16.getText().charAt(0) == '*' || btn16.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn16.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn16.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn17 = (Button) findViewById(R.id.button17);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn17.getText().charAt(0) == '+' || btn17.getText().charAt(0) == '-' || btn17.getText().charAt(0) == '*' || btn17.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn17.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = textview2.getText().toString();
                    newstring+=btn17.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }
                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });

        Button btn18 = (Button) findViewById(R.id.button18);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodtogo = true;
                TextView textview2 = findViewById(R.id.textView2);
                if(textview2.getText().toString().length() == 0){
                    return;
                }
                if(((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/' || textview2.getText().charAt(textview2.getText().length()-1) == '.'))) {
                    /*String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn18.getText().toString();
                    textview2.setText(cutstring);
                     */
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    textview2.setText(cutstring);

                    EditText pastehere = (EditText) findViewById(R.id.editTextNumberDecimal);

                    MyClalcClass calculate = new MyClalcClass();
                    pastehere.setText(calculate.evaluateMDAS((String) textview2.getText())+"");
                    textview2.setText("");

                }
                else{
                    /*String newstring = (String) textview2.getText();
                    newstring+=btn18.getText().toString();
                    textview2.setText(newstring);*/

                    EditText pastehere = (EditText) findViewById(R.id.editTextNumberDecimal);

                    MyClalcClass calculate = new MyClalcClass();
                    pastehere.setText(calculate.evaluateMDAS((String) textview2.getText())+"");
                    textview2.setText("");

                }
            }
        });


    }
}
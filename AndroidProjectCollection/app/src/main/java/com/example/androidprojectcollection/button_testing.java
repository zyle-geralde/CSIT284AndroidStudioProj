package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class button_testing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_testing);

        Button b1 =  findViewById(R.id.button11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setVisibility(View.GONE);
            }
        });

        Button bgbutton  = findViewById(R.id.button10);
        bgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bgbutton.setBackgroundColor(Color.GREEN);

            }
        });

        Button bgbuttoncons  = findViewById(R.id.button9);
        ConstraintLayout css = findViewById(R.id.backchange);
        bgbuttoncons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                css.setBackgroundColor(Color.BLACK);
            }
        });


        Button Toasts  = findViewById(R.id.button8);
        TextView tx = findViewById(R.id.textView2);
        Toasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text= "Hello World";
                Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();

            }
        });

        Button Close  = findViewById(R.id.button7);
        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(button_testing.this, return_button.class));
            }
        });





    }
}
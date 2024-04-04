package com.example.myfirstmobileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("\"User tapped the Supabutton\"");
                /*TextView txtx = (TextView) findViewById(R.id.textView3);
                txtx.setText("nono");
                txtx.setVisibility(View.VISIBLE);*/

                LinearLayout layout = (LinearLayout ) findViewById(R.id.kkk);
                TextView ttt = new TextView(v.getContext());
                ttt.setText("hahahha");
                ttt.setVisibility(View.VISIBLE);
                layout.addView(ttt);
            }
        });

        Button buttonsetName = (Button) findViewById(R.id.button22);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView changename = (TextView) findViewById(R.id.textView2);
                TextInputLayout ttt = (TextInputLayout) findViewById(R.id.inputName) ;
            }
        });



    }

}
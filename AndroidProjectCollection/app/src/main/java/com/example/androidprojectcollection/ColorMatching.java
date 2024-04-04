package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ColorMatching extends AppCompatActivity {
    int game = 0;

    ArrayList<Button> btnlist = new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_matching);

        Toast.makeText(getApplicationContext(),"Zyle Geralde L. de la Pena - Color Matching",Toast.LENGTH_LONG).show();

        Button btn1 = (Button) findViewById(R.id.button4);
        btnlist.add(btn1);

        Button btn2 = (Button) findViewById(R.id.button3);
        btnlist.add(btn2);

        Button btn3 = (Button) findViewById(R.id.button);
        btnlist.add(btn3);

        Button btn4 = (Button) findViewById(R.id.button6);
        btnlist.add(btn4);

        Button btn5 = (Button) findViewById(R.id.button5);
        btnlist.add(btn5);

        Button btn6 = (Button) findViewById(R.id.button2);
        btnlist.add(btn6);

        Button btn7 = (Button) findViewById(R.id.button9);
        btnlist.add(btn7);

        Button btn8 = (Button) findViewById(R.id.button8);
        btnlist.add(btn8);

        Button btn9 = (Button) findViewById(R.id.button7);
        btnlist.add(btn9);


        for(Button bb: btnlist){
            int rand = (int)(Math.random()*3)+1;

            if(rand == 1){
                bb.setBackgroundColor(Color.RED);
                bb.setTextColor(Color.RED);
            }
            else if(rand == 2){
                bb.setBackgroundColor(Color.GREEN);
                bb.setTextColor(Color.GREEN);
            }
            else{
                bb.setBackgroundColor(Color.BLUE);
                bb.setTextColor(Color.BLUE);
            }
        }

        btnlist.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(1));
                bblist.add(btnlist.get(3));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(0));
                bblist.add(btnlist.get(2));
                bblist.add(btnlist.get(4));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(1));
                bblist.add(btnlist.get(5));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(0));
                bblist.add(btnlist.get(4));
                bblist.add(btnlist.get(6));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(1));
                bblist.add(btnlist.get(3));
                bblist.add(btnlist.get(5));
                bblist.add(btnlist.get(7));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(2));
                bblist.add(btnlist.get(4));
                bblist.add(btnlist.get(8));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });


        btnlist.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(3));
                bblist.add(btnlist.get(7));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(4));
                bblist.add(btnlist.get(6));
                bblist.add(btnlist.get(8));

                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        btnlist.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game != 0){
                    return;
                }
                ArrayList<Button> bblist = new ArrayList<>();

                bblist.add(btnlist.get(5));
                bblist.add(btnlist.get(7));


                for(Button j: bblist){
                    if(j.getCurrentTextColor() == Color.RED){
                        j.setBackgroundColor(Color.GREEN);
                        j.setTextColor(Color.GREEN);
                    }
                    else if(j.getCurrentTextColor() == Color.GREEN){
                        j.setBackgroundColor(Color.BLUE);
                        j.setTextColor(Color.BLUE);
                    }
                    else{
                        j.setBackgroundColor(Color.RED);
                        j.setTextColor(Color.RED);
                    }
                }
                check();
            }
        });

        Button retme = (Button) findViewById(R.id.returnbut);
        retme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(Button bb: btnlist){
                    int rand = (int)(Math.random()*3)+1;

                    if(rand == 1){
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                    else if(rand == 2){
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    }
                    else{
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    }
                }

                game = 0;
            }
        });


        Button towinbut = (Button) findViewById(R.id.toWinbut);
        towinbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game = 0;
                btnlist.get(0).setTextColor(Color.RED);
                btnlist.get(0).setBackgroundColor(Color.RED);

                btnlist.get(1).setTextColor(Color.BLUE);
                btnlist.get(1).setBackgroundColor(Color.BLUE);

                btnlist.get(2).setTextColor(Color.RED);
                btnlist.get(2).setBackgroundColor(Color.RED);

                btnlist.get(3).setTextColor(Color.BLUE);
                btnlist.get(3).setBackgroundColor(Color.BLUE);

                btnlist.get(4).setTextColor(Color.RED);
                btnlist.get(4).setBackgroundColor(Color.RED);

                btnlist.get(5).setTextColor(Color.BLUE);
                btnlist.get(5).setBackgroundColor(Color.BLUE);

                btnlist.get(6).setTextColor(Color.RED);
                btnlist.get(6).setBackgroundColor(Color.RED);

                btnlist.get(7).setTextColor(Color.BLUE);
                btnlist.get(7).setBackgroundColor(Color.BLUE);

                btnlist.get(8).setTextColor(Color.RED);
                btnlist.get(8).setBackgroundColor(Color.RED);

            }
        });

    }

    public void check(){
        int count[] = {0,0,0};
        for(Button bb: btnlist){
            if(bb.getCurrentTextColor() == Color.RED){
                count[0]++;
            }
            else if(bb.getCurrentTextColor() == Color.GREEN){
                count[1]++;
            }
            else{
                count[2]++;
            }
        }

        for(int loop = 0; loop<3; loop++){
            if(count[loop] == 9){
                game = 1;
                return;
            }
        }
    }
}
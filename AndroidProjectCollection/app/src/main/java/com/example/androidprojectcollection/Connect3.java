package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Connect3 extends AppCompatActivity {

    public boolean game_over = false;

    ArrayList<Button> col1 = new ArrayList<Button>();
    ArrayList<Button> col2 = new ArrayList<Button>();
    ArrayList<Button> col3 = new ArrayList<Button>();
    ArrayList<Button> col4 = new ArrayList<Button>();
    ArrayList<Button> col5 = new ArrayList<Button>();

    ArrayList<Button> row1 = new ArrayList<Button>();
    ArrayList<Button> row2 = new ArrayList<Button>();
    ArrayList<Button> row3 = new ArrayList<Button>();
    ArrayList<Button> row4 = new ArrayList<Button>();
    ArrayList<Button> row5 = new ArrayList<Button>();

    ArrayList<Button> ld1 = new ArrayList<Button>();
    ArrayList<Button> ld2 = new ArrayList<Button>();
    ArrayList<Button> ld3 = new ArrayList<Button>();
    ArrayList<Button> ld4 = new ArrayList<Button>();
    ArrayList<Button> ld5 = new ArrayList<Button>();

    ArrayList<Button> rd1 = new ArrayList<Button>();
    ArrayList<Button> rd2 = new ArrayList<Button>();
    ArrayList<Button> rd3 = new ArrayList<Button>();
    ArrayList<Button> rd4 = new ArrayList<Button>();
    ArrayList<Button> rd5 = new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);

        ///col1
        Button btn29 = (Button) findViewById(R.id.button29);
        Button btn34 = (Button) findViewById(R.id.button34);
        Button btn39 = (Button) findViewById(R.id.button39);
        Button btn44 = (Button) findViewById(R.id.button44);
        Button btn49 = (Button) findViewById(R.id.button49);
        col1.add(btn29);
        col1.add(btn34);
        col1.add(btn39);
        col1.add(btn44);
        col1.add(btn49);
        Collections.reverse(col1);


        ///col2
        Button btn30 = (Button) findViewById(R.id.button30);
        Button btn35 = (Button) findViewById(R.id.button35);
        Button btn40 = (Button) findViewById(R.id.button40);
        Button btn45 = (Button) findViewById(R.id.button45);
        Button btn50 = (Button) findViewById(R.id.button50);
        col2.add(btn30);
        col2.add(btn35);
        col2.add(btn40);
        col2.add(btn45);
        col2.add(btn50);
        Collections.reverse(col2);

        ///col3
        Button btn31 = (Button) findViewById(R.id.button31);
        Button btn36 = (Button) findViewById(R.id.button36);
        Button btn41 = (Button) findViewById(R.id.button41);
        Button btn46 = (Button) findViewById(R.id.button46);
        Button btn51 = (Button) findViewById(R.id.button51);
        col3.add(btn31);
        col3.add(btn36);
        col3.add(btn41);
        col3.add(btn46);
        col3.add(btn51);
        Collections.reverse(col3);

        ///col4
        Button btn32 = (Button) findViewById(R.id.button32);
        Button btn37 = (Button) findViewById(R.id.button37);
        Button btn42 = (Button) findViewById(R.id.button42);
        Button btn47 = (Button) findViewById(R.id.button47);
        Button btn52 = (Button) findViewById(R.id.button52);
        col4.add(btn32);
        col4.add(btn37);
        col4.add(btn42);
        col4.add(btn47);
        col4.add(btn52);
        Collections.reverse(col4);


        ///col5
        Button btn33 = (Button) findViewById(R.id.button33);
        Button btn38 = (Button) findViewById(R.id.button38);
        Button btn43 = (Button) findViewById(R.id.button43);
        Button btn48 = (Button) findViewById(R.id.button48);
        Button btn53 = (Button) findViewById(R.id.button53);
        col5.add(btn33);
        col5.add(btn38);
        col5.add(btn43);
        col5.add(btn48);
        col5.add(btn53);
        Collections.reverse(col5);


        row1.add(btn29);
        row1.add(btn30);
        row1.add(btn31);
        row1.add(btn32);
        row1.add(btn33);

        row2.add(btn34);
        row2.add(btn35);
        row2.add(btn36);
        row2.add(btn37);
        row2.add(btn38);

        row3.add(btn39);
        row3.add(btn40);
        row3.add(btn41);
        row3.add(btn42);
        row3.add(btn43);

        row4.add(btn44);
        row4.add(btn45);
        row4.add(btn46);
        row4.add(btn47);
        row4.add(btn48);

        row5.add(btn49);
        row5.add(btn50);
        row5.add(btn51);
        row5.add(btn52);
        row5.add(btn53);

        ld1.add(btn31);
        ld1.add(btn37);
        ld1.add(btn43);

        ld2.add(btn30);
        ld2.add(btn36);
        ld2.add(btn42);
        ld2.add(btn48);

        ld3.add(btn29);
        ld3.add(btn35);
        ld3.add(btn41);
        ld3.add(btn47);
        ld3.add(btn53);

        ld4.add(btn34);
        ld4.add(btn40);
        ld4.add(btn46);
        ld4.add(btn52);

        ld5.add(btn39);
        ld5.add(btn45);
        ld5.add(btn51);


        rd1.add(btn31);
        rd1.add(btn35);
        rd1.add(btn49);

        rd2.add(btn32);
        rd2.add(btn36);
        rd2.add(btn40);
        rd2.add(btn44);

        rd3.add(btn33);
        rd3.add(btn37);
        rd3.add(btn41);
        rd3.add(btn45);
        rd3.add(btn49);

        rd4.add(btn38);
        rd4.add(btn42);
        rd4.add(btn46);
        rd4.add(btn50);

        rd5.add(btn43);
        rd5.add(btn47);
        rd5.add(btn51);



        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game_over == true){
                    return;
                }
                TextView plr = (TextView) findViewById(R.id.textView11);
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                String pp = plr.getText().toString();
                if(pp.equals("Player1")){
                    for(Button btn: col1){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.BLACK);
                            btn.setBackgroundResource(R.drawable.p1color);
                            plr.setText("Player2");
                            plrback.setBackgroundColor(Color.RED);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
                else{
                    for(Button btn: col1){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.RED);
                            btn.setBackgroundResource(R.drawable.p2color);
                            plr.setText("Player1");
                            plrback.setBackgroundColor(Color.BLACK);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
            }
        });


        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game_over == true){
                    return;
                }
                TextView plr = (TextView) findViewById(R.id.textView11);
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                String pp = plr.getText().toString();
                if(pp.equals("Player1")){
                    for(Button btn: col2){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.BLACK);
                            btn.setBackgroundResource(R.drawable.p1color);
                            plr.setText("Player2");
                            plrback.setBackgroundColor(Color.RED);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
                else{
                    for(Button btn: col2){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.RED);
                            btn.setBackgroundResource(R.drawable.p2color);
                            plr.setText("Player1");
                            plrback.setBackgroundColor(Color.BLACK);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game_over == true){
                    return;
                }
                TextView plr = (TextView) findViewById(R.id.textView11);
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                String pp = plr.getText().toString();
                if(pp.equals("Player1")){
                    for(Button btn: col3){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.BLACK);
                            btn.setBackgroundResource(R.drawable.p1color);
                            plr.setText("Player2");
                            plrback.setBackgroundColor(Color.RED);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
                else{
                    for(Button btn: col3){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.RED);
                            btn.setBackgroundResource(R.drawable.p2color);
                            plr.setText("Player1");
                            plrback.setBackgroundColor(Color.BLACK);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game_over == true){
                    return;
                }
                TextView plr = (TextView) findViewById(R.id.textView11);
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                String pp = plr.getText().toString();
                if(pp.equals("Player1")){
                    for(Button btn: col4){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.BLACK);
                            btn.setBackgroundResource(R.drawable.p1color);
                            plr.setText("Player2");
                            plrback.setBackgroundColor(Color.RED);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
                else{
                    for(Button btn: col4){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.RED);
                            btn.setBackgroundResource(R.drawable.p2color);
                            plr.setText("Player1");
                            plrback.setBackgroundColor(Color.BLACK);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(game_over == true){
                    return;
                }
                TextView plr = (TextView) findViewById(R.id.textView11);
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                String pp = plr.getText().toString();
                if(pp.equals("Player1")){
                    for(Button btn: col5){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.BLACK);
                            btn.setBackgroundResource(R.drawable.p1color);
                            plr.setText("Player2");
                            plrback.setBackgroundColor(Color.RED);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
                else{
                    for(Button btn: col5){
                        if(btn.getCurrentTextColor() == Color.WHITE){
                            btn.setTextColor(Color.RED);
                            btn.setBackgroundResource(R.drawable.p2color);
                            plr.setText("Player1");
                            plrback.setBackgroundColor(Color.BLACK);
                            checkme();
                            rowchek();
                            ldcheck();
                            rdcheck();
                            return;
                        }
                    }
                }
            }
        });

        Button reset = (Button) findViewById(R.id.button54);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game_over = false;
                TextView plr = (TextView) findViewById(R.id.textView11);
                plr.setText("Player1");
                LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
                plrback.setBackgroundColor(Color.BLACK);
                for(Button b: col1){
                    b.setBackgroundResource(R.drawable.round_btn);
                    b.setTextColor(Color.WHITE);
                }

                for(Button b: col2){
                    b.setBackgroundResource(R.drawable.round_btn);
                    b.setTextColor(Color.WHITE);
                }

                for(Button b: col3){
                    b.setBackgroundResource(R.drawable.round_btn);
                    b.setTextColor(Color.WHITE);
                }

                for(Button b: col4){
                    b.setBackgroundResource(R.drawable.round_btn);
                    b.setTextColor(Color.WHITE);
                }

                for(Button b: col5){
                    b.setBackgroundResource(R.drawable.round_btn);
                    b.setTextColor(Color.WHITE);
                }
            }
        });
    }

    public void checkme(){
        //colcheck
        //black
        if((col1.get(0).getCurrentTextColor() == Color.BLACK && col1.get(1).getCurrentTextColor() == Color.BLACK && col1.get(2).getCurrentTextColor() == Color.BLACK )||
                (col1.get(1).getCurrentTextColor() == Color.BLACK && col1.get(2).getCurrentTextColor() == Color.BLACK && col1.get(3).getCurrentTextColor() == Color.BLACK) ||
                (col1.get(2).getCurrentTextColor() == Color.BLACK && col1.get(3).getCurrentTextColor() == Color.BLACK && col1.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((col2.get(0).getCurrentTextColor() == Color.BLACK && col2.get(1).getCurrentTextColor() == Color.BLACK && col2.get(2).getCurrentTextColor() == Color.BLACK )||
                (col2.get(1).getCurrentTextColor() == Color.BLACK && col2.get(2).getCurrentTextColor() == Color.BLACK && col2.get(3).getCurrentTextColor() == Color.BLACK) ||
                (col2.get(2).getCurrentTextColor() == Color.BLACK && col2.get(3).getCurrentTextColor() == Color.BLACK && col2.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((col3.get(0).getCurrentTextColor() == Color.BLACK && col3.get(1).getCurrentTextColor() == Color.BLACK && col3.get(2).getCurrentTextColor() == Color.BLACK )||
                (col3.get(1).getCurrentTextColor() == Color.BLACK && col3.get(2).getCurrentTextColor() == Color.BLACK && col3.get(3).getCurrentTextColor() == Color.BLACK) ||
                (col3.get(2).getCurrentTextColor() == Color.BLACK && col3.get(3).getCurrentTextColor() == Color.BLACK && col3.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((col4.get(0).getCurrentTextColor() == Color.BLACK && col4.get(1).getCurrentTextColor() == Color.BLACK && col4.get(2).getCurrentTextColor() == Color.BLACK )||
                (col4.get(1).getCurrentTextColor() == Color.BLACK && col4.get(2).getCurrentTextColor() == Color.BLACK && col4.get(3).getCurrentTextColor() == Color.BLACK) ||
                (col4.get(2).getCurrentTextColor() == Color.BLACK && col4.get(3).getCurrentTextColor() == Color.BLACK && col4.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((col5.get(0).getCurrentTextColor() == Color.BLACK && col5.get(1).getCurrentTextColor() == Color.BLACK && col5.get(2).getCurrentTextColor() == Color.BLACK )||
                (col5.get(1).getCurrentTextColor() == Color.BLACK && col5.get(2).getCurrentTextColor() == Color.BLACK && col5.get(3).getCurrentTextColor() == Color.BLACK) ||
                (col5.get(2).getCurrentTextColor() == Color.BLACK && col5.get(3).getCurrentTextColor() == Color.BLACK && col5.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }

        //red
        if((col1.get(0).getCurrentTextColor() == Color.RED && col1.get(1).getCurrentTextColor() == Color.RED && col1.get(2).getCurrentTextColor() == Color.RED )||
                (col1.get(1).getCurrentTextColor() == Color.RED && col1.get(2).getCurrentTextColor() == Color.RED && col1.get(3).getCurrentTextColor() == Color.RED) ||
                (col1.get(2).getCurrentTextColor() == Color.RED && col1.get(3).getCurrentTextColor() == Color.RED && col1.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((col2.get(0).getCurrentTextColor() == Color.RED && col2.get(1).getCurrentTextColor() == Color.RED && col2.get(2).getCurrentTextColor() == Color.RED )||
                (col2.get(1).getCurrentTextColor() == Color.RED && col2.get(2).getCurrentTextColor() == Color.RED && col2.get(3).getCurrentTextColor() == Color.RED) ||
                (col2.get(2).getCurrentTextColor() == Color.RED && col2.get(3).getCurrentTextColor() == Color.RED && col2.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((col3.get(0).getCurrentTextColor() == Color.RED && col3.get(1).getCurrentTextColor() == Color.RED && col3.get(2).getCurrentTextColor() == Color.RED )||
                (col3.get(1).getCurrentTextColor() == Color.RED && col3.get(2).getCurrentTextColor() == Color.RED && col3.get(3).getCurrentTextColor() == Color.RED) ||
                (col3.get(2).getCurrentTextColor() == Color.RED && col3.get(3).getCurrentTextColor() == Color.RED && col3.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((col4.get(0).getCurrentTextColor() == Color.RED && col4.get(1).getCurrentTextColor() == Color.RED && col4.get(2).getCurrentTextColor() == Color.RED )||
                (col4.get(1).getCurrentTextColor() == Color.RED && col4.get(2).getCurrentTextColor() == Color.RED && col4.get(3).getCurrentTextColor() == Color.RED) ||
                (col4.get(2).getCurrentTextColor() == Color.RED && col4.get(3).getCurrentTextColor() == Color.RED && col4.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((col5.get(0).getCurrentTextColor() == Color.RED && col5.get(1).getCurrentTextColor() == Color.RED && col5.get(2).getCurrentTextColor() == Color.RED )||
                (col5.get(1).getCurrentTextColor() == Color.RED && col5.get(2).getCurrentTextColor() == Color.RED && col5.get(3).getCurrentTextColor() == Color.RED) ||
                (col5.get(2).getCurrentTextColor() == Color.RED && col5.get(3).getCurrentTextColor() == Color.RED && col5.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
    }
    public void rowchek(){
        //rowcheck
        //black
        if((row1.get(0).getCurrentTextColor() == Color.BLACK && row1.get(1).getCurrentTextColor() == Color.BLACK && row1.get(2).getCurrentTextColor() == Color.BLACK )||
                (row1.get(1).getCurrentTextColor() == Color.BLACK && row1.get(2).getCurrentTextColor() == Color.BLACK && row1.get(3).getCurrentTextColor() == Color.BLACK) ||
                (row1.get(2).getCurrentTextColor() == Color.BLACK && row1.get(3).getCurrentTextColor() == Color.BLACK && row1.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((row2.get(0).getCurrentTextColor() == Color.BLACK && row2.get(1).getCurrentTextColor() == Color.BLACK && row2.get(2).getCurrentTextColor() == Color.BLACK )||
                (row2.get(1).getCurrentTextColor() == Color.BLACK && row2.get(2).getCurrentTextColor() == Color.BLACK && row2.get(3).getCurrentTextColor() == Color.BLACK) ||
                (row2.get(2).getCurrentTextColor() == Color.BLACK && row2.get(3).getCurrentTextColor() == Color.BLACK && row2.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((row3.get(0).getCurrentTextColor() == Color.BLACK && row3.get(1).getCurrentTextColor() == Color.BLACK && row3.get(2).getCurrentTextColor() == Color.BLACK )||
                (row3.get(1).getCurrentTextColor() == Color.BLACK && row3.get(2).getCurrentTextColor() == Color.BLACK && row3.get(3).getCurrentTextColor() == Color.BLACK) ||
                (row3.get(2).getCurrentTextColor() == Color.BLACK && row3.get(3).getCurrentTextColor() == Color.BLACK && row3.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((row4.get(0).getCurrentTextColor() == Color.BLACK && row4.get(1).getCurrentTextColor() == Color.BLACK && row4.get(2).getCurrentTextColor() == Color.BLACK )||
                (row4.get(1).getCurrentTextColor() == Color.BLACK && row4.get(2).getCurrentTextColor() == Color.BLACK && row4.get(3).getCurrentTextColor() == Color.BLACK) ||
                (row4.get(2).getCurrentTextColor() == Color.BLACK && row4.get(3).getCurrentTextColor() == Color.BLACK && row4.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if((row5.get(0).getCurrentTextColor() == Color.BLACK && row5.get(1).getCurrentTextColor() == Color.BLACK && row5.get(2).getCurrentTextColor() == Color.BLACK )||
                (row5.get(1).getCurrentTextColor() == Color.BLACK && row5.get(2).getCurrentTextColor() == Color.BLACK && row5.get(3).getCurrentTextColor() == Color.BLACK) ||
                (row5.get(2).getCurrentTextColor() == Color.BLACK && row5.get(3).getCurrentTextColor() == Color.BLACK && row5.get(4).getCurrentTextColor() == Color.BLACK)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }

        //red
        if((row1.get(0).getCurrentTextColor() == Color.RED && row1.get(1).getCurrentTextColor() == Color.RED && row1.get(2).getCurrentTextColor() == Color.RED )||
                (row1.get(1).getCurrentTextColor() == Color.RED && row1.get(2).getCurrentTextColor() == Color.RED && row1.get(3).getCurrentTextColor() == Color.RED) ||
                (row1.get(2).getCurrentTextColor() == Color.RED && row1.get(3).getCurrentTextColor() == Color.RED && row1.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((row2.get(0).getCurrentTextColor() == Color.RED && row2.get(1).getCurrentTextColor() == Color.RED && row2.get(2).getCurrentTextColor() == Color.RED )||
                (row2.get(1).getCurrentTextColor() == Color.RED && row2.get(2).getCurrentTextColor() == Color.RED && row2.get(3).getCurrentTextColor() == Color.RED) ||
                (row2.get(2).getCurrentTextColor() == Color.RED && row2.get(3).getCurrentTextColor() == Color.RED && row2.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((row3.get(0).getCurrentTextColor() == Color.RED && row3.get(1).getCurrentTextColor() == Color.RED && row3.get(2).getCurrentTextColor() == Color.RED )||
                (row3.get(1).getCurrentTextColor() == Color.RED && row3.get(2).getCurrentTextColor() == Color.RED && row3.get(3).getCurrentTextColor() == Color.RED) ||
                (row3.get(2).getCurrentTextColor() == Color.RED && row3.get(3).getCurrentTextColor() == Color.RED && row3.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((row4.get(0).getCurrentTextColor() == Color.RED && row4.get(1).getCurrentTextColor() == Color.RED && row4.get(2).getCurrentTextColor() == Color.RED )||
                (row4.get(1).getCurrentTextColor() == Color.RED && row4.get(2).getCurrentTextColor() == Color.RED && row4.get(3).getCurrentTextColor() == Color.RED) ||
                (row4.get(2).getCurrentTextColor() == Color.RED && row4.get(3).getCurrentTextColor() == Color.RED && row4.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if((row5.get(0).getCurrentTextColor() == Color.RED && row5.get(1).getCurrentTextColor() == Color.RED && row5.get(2).getCurrentTextColor() == Color.RED )||
                (row5.get(1).getCurrentTextColor() == Color.RED && row5.get(2).getCurrentTextColor() == Color.RED && row5.get(3).getCurrentTextColor() == Color.RED) ||
                (row5.get(2).getCurrentTextColor() == Color.RED && row5.get(3).getCurrentTextColor() == Color.RED && row5.get(4).getCurrentTextColor() == Color.RED)){
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
    }

    public void ldcheck() {
        //ld
        //black
        if ((ld1.get(0).getCurrentTextColor() == Color.BLACK && ld1.get(1).getCurrentTextColor() == Color.BLACK && ld1.get(2).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((ld2.get(0).getCurrentTextColor() == Color.BLACK && ld2.get(1).getCurrentTextColor() == Color.BLACK && ld2.get(2).getCurrentTextColor() == Color.BLACK) ||
                (ld2.get(1).getCurrentTextColor() == Color.BLACK && ld2.get(2).getCurrentTextColor() == Color.BLACK && ld2.get(3).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((ld3.get(0).getCurrentTextColor() == Color.BLACK && ld3.get(1).getCurrentTextColor() == Color.BLACK && ld3.get(2).getCurrentTextColor() == Color.BLACK) ||
                (ld3.get(1).getCurrentTextColor() == Color.BLACK && ld3.get(2).getCurrentTextColor() == Color.BLACK && ld3.get(3).getCurrentTextColor() == Color.BLACK) ||
                (ld3.get(2).getCurrentTextColor() == Color.BLACK && ld3.get(3).getCurrentTextColor() == Color.BLACK && ld3.get(4).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((ld4.get(0).getCurrentTextColor() == Color.BLACK && ld4.get(1).getCurrentTextColor() == Color.BLACK && ld4.get(2).getCurrentTextColor() == Color.BLACK) ||
                (ld4.get(1).getCurrentTextColor() == Color.BLACK && ld4.get(2).getCurrentTextColor() == Color.BLACK && ld4.get(3).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((ld5.get(0).getCurrentTextColor() == Color.BLACK && ld5.get(1).getCurrentTextColor() == Color.BLACK && ld5.get(2).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }


        //red
        if ((ld1.get(0).getCurrentTextColor() == Color.RED && ld1.get(1).getCurrentTextColor() == Color.RED && ld1.get(2).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((ld2.get(0).getCurrentTextColor() == Color.RED && ld2.get(1).getCurrentTextColor() == Color.RED && ld2.get(2).getCurrentTextColor() == Color.RED) ||
                (ld2.get(1).getCurrentTextColor() == Color.RED && ld2.get(2).getCurrentTextColor() == Color.RED && ld2.get(3).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((ld3.get(0).getCurrentTextColor() == Color.RED && ld3.get(1).getCurrentTextColor() == Color.RED && ld3.get(2).getCurrentTextColor() == Color.RED) ||
                (ld3.get(1).getCurrentTextColor() == Color.RED && ld3.get(2).getCurrentTextColor() == Color.RED && ld3.get(3).getCurrentTextColor() == Color.RED) ||
                (ld3.get(2).getCurrentTextColor() == Color.RED && ld3.get(3).getCurrentTextColor() == Color.RED && ld3.get(4).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((ld4.get(0).getCurrentTextColor() == Color.RED && ld4.get(1).getCurrentTextColor() == Color.RED && ld4.get(2).getCurrentTextColor() == Color.RED) ||
                (ld4.get(1).getCurrentTextColor() == Color.RED && ld4.get(2).getCurrentTextColor() == Color.RED && ld4.get(3).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((ld5.get(0).getCurrentTextColor() == Color.RED && ld5.get(1).getCurrentTextColor() == Color.RED && ld5.get(2).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
    }

    public void rdcheck(){
//ld
//black
        if ((rd1.get(0).getCurrentTextColor() == Color.BLACK && rd1.get(1).getCurrentTextColor() == Color.BLACK && rd1.get(2).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((rd2.get(0).getCurrentTextColor() == Color.BLACK && rd2.get(1).getCurrentTextColor() == Color.BLACK && rd2.get(2).getCurrentTextColor() == Color.BLACK) ||
                (rd2.get(1).getCurrentTextColor() == Color.BLACK && rd2.get(2).getCurrentTextColor() == Color.BLACK && rd2.get(3).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((rd3.get(0).getCurrentTextColor() == Color.BLACK && rd3.get(1).getCurrentTextColor() == Color.BLACK && rd3.get(2).getCurrentTextColor() == Color.BLACK) ||
                (rd3.get(1).getCurrentTextColor() == Color.BLACK && rd3.get(2).getCurrentTextColor() == Color.BLACK && rd3.get(3).getCurrentTextColor() == Color.BLACK) ||
                (rd3.get(2).getCurrentTextColor() == Color.BLACK && rd3.get(3).getCurrentTextColor() == Color.BLACK && rd3.get(4).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((rd4.get(0).getCurrentTextColor() == Color.BLACK && rd4.get(1).getCurrentTextColor() == Color.BLACK && rd4.get(2).getCurrentTextColor() == Color.BLACK) ||
                (rd4.get(1).getCurrentTextColor() == Color.BLACK && rd4.get(2).getCurrentTextColor() == Color.BLACK && rd4.get(3).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }
        if ((rd5.get(0).getCurrentTextColor() == Color.BLACK && rd5.get(1).getCurrentTextColor() == Color.BLACK && rd5.get(2).getCurrentTextColor() == Color.BLACK)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 1 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.BLACK);
            return;
        }


//red
        if ((rd1.get(0).getCurrentTextColor() == Color.RED && rd1.get(1).getCurrentTextColor() == Color.RED && rd1.get(2).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((rd2.get(0).getCurrentTextColor() == Color.RED && rd2.get(1).getCurrentTextColor() == Color.RED && rd2.get(2).getCurrentTextColor() == Color.RED) ||
                (rd2.get(1).getCurrentTextColor() == Color.RED && rd2.get(2).getCurrentTextColor() == Color.RED && rd2.get(3).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((rd3.get(0).getCurrentTextColor() == Color.RED && rd3.get(1).getCurrentTextColor() == Color.RED && rd3.get(2).getCurrentTextColor() == Color.RED) ||
                (rd3.get(1).getCurrentTextColor() == Color.RED && rd3.get(2).getCurrentTextColor() == Color.RED && rd3.get(3).getCurrentTextColor() == Color.RED) ||
                (rd3.get(2).getCurrentTextColor() == Color.RED && rd3.get(3).getCurrentTextColor() == Color.RED && rd3.get(4).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((rd4.get(0).getCurrentTextColor() == Color.RED && rd4.get(1).getCurrentTextColor() == Color.RED && rd4.get(2).getCurrentTextColor() == Color.RED) ||
                (rd4.get(1).getCurrentTextColor() == Color.RED && rd4.get(2).getCurrentTextColor() == Color.RED && rd4.get(3).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }
        if ((rd5.get(0).getCurrentTextColor() == Color.RED && rd5.get(1).getCurrentTextColor() == Color.RED && rd5.get(2).getCurrentTextColor() == Color.RED)) {
            game_over = true;
            TextView plr = (TextView) findViewById(R.id.textView11);
            plr.setText("Player 2 Wins");
            LinearLayout plrback = (LinearLayout) findViewById(R.id.playerLayout);
            plrback.setBackgroundColor(Color.RED);
            return;
        }

    }
}
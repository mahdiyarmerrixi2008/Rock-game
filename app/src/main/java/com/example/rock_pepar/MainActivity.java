package com.example.rock_pepar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random;
        Intent intent;
        final String[] am = new String[1];
        intent = getIntent();
        Button mnextPage=(Button) findViewById(R.id.nextPage);
        ImageView mimagePlayer = (ImageView) findViewById(R.id.imagePlayer);
        AppCompatButton mpater1buttom = (AppCompatButton) findViewById(R.id.pater1buttom);
        AppCompatButton mpater2buttom = (AppCompatButton) findViewById(R.id.pater2buttom);
        AppCompatButton mresult = (AppCompatButton) findViewById(R.id.result);
        ImageView mimagebot = (ImageView) findViewById(R.id.imagebot);
        AppCompatTextView mresulttext=(AppCompatTextView) findViewById(R.id.resulttext);
        mpater1buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] game = {"paper", "rock", "sirreze"};
                int be;
                Random random = new Random();
                be = random.nextInt(3);
                am[0] = game[be];
                if (am[0] == "paper") {
                    mimagePlayer.setImageResource(R.drawable.paper);
                } else if (am[0] == "rock") {
                    mimagePlayer.setImageResource(R.drawable.rock);
                } else if (am[0] == "sirreze") {
                    mimagePlayer.setImageResource(R.drawable.scissors);
                }
            }
        });

        final String[] am1 = new String[1];
        mpater2buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] game1 = {"paper", "rock", "sirreze"};
                Random random1 = new Random();
//                String am1;
                int be1;
                be1 = random1.nextInt(3);
                am1[0] = game1[be1];
                if (am1[0] == "paper") {
                    mimagebot.setImageResource(R.drawable.paper);
                } else if (am1[0] == "rock") {
                    mimagebot.setImageResource(R.drawable.rock);
                } else if (am1[0] == "sirreze") {
                    mimagebot.setImageResource(R.drawable.scissors);
                }
            }
        });

        mresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rules for player 1
                if (am[0]=="paper" && am1[0]=="paper"){
                    mresulttext.setText("you are equal");
                }
                else if (am[0]=="paper" && am1[0]=="rock"){
                    mresulttext.setText("palyer1 is win ");
                }
                else if (am[0]=="paper" && am1[0]=="sirreze"){
                    mresulttext.setText("palyer2 is win ");
                }
                else if (am[0]=="rock" && am1[0]=="paper"){
                    mresulttext.setText("palyer2 is win ");
                }
                else if (am[0]=="rock" && am1[0]=="rock"){
                    mresulttext.setText("you are equal ");
                }
                else if (am[0]=="rock" && am1[0]=="sirreze"){
                    mresulttext.setText("palyer1 is win ");
                }
                else if (am[0]=="sirreze" && am1[0]=="paper"){
                    mresulttext.setText("palyer1 is win ");
                }
                else if (am[0]=="sirreze" && am1[0]=="rock"){
                    mresulttext.setText("palyer2 is win ");
                }
                else if (am[0]=="sirreze" && am1[0]=="sirreze"){
                    mresulttext.setText("you are equal");
                }
                //rules for player 2
                else if (am1[0]=="paper" && am[0]=="paper"){
                    mresulttext.setText("you are equal");
                }
                else if (am1[0]=="paper" && am[0]=="rock"){
                    mresulttext.setText("player2 is win");
                }
                else if (am1[0]=="paper" && am[0]=="sirreze"){
                    mresulttext.setText("player1 is win");
                }
                else if (am1[0]=="rock" && am[0]=="rock"){
                    mresulttext.setText("you are equal");
                }
                else if (am1[0]=="rock" && am[0]=="paper"){
                    mresulttext.setText("player2 is win");
                }
                else if (am1[0]=="rock" && am[0]=="sirreze") {
                    mresulttext.setText("player2 is win");
                }
                else if (am1[0]=="sirreze" && am[0]=="sirreze"){
                    mresulttext.setText("you are equal");
                }
                else if (am1[0]=="sirreze" && am[0]=="rock"){
                    mresulttext.setText("player1 is win");
                }
                else if (am1[0]=="sirreze" && am[0]=="paper"){
                    mresulttext.setText("player2 is win");
                }
            }
        });

        mnextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,splash.class);
                startActivity(intent);
            }
        });

    }
}
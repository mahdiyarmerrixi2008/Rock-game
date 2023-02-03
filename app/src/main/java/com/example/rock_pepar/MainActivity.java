package com.example.rock_pepar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random;
        ImageView mimagePlayer=(ImageView) findViewById(R.id.imagePlayer);
        RelativeLayout mpater1buttom=(RelativeLayout)findViewById(R.id.pater1buttom);
        RelativeLayout mpater2buttom=(RelativeLayout)findViewById(R.id.pater2buttom);
        AppCompatButton mresult=(AppCompatButton) findViewById(R.id.result);
        ImageView mimagebot=(ImageView) findViewById(R.id.imagebot);


        mpater1buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int a = (random.nextInt(3));
                if (a == 0)
                {
                    mimagePlayer.setImageResource(R.drawable.rock);
                }
                else if (a == 1)
                {
                    mimagePlayer.setImageResource(R.drawable.paper);
                }
                else
                {
                    mimagePlayer.setImageResource(R.drawable.scissors);
                }
            }
        });

        mpater2buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int a = (random.nextInt(3));
                if (a == 0)
                {
                    mimagebot.setImageResource(R.drawable.rock);
                }
                else if (a == 1)
                {
                    mimagebot.setImageResource(R.drawable.paper);
                }
                else
                {
                    mimagebot.setImageResource(R.drawable.scissors);
                }
            }
        });
        mresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,splash.class);
                startActivity(intent);
            }
        });

    }
}
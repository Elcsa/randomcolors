package com.example.randomcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private RelativeLayout relativeLayout;
private TextView textViewColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int blue= random.nextInt(255);
                int green= random.nextInt(255);
                int red= random.nextInt(255);
                textViewColor.setText("("+red+","+green+","+blue+")");
                relativeLayout.setBackgroundColor(Color.rgb(red,blue,green));
            }
        });
    }
    private void init(){
        relativeLayout=findViewById(R.id.relativelayout);
        textViewColor=findViewById(R.id.textViewColor);
    }
}
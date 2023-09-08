package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        CardView cardView1 = findViewById(R.id.cardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = findViewById(R.id.cardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = findViewById(R.id.cardView3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = findViewById(R.id.cardView4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView5 = findViewById(R.id.cardView5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView6 = findViewById(R.id.cardView6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, materialActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView7 = findViewById(R.id.cardView7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, scrollViewHorizontalActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView8 = findViewById(R.id.cardView8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, scrollViewvertikalActivity.class);
                startActivity(intent);
            }
        });
    }
}
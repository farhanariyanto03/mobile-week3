package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText to, subject, massage1;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Linear Layout");

        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        massage1 = findViewById(R.id.message1);
        send = findViewById(R.id.send);
    }
}
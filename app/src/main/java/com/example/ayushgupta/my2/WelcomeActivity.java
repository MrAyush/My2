package com.example.ayushgupta.my2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText("Hello, "+getIntent().getStringExtra("nameText") + ", you like: " + getIntent().getStringExtra("likeText"));
    }
}

package com.example.ayushgupta.my2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                EditText et = findViewById(R.id.et1);
                intent.setData(Uri.parse("tel:"+et.getText().toString()));
                intent.setAction(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("http://www.google.com"));
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et2 = findViewById(R.id.et2);
                EditText et3 = findViewById(R.id.et3);
                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                intent.putExtra("nameText", et2.getText().toString());
                intent.putExtra("likeText", et3.getText().toString());
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.skype.raider");
                if (intent != null)
                    startActivity(intent);
                else {
                    Intent intent1 = new Intent();
                    intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.skype.raider"));
                    intent1.setAction(Intent.ACTION_VIEW);
                    startActivity(intent1);
                }

            }
        });
    }
}

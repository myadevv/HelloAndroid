package com.myproject.helloandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

public class HelloAndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android);

        Button startBtn = (Button) findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
                startActivity(myIntent);
            }
        });

        Button start02Btn = (Button) findViewById(R.id.start02Btn);
        start02Btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "경북대 접속 버튼 눌림", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://knu.ac.kr/wbbs/"));
                startActivity(myIntent);
            }
        });

        Button start03Btn = (Button) findViewById(R.id.start03Btn);
        start03Btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "전화 버튼 눌림", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01077881234"));
                startActivity(myIntent);
            }
        });
    }
}
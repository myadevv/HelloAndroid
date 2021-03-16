package com.myproject.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);

        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
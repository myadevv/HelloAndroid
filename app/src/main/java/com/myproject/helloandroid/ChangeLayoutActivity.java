package com.myproject.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changelayoutactivity);

        Button changeBtn = (Button) findViewById(R.id.mybutton);
        changeBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                LinearLayout MyLinear=(LinearLayout)findViewById(R.id.mylinear);
                MyLinear.setOrientation(LinearLayout.HORIZONTAL);

                Button MyBtn = (Button)findViewById(R.id.mybutton);
                MyBtn.setTextSize(40);

                EditText MyEdit = (EditText)findViewById(R.id.myedit);
                MyEdit.setBackgroundColor(0xff00ff00);
            }
        });
    }
}
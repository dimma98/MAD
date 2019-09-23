package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class level4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_4);

        findViewById(R.id.start);
        findViewById(R.id.btn1);
        findViewById(R.id.btn2);
        findViewById(R.id.btn3);
        findViewById(R.id.btn4);
        findViewById(R.id.btn5);
        findViewById(R.id.btn6);
        findViewById(R.id.btn7);
        findViewById(R.id.btn8);
        findViewById(R.id.btn9);
        findViewById(R.id.btn10);
        findViewById(R.id.btn11);
        findViewById(R.id.btn12);

    }

    public void OnclickStartLvl_4(View view) {
        Intent intent12 = new Intent(level4.this, MainActivity_4.class);

        startActivity(intent12);
    }
}

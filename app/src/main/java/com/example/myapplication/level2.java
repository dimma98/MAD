package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class level2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_2);

        findViewById(R.id.start);
        findViewById(R.id.btnn1);
        findViewById(R.id.btnn2);
        findViewById(R.id.btnn3);
        findViewById(R.id.btnn4);
        findViewById(R.id.btnn5);
        findViewById(R.id.btnn6);
        findViewById(R.id.btnn7);
        findViewById(R.id.btnn8);
        findViewById(R.id.btnn9);

    }

    public void onClickStart(View view){
        Intent intent0 = new Intent(level2.this, MainActivity_2.class);

        startActivity(intent0);
    }



}

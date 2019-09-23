package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class levelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_select);

        findViewById(R.id.btn1);
        findViewById(R.id.btn2);
        findViewById(R.id.btn3);
        findViewById(R.id.btn4);


    }

    public void onClick(View view){
        Intent intent = new Intent(levelSelect.this, level1.class);

        startActivity(intent);
    }

    public void onClick1(View view){
        Intent intent = new Intent(levelSelect.this, level2.class);

        startActivity(intent);
    }

    public void onclick2(View view){
        Intent intent3 = new Intent(levelSelect.this, level3.class);

        startActivity(intent3);
    }

    public void onClick3(View view){
        Intent intent = new Intent(levelSelect.this, level4.class);

        startActivity(intent);
    }
}

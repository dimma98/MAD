package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class level1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);
        findViewById(R.id.level1start);
        findViewById(R.id.btnI);
        findViewById(R.id.btnW);
        findViewById(R.id.btnF);
        findViewById(R.id.btnL);
        findViewById(R.id.btnG);
        findViewById(R.id.btnV);
        findViewById(R.id.btnR);
        findViewById(R.id.btnS);
        findViewById(R.id.btnT);

    }
    public void OnclickStartLvl_1(View view) {
        Intent intent = new Intent(level1.this, MainActivity_1.class);

        startActivity(intent);
    }
    public void onClickI(View view){
        Intent intent = new Intent(level1.this, instagram.class);

        startActivity(intent);
    }
    public void onClickW(View view){
        Intent intent = new Intent(level1.this, whatsapp.class);

        startActivity(intent);
    }public void onClickF(View view){
        Intent intent = new Intent(level1.this, facebook.class);

        startActivity(intent);
    }public void onClickL(View view){
        Intent intent = new Intent(level1.this, linkedin.class);

        startActivity(intent);
    }public void onClickG(View view){
        Intent intent = new Intent(level1.this, github.class);

        startActivity(intent);
    }public void onClickV(View view){
        Intent intent = new Intent(level1.this, viber.class);

        startActivity(intent);
    }public void onClickR(View view){
        Intent intent = new Intent(level1.this, reddit.class);

        startActivity(intent);
    }public void onClickS(View view){
        Intent intent = new Intent(level1.this, snapchat.class);

        startActivity(intent);
    }public void onClickT(View view){
        Intent intent = new Intent(level1.this, twitter.class);

        startActivity(intent);
    }





}

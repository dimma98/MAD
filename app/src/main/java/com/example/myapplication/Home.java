package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btn = findViewById(R.id.play);
    }



    public void onClick(View view){
        Intent intent = new Intent(Home.this,levelSelect.class);

        startActivity(intent);
    }
}

package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Go = findViewById(R.id.button);
    }



    public void onclick1 (View v){
        Intent Go = new Intent(this,MainActivity2.class);
        startActivity(Go);
    }

}
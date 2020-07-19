package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button back7 = findViewById(R.id.back7);

        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back7 = new Intent(MainActivity7.this,MainActivity2.class);
                startActivity(back7);
            }
        });
    }
}
package com.example.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.finalproject.R.drawable.turkey;

public class MainActivity2 extends Activity {


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main2);
        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        ImageView img3 = (ImageView)findViewById(R.id.imgv3);
        ImageView img6 = (ImageView)findViewById(R.id.imageView6);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);


        img1.setImageResource(R.drawable.usa);
        img2.setImageResource(R.drawable.spain);
        img3.setImageResource(turkey);
        img6.setImageResource(R.drawable.bosnia);
        img5.setImageResource(R.drawable.italy);




        final Button usa = findViewById(R.id.usa);
        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent usa = new Intent(MainActivity2.this,MainActivity3.class);
              startActivity(usa);
      }
        });
        Button spain = findViewById(R.id.spain);
        spain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spain = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(spain);
            }
        });
        Button turky = findViewById(R.id.turky);
        turky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent turky = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(turky);
            }
        });

        final Button italy = findViewById(R.id.italy);
        italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent italy = new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(italy);
            }
        });
        Button bosna = findViewById(R.id.bosna);
        bosna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bosna = new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(bosna);
            }
        });


        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(back);
            }
        });



    }




}
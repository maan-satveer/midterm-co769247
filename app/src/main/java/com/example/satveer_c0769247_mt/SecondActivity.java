package com.example.satveer_c0769247_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView cars = findViewById(R.id.text1);
      TextView numberdays = findViewById(R.id.text2);
      TextView dailyrent = findViewById(R.id.text3);
        TextView age = findViewById(R.id.text4);
        TextView extra = findViewById(R.id.text5);
      TextView pay = findViewById(R.id.text6);
      TextView totalpay = findViewById(R.id.text7);
        Intent intent = getIntent();
        String value = intent.getExtras().getString("car");
        String value1 = intent.getExtras().getString("numdays");
        String value2 = intent.getExtras().getString("rent");
        String value3 = intent.getExtras().getString("ages");
        String value4 = intent.getExtras().getString("extra");
        String value5 = intent.getExtras().getString("pay");
        String value6 = intent.getExtras().getString("totalpay");
        cars.setText("car name " + value );
        numberdays.setText("number of days "+ value1 );
        dailyrent.setText(" Daily rent" +value2);
        age.setText(" Age of Driver " +value3);
        extra.setText(" Options added " + value4);
        pay.setText( " Amount " + value5 );
        totalpay.setText(  " Total pay " + value6);
    }
}
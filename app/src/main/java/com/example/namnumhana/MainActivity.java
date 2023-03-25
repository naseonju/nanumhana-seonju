package com.example.namnumhana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cancle = findViewById(R.id.button10);
        Button save = findViewById(R.id.button9);

        TextView title = findViewById(R.id.textView5);

        TextView content = findViewById(R.id.textView7);

        TextView classification = findViewById(R.id.textView8);
        View classcan = findViewById(R.id.view11);
        Button homeappliances = findViewById(R.id.button12);
        Button dailysupplies = findViewById(R.id.button13);
        Button clothing =  findViewById(R.id.button14);
        Button sundries = findViewById(R.id.button15);
        Button book = findViewById(R.id.button16);

        TextView deduction = findViewById(R.id.textView9);
        View deductioncan = findViewById(R.id.view14);

        TextView method = findViewById(R.id.textView10);
        View methodcan = findViewById(R.id.view13);
        CheckBox parcelservice = findViewById(R.id.checkBox4);
        CheckBox directdealing = findViewById(R.id.checkBox3);
        CheckBox etc = findViewById(R.id.checkBox5);

        TextView image = findViewById(R.id.textView11);
        View imagecan = findViewById(R.id.view12);
        ImageView imagejpg = findViewById(R.id.imageView);
        CheckBox yes = findViewById(R.id.checkBox);
        CheckBox no = findViewById(R.id.checkBox2);


    }
}
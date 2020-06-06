package com.example.kpgoldtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity2 extends AppCompatActivity {
    //Initialize variable
    TextView tvUsername;
    Button btinput;
    Button btoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Assign variable
        tvUsername = findViewById(R.id.tv_username);
        btinput = findViewById(R.id.bt_input);
        btoutput = findViewById(R.id.bt_output);

        btinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputActivity();
            }
        });


    }
    public void InputActivity(){
        Intent intent = new Intent(MainActivity2.this, InputActivity.class);
        startActivity(intent);
    }

}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView newText;
    Button changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newText = findViewById(R.id.textview111);
        changeButton = findViewById(R.id.button);
    }

    public void pressMeButton(View view){
        newText.setText("Find a great idea for the next app");

    }
}
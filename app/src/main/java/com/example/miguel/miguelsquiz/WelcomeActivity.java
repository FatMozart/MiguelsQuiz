package com.example.miguel.miguelsquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.miguel.miguelsquiz.R.layout.activity_welcome;


public class WelcomeActivity extends AppCompatActivity {

    public Button redButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_welcome);

        redButton = (Button) findViewById(R.id.redButton);
        redButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent instructions = new Intent(WelcomeActivity.this, InstructionsActivity.class);
                startActivity(instructions);
            }
        });
    }

}


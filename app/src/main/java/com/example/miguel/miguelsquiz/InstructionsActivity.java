package com.example.miguel.miguelsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InstructionsActivity extends AppCompatActivity {

    private Button startButton;
    private Button cancelButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        startButton = (Button) findViewById(R.id.b_start);
        startButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent riddles = new Intent(InstructionsActivity.this, QuestionActivity.class);
                startActivity(riddles);

            }
        });

        cancelButton = (Button) findViewById(R.id.b_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent welcome = new Intent(InstructionsActivity.this, WelcomeActivity.class);
                startActivity(welcome);

            }
        });
    }

}

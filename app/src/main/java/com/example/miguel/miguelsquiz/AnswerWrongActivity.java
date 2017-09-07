package com.example.miguel.miguelsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnswerWrongActivity extends AppCompatActivity {
public Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_wrong);

        nextButton = (Button) findViewById(R.id.b_next_wrong);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent init = new Intent(AnswerWrongActivity.this, AnswerCorrectActivity.class);
                startActivity(init);
            }
        });
    }
}










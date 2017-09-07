package com.example.miguel.miguelsquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class QuestionActivity extends AppCompatActivity {

    private Button cancelButton;
    private ListView listView;
    public Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        submitButton = (Button) findViewById(R.id.b_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(QuestionActivity.this, AnswerWrongActivity.class);
                startActivity(answer);
            }
        });

        cancelButton = (Button) findViewById(R.id.b_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent welcome = new Intent(QuestionActivity.this, WelcomeActivity.class);
                startActivity(welcome);
            }
        });

        listView = (ListView) findViewById(R.id.l_answers);
        String[] answers = new String[]{
                "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            list.add(answers[i]);
        }

        MiguelsArrayAdapter adapter = new MiguelsArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }

    private class MiguelsArrayAdapter extends ArrayAdapter {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public MiguelsArrayAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<String> list) {
            super(context, resource);
            for (int i = 0; i < list.size(); ++i) {
                mIdMap.put(list.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = (String) getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}

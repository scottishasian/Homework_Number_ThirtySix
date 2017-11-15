package com.example.kynansong.wordcounter.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kynansong.wordcounter.R;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();   // get extra information, and pull it back from the hash map of intent.

        String wordCount = extras.getString("count");

        TextView answerTextView = findViewById(R.id.word_count);

        answerTextView.setText(wordCount);
    }
}

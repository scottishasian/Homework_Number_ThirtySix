package com.example.kynansong.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kynansong.wordcounter.Models.WordCounter;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText sentence;
    private Button submitButton;
    private WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.word_count);
        this.sentence = (EditText) findViewById(R.id.sentence_input);
        this.submitButton = (Button) findViewById(R.id.submit_button);
        this.wordCounter = new WordCounter();

        Log.d("MainActivity", "OnCreate called");
    }


}

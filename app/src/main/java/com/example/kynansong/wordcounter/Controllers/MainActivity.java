package com.example.kynansong.wordcounter.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kynansong.wordcounter.Models.WordCounter;
import com.example.kynansong.wordcounter.R;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private TextView occurences;
    private EditText sentence;
    private Button submitButton;
    private WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.word_count);
        this.occurences = (TextView) findViewById(R.id.occurences_count);
        this.sentence = (EditText) findViewById(R.id.sentence_input);
        this.submitButton = (Button) findViewById(R.id.submit_button);
        this.wordCounter = new WordCounter();

        Log.d("MainActivity", "OnCreate called");
    }

    public void onButtonClick(View button) {
        Log.d(getClass().toString(),"Button Clicked");
        String sentence = this.sentence.getText().toString();
        Log.d(getClass().toString(), sentence);
        this.counter.setText(this.wordCounter.wordCount(sentence).toString());
        this.occurences.setText(this.wordCounter.wordOccurences(sentence).toString());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    //new method per button.

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if(item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
        return true;
    }


}

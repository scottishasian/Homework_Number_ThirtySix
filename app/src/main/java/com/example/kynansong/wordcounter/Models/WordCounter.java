package com.example.kynansong.wordcounter.Models;

import java.lang.reflect.Array;

/**
 * Created by kynansong on 13/11/2017.
 */

public class WordCounter {

    public int wordCount(String phrase) {
        String[] sentence = phrase.split(" ");
        return sentence.length;
    }
}

package com.example.kynansong.wordcounter.Models;

import java.lang.reflect.Array;

/**
 * Created by kynansong on 13/11/2017.
 */

public class WordCounter {

    public String wordCount(String phrase) {
        String[] sentence = phrase.split(" ");
        int result = sentence.length;
        return new Integer(result).toString();
    }
}

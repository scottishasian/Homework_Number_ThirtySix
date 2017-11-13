package com.example.kynansong.wordcounter.Models;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kynansong on 13/11/2017.
 */

public class WordCounter {

    public String wordCount(String phrase) {
        String[] sentence = phrase.split(" ");
        int result = sentence.length;
        return new Integer(result).toString();
    }

    public Map<String, Integer> wordOccurences(String phrase) {
        String[] words = phrase.split(" ");
        Map<String, Integer> occurences = new HashMap();
        for(String word : words) {
            if(!occurences.containsKey(word))
                occurences.put(word, 1);
            else
                occurences.put(word, occurences.get(word) + 1);
        }
        return occurences;
    }
}

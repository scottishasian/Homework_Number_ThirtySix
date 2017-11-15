package com.example.kynansong.wordcounter.Models;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kynansong on 13/11/2017.
 */

public class WordCounter {              //should make methods static so they don't need to be instantiated.

    public String wordCount(String phrase) {
        String[] sentence = phrase.split(" ");
        int result = sentence.length;
        return new Integer(result).toString();
    }

    public String wordOccurences(String phrase) {         // method adapted from stackoverflow.
        String[] words = phrase.toLowerCase().split(" ");// can put .toLowercase() method here, before .split.
        String output = "Total Words: \n";
        Map<String, Integer> occurences = new HashMap();
        for (String word : words) {
            if (!occurences.containsKey(word)) {        //If contained word not in occurences put 1, else add 1.
                occurences.put(word, 1);
            } else {
                occurences.put(word, occurences.get(word) + 1);
            }
        }
//        return "Here is a list of word occurences: \n\n" + occurences;
        for(String key: occurences.keySet()) {
        output += key + " : " + occurences.get(key) + "\n";         // counts the keys then set out as string.
        }
        return output;
    }
}

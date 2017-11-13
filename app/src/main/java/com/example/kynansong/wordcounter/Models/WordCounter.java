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

    public String wordOccurences(String phrase) {         // method adapted from stackoverflow.
        String[] words = phrase.split(" ");
        Map<String, Integer> occurences = new HashMap();
        for(String word : words) {
            if(!occurences.containsKey(word)) {        //If contained word not in occurences put 1, else add 1.
                occurences.put(word.toLowerCase(), 1);
            }else {
                occurences.put(word.toLowerCase(), occurences.get(word) + 1);
            }
        }
        //        return "Here is a list of word occurences: " + occurences;
        return "Here is a list of word occurences: \n\n" + occurences;
    }
}

package com.example.kynansong.wordcounter;

import com.example.kynansong.wordcounter.Models.WordCounter;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by kynansong on 13/11/2017.
 */

public class WordCounterTest {

    WordCounter sentence;

    @Before
    public void before() {
        this.sentence = new WordCounter();
    }

    @Test
    public void testCanCountWords () {
        String result = this.sentence.wordCount("I am a teapot");
        assertEquals("4", result);
    }
}

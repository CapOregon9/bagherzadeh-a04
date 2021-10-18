/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */


package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void addToUnsortedMap() {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        wordFrequencyCounter.addToUnsortedMap("Badger");
        Map<String, Integer> actualMap = wordFrequencyCounter.getUnsortedFrequencyValues();
        assertEquals(1, actualMap.get("Badger"));
    }

    @Test
    void sortMap() {
        FileIO fileIO = new FileIO();
        fileIO.readStrings();
        fileIO.sortFrequencies();
        Map<String, Integer> expectedMap = new LinkedHashMap<>();
        Map<String, Integer> actualMap = fileIO.getSortedMap();
        expectedMap.put("badger", 7);
        expectedMap.put("mushroom", 2);
        expectedMap.put("snake", 1);
        assertEquals(expectedMap, actualMap);
    }
}
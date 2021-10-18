/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */


package baseline;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter {
    //A map to store the unsorted frequencies
    private Map<String, Integer> unsortedFrequencyValues = new HashMap<>();
    //A map to store the sorted frequencies when finished
    private Map<String, Integer> sortedFrequencyValues = new LinkedHashMap<>();

    public void addToUnsortedMap(String input) {
        //adds word to unsorted frequency counter map
        unsortedFrequencyValues.putIfAbsent(input, 0);
        int value = unsortedFrequencyValues.get(input);
        value++;
        unsortedFrequencyValues.put(input, value);
    }

    public Map<String, Integer> getUnsortedFrequencyValues() {
        //used for junit testing
        return unsortedFrequencyValues;
    }

    public Map<String, Integer> getSortedFrequencyValues() {
        //used for junit testing
        return sortedFrequencyValues;
    }

    public void sortMap() {
        //sorts the map and stores it in a linked hash map to preserve the order it was added.
        unsortedFrequencyValues.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedFrequencyValues.put(x.getKey(), x.getValue()));
    }


    public void printFrequencyMap() {
        //prints a histogram of the sorted map
        for (Map.Entry<String, Integer> entry: sortedFrequencyValues.entrySet()) {
            StringBuilder word = new StringBuilder(entry.getKey()).append(":");
            System.out.printf("%-10s", word);
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}

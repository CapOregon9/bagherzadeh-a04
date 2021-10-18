/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */


package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileIO {
    //used to access input file
    //create object of frequency counter
    private WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
    public void readStrings() {
        //used to read a string one by one and send it to the frequency counter object to be processed
        try (Scanner input = new Scanner(Paths.get("data\\exercise46_input.txt"))) {
            while (input.hasNext()) {
                wordFrequencyCounter.addToUnsortedMap(input.next());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            System.out.println("Could not read file.");
        }
    }

    public void sortFrequencies() {
        //calls the sort function of the frequency counter
        wordFrequencyCounter.sortMap();
    }

    public void printFrequencies() {
        //calls the print function of the frequency counter
        wordFrequencyCounter.printFrequencyMap();
    }

    public Map<String, Integer> getSortedMap() {
        //used for junit testing
       return wordFrequencyCounter.getSortedFrequencyValues();
    }
}

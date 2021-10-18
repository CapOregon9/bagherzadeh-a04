/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordFinder {
    //Create a string builder to store the modified string.
    private StringBuilder formattedString = new StringBuilder();


    public String replaceWord(String fullWord, String oldWord, String newWord) {
        //used to replace a word in a string and return the new string.
        return fullWord.replace(oldWord, newWord);
    }

    public void readStrings() {
        //this gets each string from the file and determines if a word needs to be replaced
        String tempString;
        try (Scanner inputLine = new Scanner(Paths.get("data\\exercise45_input.txt"))) {
            while (inputLine.hasNextLine()) {
                String line = inputLine.nextLine();
                try (Scanner inputString = new Scanner(line)) {
                    while (inputString.hasNext()) {
                        tempString = inputString.next();
                        if (tempString.contains("utilize")) {
                            storeString(replaceWord(tempString, "utilize", "use"));
                        } else {
                            storeString(tempString);
                        }
                    }
                }
                storeString(String.format("%n"));
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            System.out.println("Could not read file.");
        }
    }

    public StringBuilder getStringBuilder() {
        //used for junit testing
        return formattedString;
    }

    public void storeString(String word) {
        //this stores the string in the StringBuilder to be used later
        formattedString.append(" " + word);
    }

    public void writeString(String fileLocation) {
        //this method writes the formatted string to a file
        try (Formatter output = new Formatter(String.format("data\\%s.txt", fileLocation))) {
            output.format("%s", formattedString.toString());
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println("Could not write file.");
        }
    }

    public String getOutputFile() {
        //this method prompts the user for an output file name and then returns the string
        System.out.println("What would you like the output file to be called? (Don't include a file extension)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

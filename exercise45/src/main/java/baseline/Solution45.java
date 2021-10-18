/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution45 {
    public static void main(String[] args) {
        //create instance of WordFinder
        WordFinder wordFinder = new WordFinder();
        //call method to readStrings
        wordFinder.readStrings();
        //call method to write the formatted string
        wordFinder.writeString(wordFinder.getOutputFile());
    }
}

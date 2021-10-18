/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution46 {
    public static void main(String[] args) {
        //create object of fileIO
        FileIO fileIO = new FileIO();
        //call method to read input
        fileIO.readStrings();
        //call method to sort frequencies
        fileIO.sortFrequencies();
        //call method to print results
        fileIO.printFrequencies();
    }
}

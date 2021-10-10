/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Solution41 {
    public static void main(String[] args) {
        //create instance of file sort
        FileSort fileSort = new FileSort();
        //call method to read the input file
        fileSort.readInputFile();
        //call method to sort list of names
        fileSort.sortNames();
        //call method to make the output file
        fileSort.createOutputFile();
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileSortTest {

    @Test
    void sortNamesTest() {
        FileSort fileSort = new FileSort();
        List<String> sortedNames = new ArrayList<>();
        sortedNames.add("Johnson, Jim");
        sortedNames.add("Jones, Aaron");
        sortedNames.add("Jones, Chris");
        sortedNames.add("Ling, Mai");
        sortedNames.add("Swift, Geoffrey");
        sortedNames.add("Xiong, Fong");
        sortedNames.add("Zarnecki, Sabrina");
        fileSort.readInputFile();
        fileSort.sortNames();
        assertArrayEquals(sortedNames.toArray(), fileSort.getNames().toArray());
    }

    @Test
    void createOutputFile() {
        FileSort fileSort = new FileSort();
        fileSort.readInputFile();
        fileSort.sortNames();
        fileSort.createOutputFile();
        boolean actualValue = new File("data\\exercise41_output.txt").exists();
        assertEquals(true, actualValue);
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    WordFinder wordFinder;

    @BeforeEach
    void createObjects() {
        wordFinder = new WordFinder();
    }

    @Test
    void TestReadStringsAndReplaceWordUtilize() {

        wordFinder.readStrings();
        String expectedString = " One should never use the word \"use\" in writing. Use \"use\" instead. \n" +
                " For example, \"She uses an IDE to write her Java programs\" instead of \"She \n" +
                " uses an IDE to write her Java programs\". \n";
        expectedString = expectedString.replaceAll("\n", "").replaceAll("\r", "");
        String actualString = wordFinder.getStringBuilder().toString();
        actualString = actualString.replaceAll("\n", "").replaceAll("\r", "");
        assertEquals(expectedString, actualString);
    }


    @Test
    void replaceWord() {
        String expectedString = "use";
        String actualString = wordFinder.replaceWord("utilize", "utilize", "use");
        assertEquals(expectedString, actualString);
    }

    @Test
    void storeString() {
        StringBuilder expectedStringBuilder = new StringBuilder(" use");
        wordFinder.storeString("use");
        assertEquals(expectedStringBuilder.toString(), wordFinder.getStringBuilder().toString());
    }

    @Test
    void writeString() {
        wordFinder.readStrings();
        wordFinder.writeString("exercise45_output");
        boolean actualValue = new File("data\\exercise45_output.txt").exists();
        assertEquals(true, actualValue);
    }
}
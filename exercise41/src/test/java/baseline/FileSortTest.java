package baseline;

import org.junit.jupiter.api.Test;

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
}
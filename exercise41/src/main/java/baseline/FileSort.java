package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileSort {
    //create instance variable to store input in a list
    private List<String> names = new ArrayList<>();

    public List<String> getNames() {
        //used for junit testing
        return names;
    }

    public void readInputFile() {
        //reads the input text file and stores the values in the list
        try (Scanner input = new Scanner(Paths.get("data\\exercise41_input.txt"))) {
            while (input.hasNext()) {
                names.add(input.nextLine());
            }
        } catch (IOException| NoSuchElementException | IllegalStateException e) {
            System.out.println("Could not read file.");
        }
    }

    public void sortNames() {
        //sorts the list of names
        Collections.sort(names);
    }

    public void createOutputFile() {
        //creates output file of sorted list
        try (Formatter output = new Formatter("data\\exercise41_output.txt")) {
            output.format("Total of %d names%n------------------%n", names.size());
            for (String name: names) {
                output.format("%s%n", name);
            }
        } catch (SecurityException | FileNotFoundException |
                FormatterClosedException e) {
            System.out.println("Could not write file.");
        }
    }
}

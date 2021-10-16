/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileIO {
    //reads and writes to a file
    //create instance of record list
    private RecordList recordList = new RecordList();

    public  List<Record> getRecordList() {
        //passed through for junit testing
        return recordList.getRecordList();
    }

    public void readFile() {
        //reads the file from the input txt
        try (Scanner input = new Scanner(Paths.get("data\\exercise42_input.txt"))) {
            while (input.hasNextLine()) {
                parseData(input.nextLine());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            System.out.println("Could not read file.");
        }
    }

    private void parseData(String line) {
        //parses the data from a line and gives it to the record list
       String[] values = line.split(",");
        try {
            recordList.addRecord(values[0], values[1], Integer.parseInt(values[2]));
        } catch (NumberFormatException e) {
            System.out.println("Could not parse file.");
        }
    }

    public void printFile() {
        //prints the file
        List<Record> records = recordList.getRecordList();
        System.out.printf("%-10s%-10s%s%n--------------------------%n", "Last", "First", "Salary");
        for (Record currentRecord: records) {
            System.out.printf(currentRecord.toString());
        }
    }
}

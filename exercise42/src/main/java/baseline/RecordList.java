/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class RecordList {
    //this class is used to store all records
    //create instance variable of the record list
    private List<Record> recordList = new ArrayList<>();

    public void addRecord(String lastName, String firstName, int salary) {
        //creates a record object and adds it to an array list
        Record record = new Record(lastName, firstName, salary);
        recordList.add(record);
    }

    public List<Record> getRecordList() {
        //sends record list to be printed to file
        return recordList;
    }
}

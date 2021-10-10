package baseline;

import java.util.ArrayList;
import java.util.List;

public class RecordList {
    //this class is used to store all records
    //create instance variable of the record list
    List<Record> recordList = new ArrayList<>();

    public void addRecord(String firstName, String lastName, int salary) {
        //creates a record object and adds it to an array list
    }

    public List<Record> getRecordList() {
        //sends record list to be printed to file
        return recordList;
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecordListTest {

    @Test
    void TestRecordList() {
        FileIO fileIO = new FileIO();
        Record record1 = new Record("Ling", "Mai", 55900);
        Record record2 = new Record("Johnson", "Jim", 56500);
        Record record3 = new Record("Jones", "Aaron", 46000);
        Record record4 = new Record("Jones", "Chris", 34500);
        Record record5 = new Record("Swift", "Geoffrey", 14200);
        Record record6 = new Record("Xiong", "Fong", 65000);
        Record record7 = new Record("Zarnecki", "Sabrina", 51500);
        fileIO.readFile();
        List<Record> list1 = new ArrayList<>();
        list1.add(record1);
        list1.add(record2);
        list1.add(record3);
        list1.add(record4);
        list1.add(record5);
        list1.add(record6);
        list1.add(record7);
        List<Record> list2 = fileIO.getRecordList();
        assertEquals(list1.size(), list2.size());
    }

    @Test
    void TestCreateRecord() {
        Record record = new Record("Ling", "Mai", 55900);
        assertEquals("Ling", record.getLastName());
        assertEquals("Mai", record.getFirstName());
        assertEquals(55900, record.getSalary());
    }


    @Test
    void TestAddRecord() {
        RecordList recordList = new RecordList();
        recordList.addRecord("Ling", "Mai", 55900);
        List<Record> records = recordList.getRecordList();
        assertEquals(1, records.size());
    }
}
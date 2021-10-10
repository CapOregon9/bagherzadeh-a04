/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Bagherzadeh
 */

package baseline;

public class Record {
    //This class is used to store the information of each record
    //Instance variables for the three values
    private String firstName;
    private String lastName;
    private int salary;

    public Record(String lastName, String firstName, int salary) {
        //initializes the values for the record when the instance is made
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        //used for junit testing
        return firstName;
    }

    public String getLastName() {
        //used for junit testing
        return lastName;
    }

    public int getSalary() {
        //used for junit testing
        return salary;
    }

    @Override
    public String toString() {
        //used to generate the record in tabular format
        return String.format("%-10s%-10s%d%n", lastName, firstName, salary);
    }
}

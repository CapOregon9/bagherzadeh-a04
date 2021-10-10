package baseline;

public class Record {
    //This class is used to store the information of each record
    //Instance variables for the three values
    private String firstName;
    private String lastName;
    private int salary;

    public Record(String firstName, String lastName, int salary) {
        //initializes the values for the record when the instance is made
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    @Override
    public String toString() {
        //used to generate the record in tabular format
        return "Record{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

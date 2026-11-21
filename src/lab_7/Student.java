package lab_7;

public class Student {

    private String firstName;
    private String lastName;
    private int recordBookNumber;
    private double averageGrade;

    public Student(String firstName, String lastName,
                   int recordBookNumber, double averageGrade) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", № залікової книжки: " + recordBookNumber
                + ", середній бал: " + averageGrade;
    }
}

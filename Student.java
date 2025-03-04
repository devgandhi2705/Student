public class Student {
    private String prn; // Unique identifier for the student
    private String name; // Student's name
    private String dob; // Student's date of birth (format: dd-mm-yyyy)
    private double marks; // Student's marks

    // Constructor to initialize a Student object
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getter method to retrieve PRN
    public String getPRN() {
        return prn;
    }

    // Getter method to retrieve Name
    public String getName() {
        return name;
    }

    // Getter method to retrieve DOB
    public String getDOB() {
        return dob;
    }

    // Getter method to retrieve Marks
    public double getMarks() {
        return marks;
    }

    // Setter method to update Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method to update DOB
    public void setDOB(String dob) {
        this.dob = dob;
    }

    // Setter method to update Marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}

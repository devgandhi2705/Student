import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>(); // List to store student records
    private Scanner scanner = new Scanner(System.in); // Scanner object for user input

    // Method to add a student
    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = scanner.nextLine(); // Reading PRN
        System.out.print("Enter Name: ");
        String name = scanner.nextLine(); // Reading Name
        System.out.print("Enter DOB (dd-mm-yyyy): ");
        String dob = scanner.nextLine(); // Reading Date of Birth
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble(); // Reading Marks
        scanner.nextLine();  // Consume newline

        students.add(new Student(prn, name, dob, marks)); // Creating and adding student object to the list
        System.out.println("Student added successfully!");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) { // Checking if list is empty
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) { // Iterating over student list
            student.display(); // Displaying student details
        }
    }

    // Method to search a student by PRN
    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.nextLine(); // Reading PRN input
        for (Student student : students) {
            if (student.getPRN().equals(prn)) { // Checking if PRN matches
                student.display(); // Displaying student details
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to search a student by name
    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine(); // Reading name input
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) { // Checking if name matches (case insensitive)
                student.display(); // Displaying student details
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to search a student by position
    public void searchByPosition() {
        System.out.print("Enter position (index starting from 0): ");
        int pos = scanner.nextInt(); // Reading position index
        scanner.nextLine();  // Consume newline
        if (pos >= 0 && pos < students.size()) { // Checking if position is valid
            students.get(pos).display(); // Displaying student at given index
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Method to update a student's details
    public void updateStudent() {
        System.out.print("Enter PRN of student to update: ");
        String prn = scanner.nextLine(); // Reading PRN input
        for (Student student : students) {
            if (student.getPRN().equals(prn)) { // Checking if PRN matches
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine()); // Updating Name
                System.out.print("Enter new DOB: ");
                student.setDOB(scanner.nextLine()); // Updating DOB
                System.out.print("Enter new Marks: ");
                student.setMarks(scanner.nextDouble()); // Updating Marks
                scanner.nextLine();  // Consume newline
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete a student
    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        String prn = scanner.nextLine(); // Reading PRN input
        for (Student student : students) {
            if (student.getPRN().equals(prn)) { // Checking if PRN matches
                students.remove(student); // Removing student from the list
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

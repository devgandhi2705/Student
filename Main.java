//Dev gandhi 
//23070126046
//AIML SY A2

import java.util.Scanner; // Importing Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        StudentOperations operations = new StudentOperations(); // Creating an instance of StudentOperations class
        int choice; // Variable to store user choice

        do {
            // Displaying menu options for the student management system
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update/Edit Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt(); // Reading user choice
            scanner.nextLine();  // Consuming the newline character to avoid input issues

            // Executing actions based on user choice
            switch (choice) {
                case 1:
                    operations.addStudent(); // Calling method to add a student
                    break;
                case 2:
                    operations.displayStudents(); // Calling method to display all students
                    break;
                case 3:
                    operations.searchByPRN(); // Calling method to search student by PRN
                    break;
                case 4:
                    operations.searchByName(); // Calling method to search student by name
                    break;
                case 5:
                    operations.searchByPosition(); // Calling method to search student by position
                    break;
                case 6:
                    operations.updateStudent(); // Calling method to update student details
                    break;
                case 7:
                    operations.deleteStudent(); // Calling method to delete a student
                    break;
                case 8:
                    System.out.println("Exiting the program."); // Exiting the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Handling invalid input
            }
        } while (choice != 8); // Repeat the loop until user chooses to exit

        scanner.close(); // Closing the scanner object to prevent resource leak
    }
}

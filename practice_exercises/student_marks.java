import java.util.Scanner;

public class student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to continue or 0 to exit: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the student's marks:");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                } else if (marks >= 90) {
                    System.out.println("This is good");
                } else if(marks >= 60) {
                    System.out.println("This is also good");
                } else if (marks >= 0) {
                    System.out.println("This is good as well");
                } 

                System.out.println("Enter 1 to continue or 0 to exit: ");
                choice = sc.nextInt();
            } else if (choice == 0) {
                System.out.println("Exiting the program");
            } else if (choice != 0 && choice != 1) {
                System.out.println("Invalid input: Enter 1 to continue or 0 to exit");
                choice = sc.nextInt();
            }
        } while (choice != 0);

        sc.close();
    }
    
}

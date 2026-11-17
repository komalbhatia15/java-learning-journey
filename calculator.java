import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        int operator = sc.nextInt();

        /**
         * Operators:
         * 1 - Addition (a + b)
         * 2 - Subtraction (a - b)
         * 3 - Multiplication (a * b)
         * 4 - Division (a / b)
         * 5 - Modulus (a % b)
         */

        switch (operator) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter a valid operator.");
        }

        sc.close();
    }

}

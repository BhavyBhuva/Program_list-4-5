// Bhavy Bhuva
// 220130318038
/*Implement exception handling to handle the following scenarios: 
  If the user enters non-numeric characters, display an error message and prompt the user to enter the numbers again. 
  If the user tries to divide by zero, display an error message and prompt the user to enter the number again. 
  If any other exception occurs, display an error message and terminate the program. */
import java.util.InputMismatchException;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double num1, num2;
            while (true) {
                try {
                    System.out.print("Enter the first number :: ");
                    num1 = scanner.nextDouble();
                    break; 
                } catch (InputMismatchException e) {
                    System.out.println("Error :: Please enter a valid number.");
                    scanner.next();
                }
            }

            while (true) {
                try {
                    System.out.print("Enter the second number :: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        break;
                    } else {
                        System.out.println("Error :: Cannot divide by zero. Please enter a non-zero number.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error :: Please enter a valid number.");
                    scanner.next(); 
                }
            }

            double result = num1 / num2;
            System.out.println("Result of division :: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred. Program terminated.");
        }

        scanner.close();
    }
}

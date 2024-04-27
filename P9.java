// Bhavy Bhuva
// 220130318038
/*Write a Java program that reads in integers from the user until they enter a non-numeric value. Use exception handling to catch any input that is not an integer and display an error message to the user */

import java.util.Scanner;
import java.util.InputMismatchException;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter integers number (enter a non-numeric value to stop) :: ");
                int num = scanner.nextInt();
                System.out.println("You entered: " + num +"\n");
            } catch (InputMismatchException e) {
                System.out.println("Non-numeric input detected. Stopping.");
                break;
            }
        }

        scanner.close();
    }
}

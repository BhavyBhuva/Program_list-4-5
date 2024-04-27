// Bhavy Bhuva
// 220130318038
/*Create a Java program that prompts the user to enter two numbers, and then divides the first number by the second number. */
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number :: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number :: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result of division :: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
    }
}

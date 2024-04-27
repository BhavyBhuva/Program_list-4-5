// Bhavy Bhuva
// 220130318038
/*Write a Java program that throws an exception when attempting to divide by zero. Use a try-catch block to catch the exception and display an error message to the user. */
import java.util.*;
public class P8 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of divided :: ");
        int dividend = get.nextInt();
        System.out.print("Enter the number of divisor :: ");
        int divisor = get.nextInt();
        get.close();

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero........");
            }
            int result = dividend / divisor;
            System.out.println("Division is :: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error is :: " + e.getMessage());
        }
    }
}

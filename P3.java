// Bhavy Bhuva
// 220130318038
/*Write a program in Java to develop user defined exception for ‘Divide by Zero’ error.  */
import java.util.*;

class DivideByZeroException extends Exception {

  public DivideByZeroException() {
    super("Cannot divide by zero........");
  }
}

public class P3 {

  public static void main(String[] args) {
    try {
      Scanner get = new Scanner(System.in);
      System.out.print("Enter the number of divided :: ");
      int dividend = get.nextInt();
      System.out.print("Enter the number of divisor :: ");
      int divisor = get.nextInt();
      get.close();
      
      if (divisor == 0) {
        throw new DivideByZeroException();
      }
      int result = dividend / divisor;
      System.out.println("Division is :: " + result);
    }
    catch (DivideByZeroException e) {
      System.out.println("Error is :: " + e.getMessage());
    }
  }
}

// Bhavy Bhuva
// 220130318038
/*Write a Java program of ArrayIndexOutOfBound Exception in Java with example. */
public class P5 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int number = numbers[index];
            System.out.println("Number :: " + number);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error is :: " + e.getMessage());
        }
    }
}

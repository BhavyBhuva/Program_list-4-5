// Bhavy Bhuva
// 220130318038
/*Write a Java program that reads in a file name from the user and attempts to open the file. Use exception handling to catch any errors that occur when opening the file, and display an error message to the user. */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name ::");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            System.out.println("File contents ::");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        scanner.close();
    }
}


package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleLineMultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException | InputMismatchException  e) {
            e.printStackTrace(); //Can we give multiple SysOut Statements for each exception?
        }
        finally {
            scanner.close();
        }
    }

}

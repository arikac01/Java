package Exceptions;

import java.util.Scanner;

public class CheckedUnCheckedThrows {
    public static void main(String[] args) throws NegativeInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your hours worked: ");
        double hours = scanner.nextDouble();

        System.out.println("Enter your pay rate per hour: ");
        double payRate = scanner.nextDouble();
        System.out.println(calculatePay(hours, payRate));
    }
    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        double salary = hours * payRate;
        if (hours > 40) {
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }
        if (hours < 0 || payRate < 0){
            throw new NegativeInputException();
        }
        return salary;
    }
}

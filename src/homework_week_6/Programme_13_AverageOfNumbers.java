package homework_week_6;

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {
        //Declare the scanner for getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double a = scanner.nextDouble();
        System.out.println("Please enter the second number");
        double b = scanner.nextDouble();
        System.out.println("Please enter the third number");
        double c = scanner.nextDouble();
        averageOfThreeNumbers(a, b, c);
        //close the scanner object
        scanner.close();
    }

    //calculating the average of three number
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + " , " + b + " and " + c + " is: " + average);
    }
}

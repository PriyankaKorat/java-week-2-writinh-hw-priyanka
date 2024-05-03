package homework_week_6;

import java.util.Scanner;

public class Programme_5_Calculator {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division
     * methods all with parameters and use string concatenation methods.
     * (Note: Two static and Two instance methods.)
     */
    //static method
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is: " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    //instance method
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is: " + result);
    }

    public int division(int a, int b) {
        return a / b;
    }

    //main method
    public static void main(String[] args) {
        //Scanner for getting data for user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        addition(a, b);
        int subresult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is: " + subresult);
        Programme_5_Calculator calculator = new Programme_5_Calculator();
        calculator.multiplication(a, b);
        int divresult = calculator.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is: " + divresult);
        calculator.division(a, b);
        //Closing the scanner object
        scanner.close();
    }
}

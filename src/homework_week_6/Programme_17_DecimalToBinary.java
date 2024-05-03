package homework_week_6;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {

    /**
     * Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to java programme to convert decimal to binary numbers");
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //closing scanner;
        scanner.close();


    }

}

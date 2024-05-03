package homework_week_6;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    /**
     * Write a program to calculate the area of a triangle.
     */

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of triangle is : " + area);
    }

    //main method
    public static void main(String[] args) {
        // declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of triangle ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of triangle");
        int height = scanner.nextInt();
        areaOfTriangle(length, height);
        //closing the scanner object
        scanner.close();
    }

}

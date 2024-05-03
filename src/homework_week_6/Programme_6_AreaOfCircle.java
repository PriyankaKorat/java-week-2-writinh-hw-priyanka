package homework_week_6;

import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    /**
     * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
     */
    //calculating the area of circle
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area Of Circle is : "+area+".");

    }

    //main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //closing scanner
        scanner.close();
    }
}

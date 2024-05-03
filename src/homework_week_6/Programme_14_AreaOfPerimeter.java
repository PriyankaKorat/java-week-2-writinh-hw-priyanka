package homework_week_6;

import java.util.Scanner;

public class Programme_14_AreaOfPerimeter {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.5 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    // Calculate area and perimeter of rectangle
    public static void areaOfPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of rectangle is : " + area);
        System.out.println("The perimeter of rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        //scanner declare to get data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rectangle");
        int width = scanner.nextInt();
        System.out.println("Enter the height pf rectangle");
        int height = scanner.nextInt();
        areaOfPerimeterOfRectangle(height, width);
        //closing the scanner
        scanner.close();

    }
}

package homework_week_6;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    /**
     * Write a program to convert the upper case to lower case.
     */

    //conversion of Uppercase into Lowercase method
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }

    //main method
    public static void main(String[] args) {
        //Declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Uppercase string: ");
        String uppercase = scanner.nextLine();
        //object creation
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //close scanner object
        scanner.close();

    }
}

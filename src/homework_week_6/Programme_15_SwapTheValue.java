package homework_week_6;

import java.util.Scanner;

public class Programme_15_SwapTheValue {
    /**
     * Write a java programme to swap two variables.
     */
    public static void main(String[] args) {
        //Declare the scanner for getting data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of first variable: ");
        int first = scanner.nextInt();
        System.out.println("Enter the value of second variable: ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        //closing the scanner object
        scanner.close();

    }

    //Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is :" + b);
    }

}

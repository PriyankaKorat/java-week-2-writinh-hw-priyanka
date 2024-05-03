package homework_week_6;

import java.util.Scanner;

public class Programme_7_TempConversion {
    /**
     * Write a program to insert any temperature value in degree Fahrenheit
     * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    //Temperature conversion method
    public void convertToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5/9);
        System.out.println("The temperature "+temp+" fahrenheit is equal to "+c+" degree celsius.");
    }
    //main method
    public static void main(String[] args){
        //Declare scanner for getting data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertToDegreeCelsius(temp);
        //closing object
        scanner.close();
    }
}

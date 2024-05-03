package homework_week_6;

public class Programme_2 {
    /**
     * Write a Java programme using the following steps.
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     */
    //Declare two static variable
    static int a = 100;
    static int b = 200;

    //Declare one static method
    // Call static variable into this static method using print statement.
    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //Declare the main method.
    //Call the static method inside the main method.
    public static void main(String[] args) {
        staticMethod();
    }

}

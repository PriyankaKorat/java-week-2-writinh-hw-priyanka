package homework_week_6;

public class Programme_1 {
    /**
     * Write a Java programme using the following steps.
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    // Declare two instance variables.
    int a = 10;
    int b = 20;

    // Declare one instance method.
    // Call instance variable into the instance method inside print statement.
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    // Declare the main method.
    // Call the instance method into the main method.
    public static void main(String[] args){
        Programme_1 programme1 = new Programme_1();
        programme1.instanceMethod();
    }
}

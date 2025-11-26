import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        System.out.println("Calculator Application");
        System.out.println("=======================");
        System.out.println("The Calculator App performs Addition, Subtraction, " +
                "Multiplication and Division operations.");
        calculatorApp();
    }

    /*
    This method performs Addition, Subtraction, Multiplication and
    Division operations by getting the inputs from the user.
     */
    public static void calculatorApp() {
        Scanner scan = new Scanner(System.in);
        String desiredOperation;
        int result;
        do {

            System.out.println("Enter number1: ");
            int num1 = scan.nextInt();

            System.out.println("Enter number2: ");
            int num2 = scan.nextInt();

            System.out.println("Choose any one of the operations to perform:");
            System.out.println("Enter A for Addition, S for Subtraction, M for Multiplication" +
                    " D for Division and E for Exit.");
            desiredOperation = scan.next().toUpperCase();

            switch (desiredOperation) {
                case "A":
                    result = addition(num1, num2);
                    System.out.println("Addition: " + num1 + "+" + num2 + " = " + result);
                    break;
                case "S":
                    result = subtraction(num1, num2);
                    System.out.println("Subtraction: " + num1 + "-" + num2 + " = " + result);
                    break;
                case "M":
                    result = multiplication(num1, num2);
                    System.out.println("Multiplication: " + num1 + "*" + num2 + " = " + result);
                    break;
                case "D":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        result = division(num1, num2);
                        System.out.println("Division: " + num1 + "/" + num2 + " = " + result);
                    }
                    break;
                case "E":
                    System.out.println("Thanks for using the Calculator App.");
                    break;
                default:
                    System.out.println("Please enter the correct operation.");
            }

        } while (!desiredOperation.equalsIgnoreCase("E"));
    }

    /*
    This method returns the sum of two numbers.
     */
    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    /*
    This method returns the subtraction of two numbers.
     */
    public static int subtraction(int num1, int num2) {
        return (num1 - num2);
    }

    /*
    This method returns the multiplication of two numbers.
     */
    public static int multiplication(int num1, int num2) {
        return (num1 * num2);
    }

    /*
    This method returns the division of two numbers.
     */
    public static int division(int num1, int num2) {
        return (num1 / num2);
    }
}

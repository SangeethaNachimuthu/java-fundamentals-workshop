import java.util.ArrayList;
import java.util.Scanner;

/*
This Basic Calculator, performs the basic arithmetic operations for many operands.
 */
public class BasicCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Character> operators = new ArrayList<Character>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("==================");

        try {
            try {
                while (true) {
                    System.out.println("Enter number: ");
                    numbers.add(scan.nextInt());
                    System.out.println("Calculator performs '+', '-', '*' and '/' operations " +
                            "and '=' to get the result");
                    System.out.println("Enter operation: ");
                    char operator = scan.next().charAt(0);
                    if (operator == '=') {
                        break;
                    }
                    operators.add(operator);
                }
            } finally {
                scan.close();
            }

            Integer answer = numbers.removeFirst();
            String resultMsg = " " + answer;
            for (int i = 0; i < operators.size(); ++i) {
                Integer num = numbers.get(i);
                Character oper = operators.get(i);
                switch (oper) {
                    case '+':
                        answer = answer + num;
                        break;
                    case '-':
                        answer = answer - num;
                        break;
                    case '*':
                        answer = answer * num;
                        break;
                    case '/':
                        if (num == 0) {
                            throw new ArithmeticException("Can't divide by zero!");
                        } else {
                            answer = answer / num;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
                resultMsg += " " + oper + " " + num;
            }
            System.out.println("\n" + resultMsg + " = " + answer);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

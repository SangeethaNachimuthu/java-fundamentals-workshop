import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculatorAppTest {

    CalculatorApp calculatorApp = new CalculatorApp();

    @Test
    void testGetValidInput() {
        Scanner scan = new Scanner("56\n");
        int result = calculatorApp.getInput(scan);
        Assertions.assertEquals(56, result);
    }

    @Test
    void testAddition() {
        int result = calculatorApp.addition(2,5);
        Assertions.assertEquals(7, result);
    }

    @Test
    void testSubtraction() {
        int result = calculatorApp.subtraction(80, 35);
        Assertions.assertEquals(45, result);
    }

    @Test
    void testMultiplication() {
        int result = calculatorApp.multiplication(45, 6);
        Assertions.assertEquals(270, result);
    }

    @Test
    void testDivision() {
        int result = calculatorApp.division(66, 11);
        Assertions.assertEquals(6, result);
    }
}
package org.lbg.c4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Test for initial value of running total after construction
    @Test
    public void onConstruction_runningTotal_isInitializedCorrectly() {
        // arrange
        double initialTotal = 10.0;
        Calculator calculator = new Calculator(initialTotal);

        // act
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(initialTotal, actualResult, "The running total should be initialized correctly.");
    }

    // Test for addition
    @Test
    public void add_updates_runningTotal_correctly() {
        // arrange
        Calculator calculator = new Calculator(10.0);
        double valueToAdd = 5.0;
        double expectedResult = 10.0 + valueToAdd;

        // act
        calculator.add(valueToAdd);
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult, "The running total should update correctly after addition.");
    }

    // Test for subtraction
    @Test
    public void subtract_updates_runningTotal_correctly() {
        // arrange
        Calculator calculator = new Calculator(10.0);
        double valueToSubtract = 3.0;
        double expectedResult = 10.0 - valueToSubtract;

        // act
        calculator.subtract(valueToSubtract);
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult, "The running total should update correctly after subtraction.");
    }

    // Test for multiplication
    @Test
    public void multiply_updates_runningTotal_correctly() {
        // arrange
        Calculator calculator = new Calculator(10.0);
        double valueToMultiply = 4.0;
        double expectedResult = 10.0 * valueToMultiply;

        // act
        calculator.multiply(valueToMultiply);
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult, "The running total should update correctly after multiplication.");
    }

    // Test for division
    @Test
    public void divide_updates_runningTotal_correctly() {
        // arrange
        Calculator calculator = new Calculator(20.0);
        double valueToDivide = 4.0;
        double expectedResult = 20.0 / valueToDivide;

        // act
        calculator.divide(valueToDivide);
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult, "The running total should update correctly after division.");
    }

    // Test for division by zero
    @Test
    public void divideByZero_doesNotChange_runningTotal() {
        // arrange
        Calculator calculator = new Calculator(20.0);
        double expectedResult = 20.0; // Running total should remain unchanged

        // act
        calculator.divide(0); // Attempt division by zero
        double actualResult = calculator.getRunningTotal();

        // assert
        assertEquals(expectedResult, actualResult, "The running total should remain unchanged after division by zero.");
    }
}


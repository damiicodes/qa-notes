package org.lbg.c4;

public class Calculator {
    private double runningTotal;

    // Constructor to initialize running total
    public Calculator(double initialTotal) {
        runningTotal = initialTotal;
    }

    // Method to get the current running total
    public double getRunningTotal() {
        return runningTotal;
    }

    // Add a value to running total
    public void add(double value) {
        runningTotal += value;
        System.out.println("Added " + value + ", Running Total: " + runningTotal);
    }

    // Subtract a value from running total
    public void subtract(double value) {
        runningTotal -= value;
        System.out.println("Subtracted " + value + ", Running Total: " + runningTotal);
    }

    // Multiply the running total by a value
    public void multiply(double value) {
        runningTotal *= value;
        System.out.println("Multiplied by " + value + ", Running Total: " + runningTotal);
    }

    // Divide the running total by a value, with check for division by zero
    public void divide(double value) {
        if (value != 0) {
            runningTotal /= value;
            System.out.println("Divided by " + value + ", Running Total: " + runningTotal);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}


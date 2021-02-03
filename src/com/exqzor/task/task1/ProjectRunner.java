package com.exqzor.task.task1;

public class ProjectRunner {
    public static void main(String[] args) {
        int value = 721;
        int lastNumber = Calculator.calculateLastNumber(value);
        int lastNumberOfSquare = Calculator.calculateLastNumberOfSquare(lastNumber);
        System.out.println("Last number is " + lastNumberOfSquare);
    }
}

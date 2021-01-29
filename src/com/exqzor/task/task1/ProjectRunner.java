package com.exqzor.task.task1;

public class ProjectRunner {
    public static void main(String[] args) {
        int value = 721;
        int lastNumber = Calculator.getLastNumber(value);
        int lastNumberOfSquare = Calculator.getLastNumberOfSquare(lastNumber);
        System.out.println("Last number is " + lastNumberOfSquare);
    }
}

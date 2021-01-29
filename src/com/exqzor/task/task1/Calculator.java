package com.exqzor.task.task1;

public class Calculator {
    public static int getLastNumber(int value) {
        return value % 10;
    }

    public static int getLastNumberOfSquare(int value) {
        return (int) Math.pow(value, 2) % 10;
    }
}

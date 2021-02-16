package by.exqzore.task.task1;

public class Calculator {
    public static int calculateLastNumber(int value) {
        return value % 10;
    }

    public static int calculateLastNumberOfSquare(int value) {
        return (int) Math.pow(value, 2) % 10;
    }
}

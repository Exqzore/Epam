package by.exqzore.task.task5;

public class Analyzer {
    public static boolean isPerfect(int value) {
        int sum = 0;
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return sum == value;
    }
}

package by.exqzore.task.task10;

public class ProjectRunner {
    public static void main(String[] args) {
        int a = 4;
        int b = 111;
        int h = 3;
        System.out.format("%5s%25s%n", "x", "f(x)");
        for (int i = a; i <= b; i += h) {
            System.out.format("%5d%25.16f%n", i, Math.tan(i));
        }
    }
}
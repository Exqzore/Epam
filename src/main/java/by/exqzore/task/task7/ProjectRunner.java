package by.exqzore.task.task7;

public class ProjectRunner {
    public static void main(String[] args) {
        int x1 = 42;
        int y1 = 26;
        int x2 = 45;
        int y2 = 23;
        int firstPoint = Calculator.calculateSumOfSquares(x1, y1);
        int secondPoint = Calculator.calculateSumOfSquares(x2, y2);
        if (firstPoint > secondPoint) {
            System.out.println("The second point is closer.");
        } else if (firstPoint < secondPoint) {
            System.out.println("The first point is closer.");
        } else {
            System.out.println("The distances are the same.");
        }
    }
}

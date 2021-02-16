package by.exqzore.task.task6;

public class ProjectRunner {
    public static void main(String[] args) {
        int seconds = 7684;
        System.out.println(
                "Hours: " + Calculator.calculateHours(seconds) +
                "\nMinutes: " + Calculator.calculateMinutes(seconds) +
                "\nSeconds: " + Calculator.calculateSeconds(seconds));
    }
}

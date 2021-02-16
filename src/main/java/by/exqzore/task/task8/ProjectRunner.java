package by.exqzore.task.task8;

public class ProjectRunner {
    public static void main(String[] args) {
        double x = 5;
        double result;
        if(x >= 3) {
            result = Calculator.calculateFirstFunction(x);
        } else {
            result = Calculator.calculateSecondFunction(x);
        }
        System.out.println("F(x) = " + result);
    }
}

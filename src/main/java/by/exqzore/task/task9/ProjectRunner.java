package by.exqzore.task.task9;

public class ProjectRunner {
    public static void main(String[] args) {
        double radius = 5.0;
        double square = Calculator.findSquare(radius);
        double circumference = Calculator.findCircumference(radius);
        System.out.println("Area of a circle is " + square);
        System.out.println("Circumference is " + circumference);
    }
}
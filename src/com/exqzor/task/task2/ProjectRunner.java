package com.exqzor.task.task2;

public class ProjectRunner {
    public static void main(String[] args) {
        int year = 1917;
        int month = 2;
        CustomDate customDate = new CustomDate(year, month);
        int numberOfDays = customDate.findNumberOfDays();
        System.out.println(customDate.isLeap() ? "Year is leap." : "Year is not leap.");
        System.out.println("Number of days is " + numberOfDays);
    }
}

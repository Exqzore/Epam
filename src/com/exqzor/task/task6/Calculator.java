package com.exqzor.task.task6;

public class Calculator {
    public static int calculateHours(int seconds) {
        return seconds / 3600;
    }

    public static int calculateMinutes(int seconds) {
        return (seconds - calculateHours(seconds) * 3600) / 60;
    }

    public static int calculateSeconds(int seconds) {
        return seconds - calculateHours(seconds) * 3600 - calculateMinutes(seconds) * 60;
    }
}

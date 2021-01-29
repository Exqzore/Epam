package com.exqzor.task.task4;

public class Analyzer {
    public static boolean analyzeArray(int[] array) {
        int counter = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                counter++;
            }
        }
        return counter >= 2;
    }
}

package by.exqzore.task.task4;

import java.util.Scanner;

public class Reader {
    public int[] readArray() {
        int[] array = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

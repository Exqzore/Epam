package by.exqzore.task.task4;

public class ProjectRunner {
    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println("Input array: ");
        int[] array = reader.readArray();
        System.out.println(Analyzer.analyzeArray(array));
    }
}

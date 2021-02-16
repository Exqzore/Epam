package by.exqzore;

import java.util.Arrays;
import java.util.Collection;

import by.exqzore.task.task5.Analyzer;
import by.exqzore.task.task7.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Task07Test {
    private final int x;
    private final int y;
    private final int expected;

    @Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                { 4, 3, 25 },
                { 5, 5, 50 },
                { 10, 1, 101 },
                { 0, 0, 0 },
                { 2, 0, 4 }
        });
    }

    public Task07Test(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void sumOfSquaresTest01() {
        int actual;
        actual = Calculator.calculateSumOfSquares(x, y);
        Assert.assertEquals(expected, actual);
    }
}

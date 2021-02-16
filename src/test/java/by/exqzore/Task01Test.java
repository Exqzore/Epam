package by.exqzore;

import java.util.Arrays;
import java.util.Collection;

import by.exqzore.task.task1.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Task01Test {
    private final int value;
    private final int expectedLastNumber;
    private final int expectedLastNumberOfSquare;

    @Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                {25, 5, 5},
                {1, 1, 1},
                {81, 1, 1},
                {9, 9, 1},
                {64, 4, 6}
        });
    }

    public Task01Test(int value, int expectedLastNumber, int expectedLastNumberOfSquare) {
        this.value = value;
        this.expectedLastNumber = expectedLastNumber;
        this.expectedLastNumberOfSquare = expectedLastNumberOfSquare;
    }

    @Test
    public void calculateLastNumberTest01() {
        int actual;
        actual = Calculator.calculateLastNumber(value);
        Assert.assertEquals(expectedLastNumber, actual);
    }

    @Test
    public void calculateLastNumberOfSquareTest02() {
        int actual;
        actual = Calculator.calculateLastNumberOfSquare(value);
        Assert.assertEquals(expectedLastNumberOfSquare, actual);
    }
}

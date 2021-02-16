package by.exqzore;

import by.exqzore.task.task6.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class Task06Test {

    @Test
    public void calculateHoursTest01() {
        int expected = 1;
        int seconds = 3679;
        int actual = Calculator.calculateHours(seconds);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateMinutesTest02() {
        int expected = 2;
        int seconds = 3729;
        int actual = Calculator.calculateMinutes(seconds);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateSecondsTest03() {
        int expected = 9;
        int seconds = 3609;
        int actual = Calculator.calculateSeconds(seconds);
        Assert.assertEquals(expected, actual);
    }
}

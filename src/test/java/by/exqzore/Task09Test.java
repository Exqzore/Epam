package by.exqzore;

import by.exqzore.task.task9.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class Task09Test {

    @Test
    public void circumferenceTest01() {
        double expected = 31.42;
        double radius = 5;
        double actual = Calculator.findCircumference(radius);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareTest02() {
        double expected = 78.54;
        double radius = 5;
        double actual = Calculator.findSquare(radius);
        Assert.assertEquals(expected, actual, 0.01);
    }
}

package by.exqzore;

import by.exqzore.task.task8.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class Task08Test {

    @Test
    public void firstFunctionTest01() {
        double expected = -1.0;
        double x = 5;
        double actual = Calculator.calculateFirstFunction(x);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void secondFunctionTest02() {
        double expected = 0.0084;
        double x = 5;
        double actual = Calculator.calculateSecondFunction(x);
        Assert.assertEquals(expected, actual, 0.01);
    }
}

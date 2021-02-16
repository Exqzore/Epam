package by.exqzore;

import java.util.Arrays;
import java.util.Collection;

import by.exqzore.task.task5.Analyzer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Task05Test {
    private final int value;
    private final boolean expected;

    @Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                { 28, true },
                { 34, false },
                { 496 , true },
                { 22, false }
        });
    }

    public Task05Test(int value, boolean expected) {
        this.value = value;
        this.expected = expected;
    }

    @Test
    public void test01() {
        Assert.assertEquals(expected, Analyzer.isPerfect(value));
    }
}

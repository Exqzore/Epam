package by.exqzore;

import java.util.Arrays;
import java.util.Collection;

import by.exqzore.task.task4.Analyzer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Task04Test {
    private final int[] array;
    private final boolean expected;

    @Parameters
    public static Collection<Object[]> tableValues() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 5, 2, 17}, true},
                {new int[]{1, 2, 4}, true},
                {new int[]{45, 5, 7, 17, 55}, false},
                {new int[]{8, 5, 89, 17}, false},
                {new int[]{2, 5, 6, 8}, true}
        });
    }

    public Task04Test(int[] array, boolean expected) {
        this.array = array;
        this.expected = expected;
    }

    @Test
    public void test01() {
        Assert.assertEquals(expected, Analyzer.analyzeArray(array));
    }
}

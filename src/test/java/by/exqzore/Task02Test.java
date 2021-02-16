package by.exqzore;

import by.exqzore.task.task2.CustomDate;
import org.junit.Assert;
import org.junit.Test;

public class Task02Test {

    @Test
    public void test01() {
        int expected = 28;
        int year = 1917;
        int month = 2;
        CustomDate customDate = new CustomDate(year, month);
        int actualNumberOfDays = customDate.findNumberOfDays();
        Assert.assertEquals(expected, actualNumberOfDays);
    }

    @Test
    public void test02() {
        int year = 1917;
        int month = 2;
        CustomDate customDate = new CustomDate(year, month);
        Assert.assertFalse(customDate.isLeap());
    }
}

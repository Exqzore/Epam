package by.exqzore.task.task2;

public class CustomDate {
    private int year;
    private int month;

    public CustomDate(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int findNumberOfDays() {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeap() ? 29 : 28;
            default -> 0;
        };
    }

    public boolean isLeap() {
        boolean isLeap;
        if (year % 4 != 0) {
            isLeap = false;
        } else if (year % 100 != 0) {
            isLeap = true;
        } else {
            isLeap = year % 400 == 0;
        }
        return isLeap;
    }
}

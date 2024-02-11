package companyQuestions;

import java.util.*;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first date
        System.out.print("Enter the first date (YYYY MM DD): ");
        int[] date1 = readDate(scanner);

        // Read the second date
        System.out.print("Enter the second date (YYYY MM DD): ");
        int[] date2 = readDate(scanner);

        // Validate the input dates
        if (!isValidDate(date1) || !isValidDate(date2)) {
            System.out.println("Invalid date input. Please enter valid dates.");
            return;
        }

        // Calculate the number of days between the two dates
        int daysBetween = calculateDaysBetween(date1, date2);

        // Print the result
        System.out.println("Number of days between the two dates: " + daysBetween);

        scanner.close();
    }

    private static int[] readDate(Scanner scanner) {
        int[] date = new int[3];
        date[0] = scanner.nextInt();  // Year
        date[1] = scanner.nextInt();  // Month
        date[2] = scanner.nextInt();  // Day
        return date;
    }

    private static boolean isValidDate(int[] date) {
        int year = date[0];
        int month = date[1];
        int day = date[2];

        if (year < 1 || month < 1 || month > 12 || day < 1 || day > daysInMonth(year, month)) {
            return false;
        }

        return true;
    }

    private static int calculateDaysBetween(int[] date1, int[] date2) {
        int days1 = countDaysFromEpoch(date1[0], date1[1], date1[2]);
        int days2 = countDaysFromEpoch(date2[0], date2[1], date2[2]);
        return Math.abs(days1 - days2);
    }

    private static int countDaysFromEpoch(int year, int month, int day) {
        int days = 0;
        for (int y = 1; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {
            days += daysInMonth(year, m);
        }

        days += day;

        return days;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int daysInMonth(int year, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month];
    }
}

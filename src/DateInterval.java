public class DateInterval {

    public static int calculateDaysBetween(int year1, int month1, int day1, int year2, int month2, int day2) {
        int days = 0;

        // Iterate over the years
        for (int year = year1; year < year2; year++) {
            // Calculate the number of days in the current year
            int daysInYear = isLeapYear(year) ? 366 : 365;
            days += daysInYear;
        }

        // Calculate the number of days remaining in the first year
        int daysInFirstYear = calculateDaysInYear(year1, month1, day1);
        days -= daysInFirstYear;

        // Calculate the number of days in the second year
        int daysInSecondYear = calculateDaysInYear(year2, month2, day2);
        days += daysInSecondYear;

        return days;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int calculateDaysInYear(int year, int month, int day) {
        int days = 0;

        // Calculate the days in each month leading up to the target month
        for (int m = 1; m < month; m++) {
            days += calculateDaysInMonth(year, m);
        }

        // Add the remaining days in the target month
        days += day;

        return days;
    }

    public static int calculateDaysInMonth(int year, int month) {
        int daysInMonth;

        switch (month) {
            case 2:
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        return daysInMonth;
    }
    public static void main(String args[]){
        int year1 = 2022;
        int month1 = 4;
        int day1 = 15;

        int year2 = 2024;
        int month2 = 5;
        int day2 = 10;
        int daysBetween = calculateDaysBetween(year1, month1, day1, year2, month2, day2);

        System.out.println("Number of days between the two dates: " + daysBetween);
    }

}



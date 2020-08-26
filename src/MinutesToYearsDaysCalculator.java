public class MinutesToYearsDaysCalculator {

    private static final long MINUTES_IN_A_DAY = 60 * 24;
    private static final long MINUTES_IN_A_YEAR = MINUTES_IN_A_DAY * 365;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / MINUTES_IN_A_YEAR;
            long remainingYears = minutes % MINUTES_IN_A_YEAR;
            long days = remainingYears / MINUTES_IN_A_DAY;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}

public class Solution {
    public static int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int[] daysInMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day + sum(daysInMonth, month - 1);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static int sum(int[] arr, int end) {
        int total = 0;
        for (int i = 0; i < end; i++) {
            total += arr[i];
        }
        return total;
    }
}

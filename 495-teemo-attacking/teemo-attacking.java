import java.util.Scanner;

public class Solution {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            if (i > 0) {
                int poisonEndTime = timeSeries[i - 1] + duration;
                if (timeSeries[i] < poisonEndTime) {
                    totalPoisonedTime += timeSeries[i] - timeSeries[i - 1];
                } else {
                    totalPoisonedTime += duration;
                }
            } else {
                totalPoisonedTime += duration;
            }
        }

        return totalPoisonedTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of attacks: ");
        int n = scanner.nextInt();
        int[] timeSeries = new int[n];

        System.out.println("Enter the attack times:");
        for (int i = 0; i < n; i++) {
            timeSeries[i] = scanner.nextInt();
        }

        System.out.print("Enter the duration of poison: ");
        int duration = scanner.nextInt();

        int result = findPoisonedDuration(timeSeries, duration);
        System.out.println("Total poisoned duration: " + result);
        scanner.close();
    }
}

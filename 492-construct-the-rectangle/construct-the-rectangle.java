import java.util.Scanner;

public class Solution {
    public static int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width != 0) {
            width--;
        }
        int length = area / width;
        return new int[]{length, width};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the area of the rectangle: ");
        int area = scanner.nextInt();
        int[] result = constructRectangle(area);
        System.out.println("Length and Width: [" + result[0] + ", " + result[1] + "]");
        scanner.close();
    }
}

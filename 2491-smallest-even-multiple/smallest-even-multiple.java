class Solution {
    public int smallestEvenMultiple(int n) {
        int maxPossible = 2 * n;
        int[] arr = new int[maxPossible + 1];
        int idx = 0;
        for (int i = 1; i <= maxPossible; i++) {
            if (i % 2 == 0 && i % n == 0) {
                arr[idx++] = i;
            }
        }
        int min = arr[0];
        for (int j = 1; j < idx; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        return min;
    }
}
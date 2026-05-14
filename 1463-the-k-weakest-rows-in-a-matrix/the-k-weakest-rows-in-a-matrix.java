import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] rowScores = new int[m];
        
        for (int i = 0; i < m; i++) {
            int soldiers = countSoldiers(mat[i]);
            rowScores[i] = soldiers * 1000 + i;
        }
        
        Arrays.sort(rowScores);
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowScores[i] % 1000;
        }
        
        return result;
    }
    
    private int countSoldiers(int[] row) {
        int low = 0;
        int high = row.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

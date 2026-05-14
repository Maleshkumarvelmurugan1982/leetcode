import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rowMin = new int[m];
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }
        
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMax[j] = max;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        
        return result;
    }
}

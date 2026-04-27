class Solution {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int[] col = new int[3];
        int[] diag = new int[2]; // 0: main, 1: anti

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            int val = (i % 2 == 0) ? 1 : -1; // A = +1, B = -1

            row[r] += val;
            col[c] += val;

            if (r == c) diag[0] += val;         // main diagonal
            if (r + c == 2) diag[1] += val;   // anti diagonal

            if (Math.abs(row[r]) == 3 || Math.abs(col[c]) == 3
                    || Math.abs(diag[0]) == 3 || Math.abs(diag[1]) == 3) {
                return val == 1 ? "A" : "B";
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
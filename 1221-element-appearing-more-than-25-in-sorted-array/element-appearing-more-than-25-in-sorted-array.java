class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4; 

    
        int cand1 = 0, cand2 = 0, cand3 = 0;
        int c1 = 0, c2 = 0, c3 = 0;

        for (int x : arr) {
            if (c1 > 0 && cand1 == x) {
                c1++;
            } else if (c2 > 0 && cand2 == x) {
                c2++;
            } else if (c3 > 0 && cand3 == x) {
                c3++;
            } else if (c1 == 0) {
                cand1 = x; c1 = 1;
            } else if (c2 == 0) {
                cand2 = x; c2 = 1;
            } else if (c3 == 0) {
                cand3 = x; c3 = 1;
            } else {
                c1--; c2--; c3--;
            }
        }

        // Verify counts
        c1 = c2 = c3 = 0;
        for (int x : arr) {
            if (x == cand1) c1++;
            else if (x == cand2) c2++;
            else if (x == cand3) c3++;
        }

        if (c1 > threshold) return cand1;
        if (c2 > threshold) return cand2;
        return cand3; 
    }
}
class Solution {
    public int countLargestGroup(int n) {
        int[] a = new int[37];
        int b = 0;        
        for (int i = 1; i <= n; i++) {
            int c = i;
            int d = 0;
            while (c > 0) {
                d += c % 10;
                c /= 10;
            }   
            a[d]++;
            if (a[d] > b) {
                b = a[d];
            }
        }
        int e = 0;
        for (int f : a) {
            if (f == b) {
                e++;
            }
        }        
        return e;
    }
}

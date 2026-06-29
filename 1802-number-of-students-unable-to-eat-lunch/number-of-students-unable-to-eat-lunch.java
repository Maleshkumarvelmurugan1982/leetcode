class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int a = 0;
        int b = 0;		
        for (int d : students) {
            if (d == 0) a++;
            else b++;
        }
        for (int c : sandwiches) {
            if (c == 0) {
                if (a == 0) {
                    return b;
                }
                a--;
            } else {
                if (b == 0) {
                    return a;
                }
                b--;
            }
        }
        return 0;
    }
}
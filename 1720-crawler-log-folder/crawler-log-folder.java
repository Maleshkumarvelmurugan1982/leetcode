class Solution {
    public int minOperations(String[] a) {
        int b = 0;
        for (String c : a) {
            if (c.equals("../")) {
                if (b > 0) {
                    b--;
                }
            } else if (!c.equals("./")) {
                b++;
            }
        }
        return b;
    }
}

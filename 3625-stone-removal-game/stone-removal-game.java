class Solution {
    public boolean canAliceWin(int n) {
        if (n >= 55) return false;
        int k = (int) ((21 - Math.sqrt(441 - 8 * n)) / 2);
        return k % 2 == 1;
    }
}

class Solution {
    public int maxDistance(String moves) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int f = 0; f < moves.length(); f++) {
            char g = moves.charAt(f);
            if (g == 'U') {
                a++;
            } else if (g == 'D') {
                b++;
            } else if (g == 'L') {
                c++;
            } else if (g == 'R') {
                d++;
            } else if (g == '_') {
                e++;
            }
        }
        int h = Math.abs(a - b) + Math.abs(d - c) + e;
        return h;
    }
}
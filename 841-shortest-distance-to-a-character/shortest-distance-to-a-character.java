class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int left = i, right = i;
            while (left >= 0 || right < n) {
                if (left >= 0 && s.charAt(left) == c) {
                    answer[i] = i - left;
                    break;
                }
                if (right < n && s.charAt(right) == c) {
                    answer[i] = right - i;
                    break;
                }
                left--;
                right++;
            }
        }
        
        return answer;
    }
}

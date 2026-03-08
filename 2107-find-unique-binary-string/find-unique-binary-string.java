import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        
        Set<String> set = new HashSet<>();
        for (String s : nums) {
            set.add(s);
        }
        
        int limit = 1 << n; 
        
        for (int i = 0; i < limit; i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            
            if (!set.contains(binary)) {
                return binary;
            }
        }
        
        return "";
    }
}
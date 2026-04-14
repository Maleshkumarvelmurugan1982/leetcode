import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int x : arr) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }
        
        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : countMap.values()) {
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }
        
        return true;
    }
}

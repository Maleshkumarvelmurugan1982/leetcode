import java.util.*;

class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> allValues = new ArrayList<>();
        flattenTree(root, allValues);
        
        int maxFrequency = 0;
        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i < allValues.size(); i++) {
            int currentVal = allValues.get(i);
            int currentCount = 0;
            for (int j = 0; j < allValues.size(); j++) {
                if (allValues.get(j) == currentVal) {
                    currentCount++;
                }
            }
            if (currentCount > maxFrequency) {
                maxFrequency = currentCount;
                modes.clear();
                modes.add(currentVal);
            } else if (currentCount == maxFrequency && !modes.contains(currentVal)) {
                modes.add(currentVal);
            }
        }
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }
    private void flattenTree(TreeNode node, List<Integer> list) {
        if (node == null) return;
        flattenTree(node.left, list);
        list.add(node.val);
        flattenTree(node.right, list);
    }
}

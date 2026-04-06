import java.util.*;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        int height = getHeight(root);
        
        for (int i = 0; i < height; i++) {
            List<Long> levelNodes = new ArrayList<>();
            collectNodes(root, i, 0, levelNodes);
            
            double sum = 0;
            for (long val : levelNodes) {
                sum += val;
            }
            result.add(sum / levelNodes.size());
        }
        
        return result;
    }

    private void collectNodes(TreeNode node, int target, int current, List<Long> nodes) {
        if (node == null) return;
        if (target == current) {
            nodes.add((long)node.val);
            return;
        }
        collectNodes(node.left, target, current + 1, nodes);
        collectNodes(node.right, target, current + 1, nodes);
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}

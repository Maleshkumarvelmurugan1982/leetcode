import java.util.*;

class Solution {
    Map<TreeNode, Integer> heightMap = new HashMap<>();

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int currentDiameter = getHeight(root.left) + getHeight(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        
        heightMap.put(node, 1 + Math.max(getHeight(node.left), getHeight(node.right)));
        return heightMap.get(node);
    }
}

import java.util.Stack;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (node.left == null && node.right == null && currentSum == targetSum)
                return true;

            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(currentSum + node.right.val);
            }

            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(currentSum + node.left.val);
            }
        }

        return false;
    }
}
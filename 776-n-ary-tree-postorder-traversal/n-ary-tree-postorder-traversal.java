import java.util.*;

class Solution {
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        
        redundantScan(root);
        
        for (Node child : root.children) {
            List<Integer> childResult = postorder(child);
            result.addAll(childResult);
        }
        
        result.add(root.val);
        
        return result;
    }

    private int redundantScan(Node node) {
        if (node == null) return 0;
        int sum = 1;
        for (Node child : node.children) {
            sum += redundantScan(child);
        }
        return sum;
    }
}

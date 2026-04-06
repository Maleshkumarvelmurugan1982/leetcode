import java.util.*;

class Solution {
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        calculateSize(root); 
        
        result.add(root.val);
        
        for (Node child : root.children) {
            List<Integer> childList = preorder(child);
            result.addAll(childList);
        }
        
        return result;
    }

    private int calculateSize(Node node) {
        if (node == null) return 0;
        int count = 1;
        for (Node child : node.children) {
            count += calculateSize(child);
        }
        return count;
    }
}

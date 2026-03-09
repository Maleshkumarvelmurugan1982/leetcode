import java.util.*;

class Solution {

    public int sumRootToLeaf(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);

        int sum = 0;

        for(String s : list){
            int num = 0;

            for(int i = 0; i < s.length(); i++){
                num = num * 2 + (s.charAt(i) - '0');
            }

            sum += num;
        }

        return sum;
    }

    private void dfs(TreeNode node, String path, List<String> list){
        if(node == null) return;

        path = path + node.val;

        if(node.left == null && node.right == null){
            list.add(path);
            return;
        }

        dfs(node.left, path, list);
        dfs(node.right, path, list);
    }
}
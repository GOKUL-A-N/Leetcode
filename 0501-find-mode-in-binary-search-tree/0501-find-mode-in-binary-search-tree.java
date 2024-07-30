/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> counter = new HashMap<>();
        dfs(root,counter);

        int maxDepth = 0;
        for(int key: counter.keySet()){
            maxDepth = Math.max(maxDepth,counter.get(key));
        }

        List<Integer> list = new ArrayList<>();
        for(int key: counter.keySet()){
            if(counter.get(key) == maxDepth) list.add(key);
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    private void dfs(TreeNode root,Map<Integer,Integer> counter){
        if(root == null) return;
        counter.put(root.val,counter.getOrDefault(root.val,0)+1);
        dfs(root.left,counter);
        dfs(root.right,counter);
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        if(root != null) q.add(root);
        boolean reverse = false;
        while(!q.isEmpty()){
            List<Integer> list  = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0;i<size;i++){
                if(!reverse){
                    TreeNode currNode = q.pollFirst();
                    list.add(currNode.val);
                    if(currNode.left != null) q.addLast(currNode.left);
                    if(currNode.right != null) q.addLast(currNode.right);
                }else{
                    TreeNode currNode = q.pollLast();
                    list.add(currNode.val);
                    
                    if(currNode.right != null) q.addFirst(currNode.right);
                    if(currNode.left != null) q.addFirst(currNode.left);
                }
               
            }
            reverse = !reverse;
             res.add(list);
        } 
        return res;
    }
}
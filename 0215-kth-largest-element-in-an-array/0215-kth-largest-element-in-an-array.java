class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int n:nums) q.add(n);
        for(int i=0;i<nums.length-k;i++){
            q.poll();
        }
        return q.peek();
    }
}
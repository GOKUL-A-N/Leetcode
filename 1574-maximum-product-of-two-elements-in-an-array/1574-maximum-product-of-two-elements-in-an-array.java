class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(
            Collections.reverseOrder()
        );
        for(int n:nums){
            q.offer(n);
        }
        return ((q.poll()-1) * (q.poll()-1));
        
    }
}
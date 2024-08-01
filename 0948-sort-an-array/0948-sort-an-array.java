class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int n:nums) q.offer(n);
        int i=0;
        while(!q.isEmpty()) nums[i++] = q.poll();
        return nums;
    }
}
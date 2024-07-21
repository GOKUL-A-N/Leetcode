class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // int[] res = new int[nums.length];
        for(int n:nums){
            q.add(n);
        }

        for(int i=0;i<nums.length;i+=2){
            int val1 = q.poll();
            int val2 = q.poll();
            nums[i] = val2;
            nums[i+1] = val1;
        }
        return nums;
    }
}
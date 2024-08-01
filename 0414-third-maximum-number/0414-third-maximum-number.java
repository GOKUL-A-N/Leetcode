class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            if(!q.contains(n))
            q.offer(n);
        }
        if(q.size() < 3){
            return q.poll();
        }
        q.poll();
        q.poll();
        return q.poll();
    }
}
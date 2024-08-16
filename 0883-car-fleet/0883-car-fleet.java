class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) return 1;
        int[][] combine = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        } 
        Stack<Double> stack = new Stack<>();
        Arrays.sort(combine,java.util.Comparator.comparingInt(a -> a[0]));
        for(int i=combine.length-1;i>=0;i--){
            double currTime =(double)(target - combine[i][0]) / combine[i][1];
            if(!stack.isEmpty() && currTime <= stack.peek()) continue;
            else stack.push(currTime);
        }
        return stack.size();
    }
}
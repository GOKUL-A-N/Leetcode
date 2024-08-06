class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        while(n > 0){
            int three = one + two;
            one = two;
            two = three;
            n--;
        }
        return one;
    }
}
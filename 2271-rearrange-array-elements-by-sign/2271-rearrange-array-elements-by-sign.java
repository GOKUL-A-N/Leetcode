class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int i=0,j=1;
        for(int n:nums){
            if(n> 0){
                res[i] = n;
                i += 2; 
            }else{
                res[j] = n;
                j+=2;
            }
        }
        return res;
    }
}
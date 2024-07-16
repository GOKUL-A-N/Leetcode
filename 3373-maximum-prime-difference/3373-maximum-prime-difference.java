class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int l=-1,r=-1;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                l = i;
                break;
            }
        }
        if(l == -1) return 0;
        for(int i=nums.length-1;i>=0;i--){
            if(isPrime(nums[i])){
                r=i;
                break;
            }
        }
        if(r == -1) return 0;
        return Math.abs(l-r);
    }
    private boolean isPrime(int number){
         if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}
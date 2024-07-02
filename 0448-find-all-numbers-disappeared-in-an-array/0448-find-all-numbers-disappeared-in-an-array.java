class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] res = new int[nums.length];
        for(int n:nums) res[n-1] = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<res.length;i++){
            if(res[i] != 1) result.add(i+1);
        }
        return result;
    }
}
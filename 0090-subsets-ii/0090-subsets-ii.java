class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        backtrack(nums,0,list,set);
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }
    private void backtrack(int[] nums,int i,List<Integer> list,Set<List<Integer>> set){
        if(i >= nums.length){
            set.add(new ArrayList<>(list));
        }else{
            list.add(nums[i]);
            backtrack(nums,i+1,list,set);
            list.remove(list.size()-1);
            backtrack(nums,i+1,list,set);
        }
    }
}
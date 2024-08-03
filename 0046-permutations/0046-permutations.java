class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        

        if(nums.length == 1){
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
        }

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int[] rem = new int[nums.length-1];
            int idx = 0;
            for(int j=0;j<nums.length;j++){
                if(i!=j) rem[idx++] = nums[j];
            }
            List<List<Integer>> perms = permute(rem);

            for(List<Integer> perm: perms){
                perm.add(n);
                res.add(perm);
            }
        }
        return res;
    }
}
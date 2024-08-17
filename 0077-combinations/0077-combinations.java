class Solution {
    List<List<Integer>> res = new ArrayList<>(); 
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(n,k,list,1);
        return res;
    }
    private void dfs(int n,int k,List<Integer> list,int start){
        if(list.size() == k){
             res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){    
            list.add(i);
            dfs(n,k,list,i+1);
            list.remove((Integer) i);
        }
    }
}
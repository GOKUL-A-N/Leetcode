class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        // sliding window approach
         if(colors[colors.length-1]!=colors[0] && colors[0]!=colors[1]){
            count++;
        }
        if(colors[colors.length-1]!=colors[0] && colors[colors.length-1]!=colors[colors.length-2]){
            count++;
        }
        for(int i=1;i<colors.length-1;i++){
            if(colors[i-1] == colors[i+1] && colors[i] != colors[i-1]) count++;
        }
        return count;
    }
}
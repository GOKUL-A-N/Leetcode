class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            maxArea = Math.max(maxArea,h * (r-l));
            if(height[l] > height[r]) r--;
            else l++;
        }
        return maxArea;
    }
}
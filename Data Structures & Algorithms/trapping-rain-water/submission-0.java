class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int prefixMax=0;
        int suffixMax=0;
        int trap=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=prefixMax){
                    prefixMax=height[left];
                }else{
                    trap+=prefixMax-height[left];
                }left++;
            }else{
                if(height[right]>=suffixMax){
                    suffixMax=height[right];
                }else{
                    trap+=suffixMax-height[right];
                }right--;
            }
        }
        return trap;
    }
}

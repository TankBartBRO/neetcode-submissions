class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        int suffix[]=new int[n];
        suffix[n-1]=1;
        for(int j=n-2;j>=0;j--){
            suffix[j]=nums[j+1]*suffix[j+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prefix[i]*suffix[i];
        }
        return ans;
    }
}  

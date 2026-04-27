class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int res[]=new int[n-k+1];
        int idx=0;
        int r=0;
        while(r<n){
            while(!dq.isEmpty() && dq.peekFirst()<=r-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
                dq.pollLast();
            }
            dq.offerLast(r);
            if(r>=k-1){
                res[idx]=nums[dq.peekFirst()];
                idx++;
            }
            r++;
            }

        return res;
    }
}


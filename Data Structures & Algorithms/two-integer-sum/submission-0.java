class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        int i=0;
        while(i<nums.length){
            int complement=target-nums[i];
                if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
            i++;
        }
      return new int[]{};
    }
}


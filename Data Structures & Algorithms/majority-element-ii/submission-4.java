class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int cand2=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(count1>0 && num==cand1){
                count1++;
            }else if(count2>0 && num==cand2){
                count2++;
            }else if(count1==0){
                cand1=num;
                count1=1;
            }else if(count2==0){
                cand2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(num==cand1){
                cnt1++;
            }if(num==cand2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3){
            list.add(cand1);
        }
        if(cnt2>nums.length/3){
            list.add(cand2);
        }
        return list;
    }
}
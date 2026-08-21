class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(maxPrice>prices[i]){
                maxPrice=prices[i];
            }
            int profit=prices[i]-maxPrice;
            if(maxProfit<profit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}

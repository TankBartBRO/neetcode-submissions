class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        // dp[i][0] = max profit on day i when we can buy
        // dp[i][1] = max profit on day i when we can sell
        int[][] dp = new int[n + 1][2];

        for (int i = n - 1; i >= 0; i--) {

            // BUY: buy today OR skip today
            dp[i][0] = Math.max(
                -prices[i] + dp[i + 1][1],
                dp[i + 1][0]
            );

            // SELL: sell today OR skip today
            dp[i][1] = Math.max(
                prices[i] + dp[i + 1][0],
                dp[i + 1][1]
            );
        }

        return dp[0][0];
    }
}
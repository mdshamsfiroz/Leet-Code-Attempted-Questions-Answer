class Solution {
    public int maxProfit(int[] prices) {
        int buy =-prices[0], sell =0;
        
        for(int i=1; i<prices.length;i++){
            int newBuy =Math.max(buy,sell -prices[i]);
            int newSell=Math.max(sell,buy + prices[i]);
            buy =newBuy; sell=newSell;
        }
        
        return sell;
    }
}
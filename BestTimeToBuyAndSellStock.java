//leetcode 121
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            res=Math.max(prices[i]-min,res);
        }
        return res;
    }
}
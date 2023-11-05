class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int mp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(mp<prices[i]-buy){
                mp=prices[i]-buy;
            }
        }
        return mp;
    }
}
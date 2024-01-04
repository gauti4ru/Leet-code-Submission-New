
class BuyStock {
    public int maxProfit(int[] prices) {
        int profit=0;
        int lbp=prices[0];//lbp=lowst Buying price
        int hsp=0;//hsp=highest selling price
        for(int i=1;i<prices.length;i++){
           if(lbp>prices[i]) {
               lbp=prices[i];
           }
            else{
                hsp=prices[i];
                profit=hsp-lbp>profit?(hsp-lbp):profit;
            }
        }
        return profit;
    }
}
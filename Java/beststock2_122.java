class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int min=prices[0];
        int n= prices.length;
        int i=0;
        if(n==1){
            return 0;
        }
        for(i=0;i<n-1;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]>prices[i+1]){
                sum=sum+prices[i]-min;
                min=prices[i];
            }
        }
        if(prices[i]>=prices[i-1]){
            sum=sum+prices[i]-min;
        }
        return sum;
    }
}
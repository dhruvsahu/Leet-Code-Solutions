public class Solution {
    public int arrangeCoins(int n) {
        long i=1;
        long sum=0;
        while(sum<=n){
            sum+=i;
            i++;
        }
        return (int)i-2;
    }
}class arrcoin_441 {
    
}

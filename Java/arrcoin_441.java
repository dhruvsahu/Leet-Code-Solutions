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
}class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int count = 0 ;
        if(n==1)
        {
            return 1;
        }
        while(i<=n)
        {
            n = n-i;
            count++;
            i++;
        }
        return count;
        
    }
}
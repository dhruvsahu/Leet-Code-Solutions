class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=1){
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            n=sum;
            sum=0;
            if(n/10==0 && n!=1 && n!=7){
                return false;
            }
        }
        return true;
    }
}
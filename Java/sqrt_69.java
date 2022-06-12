class Solution {
    public int mySqrt(int x) {
        long l=0;
        long z=(long)x;
        long r=z+1;
            
        while(l<r){
            long m =l+(r-l)/2;
            
            if(m*m>z) r=m;
            else l=m+1;
        }
        return (int)(l-1);
    }
}
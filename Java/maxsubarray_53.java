class Solution {
    public int maxSubArray(int[] a) {
        int maxsum=a[0];
        int currsum=0;
        for(int i=0;i<a.length;i++){
            currsum+=a[i];
            if(currsum>maxsum){
                maxsum = currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}
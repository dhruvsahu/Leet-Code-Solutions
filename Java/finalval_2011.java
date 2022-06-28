class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(String s: operations){
            if(s.indexOf('+')<0){
                sum-=1;
            }else{
                sum+=1;
            }
        }
        return sum;
    }
}
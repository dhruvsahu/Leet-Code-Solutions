class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int max=0;
        int count=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }else{
                max = max<=count?count:max;
                count=0;
            }
            i++;
        }
        return count>=max?count:max;
    }
}
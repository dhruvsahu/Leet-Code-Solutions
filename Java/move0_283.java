class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        int len = nums.length;
        while(i<len){
            if(nums[i]!=0 && nums[j]==0 ){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
            if(nums[j]!=0) j++;
            i++;
        }
    }
}
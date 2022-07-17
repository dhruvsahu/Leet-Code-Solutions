class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int i=len-1;
        int pointer=0;
        while(i>0){
            if(nums[i-1]!=nums[i]){
                pointer+=1;
            }
            if(pointer==2){
                return nums[i-1];
            }
            i--;
        }
        return nums[len-1];
    }
}
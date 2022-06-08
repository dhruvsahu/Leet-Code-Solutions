class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low=0;
        int mid=0;
        int high =len-1;
        while(low<=high ){
            mid = (low+high)/2;
            if( nums[mid] == target){
                return mid;
            }else if( nums[mid]> target){
                high=mid-1;
                
            }else if( nums[mid]< target){
                low =mid+1;
            }
        }
        if(target > nums[mid]){
            return mid+1;
        }
        return mid;
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j:nums2){
                nums1[m++]=j;
            }
        Arrays.sort(nums1);
    }
}
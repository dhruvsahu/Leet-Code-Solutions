class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int len =nums.length;
        for(int i=0;i<len-1;i++){
            int j=i+1;
            while(nums[j]==nums[i] && j!=len-1 ){
               j++;
            }
            for(int x=i+1;x<j;x++){
                nums[x]=nums[j];
            }
        }
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        return set.size();
    }
}
// int k=1;
	   
//        for(int i=0;i<num.length-1;i++) {
//     	   if(num[i]!=num[i+1]) {
//     		  num[k++]=num[i+1];
//     	   }
   
//        }
//        return k;
       
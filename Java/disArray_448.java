class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        while(i<nums.length){
            
            set.add(nums[i]);
            i++;
        }
        i=1;
        while(i<=nums.length){
            if(!set.contains(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}
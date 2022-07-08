class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        char c;
        int len = s.length();
        while(i<len){
            c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            i++;
        }
        int sum=0;
        int odd=0;
        for(Map.Entry m : map.entrySet()){
            if((int)m.getValue()%2==0){
                sum+=(int)m.getValue();
            }else{
                sum+=(int)m.getValue()-1;
                odd=1;
            }
        }
        return odd==1?sum+1:sum;
    }
}
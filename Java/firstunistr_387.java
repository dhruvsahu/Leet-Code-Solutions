class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int len=s.length();
        while(i<len){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            i++;
        }
        int min=len;
        for(char c: s.toCharArray()){
            if(map.get(c)==1){
                if(s.indexOf(c)<min){
                    min=s.indexOf(c);
                }
            }
        }
        return min==len?-1:min;
    }
}
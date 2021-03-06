class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}
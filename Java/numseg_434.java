class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.equals("")){
            return 0;
        }
        int len=s.length();
        int i=1;
        int count=1;
        while(i<len){
            if(s.charAt(i)==' '&& s.charAt(i-1)!=' '){
                count++;
            }
            i++;
        }
        return count;
    }
}
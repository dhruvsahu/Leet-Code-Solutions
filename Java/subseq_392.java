class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int len=s.length();
        int len1=t.length();
        while(i<len1 && j<len){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }
        return j==len;
    }
}
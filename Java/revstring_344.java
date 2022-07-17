class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int len=s.length;
        while(i<len/2){
            char c=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=c;
            i++;
        }
    }
}
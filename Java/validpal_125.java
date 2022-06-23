class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str = "";
        String rev= "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str=str+s.charAt(i);
                rev=s.charAt(i)+rev;
            }
        }
        if( str.equals(rev)){
            return true;
        }
        return false;
    }
}
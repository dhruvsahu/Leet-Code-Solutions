class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int sum=0;
        int len=s.length();
        int lastindex=-1;
        while(i<len){
            int j=i;
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j) && lastindex<j){
                    sum+=1;
                    lastindex=j;
                    break;
                }
                j++;
            }
            i++;
        }
        return sum==len;
    }
}
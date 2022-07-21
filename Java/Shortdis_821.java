class Solution {
    public int[] shortestToChar(String s, char c) {
        int i = s.indexOf(c);
        int j = 0;
        int k = Integer.MAX_VALUE;
        int[] arr =new int[s.length()];
        while(j<s.length()){
            if(j==i && j+1<s.length()){
                arr[j]=0;
                k=i;
                i=s.indexOf(c,j+1);
            }
            if(Math.abs(j-i)<Math.abs(j-k)){
                arr[j]=Math.abs(j-i);
            }else{
                arr[j]=Math.abs(j-k);
            }
            j++;
        }
        return arr;
    }
}
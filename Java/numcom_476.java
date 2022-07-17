class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int i =0;
        String str="";
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                str=str+"0";
            }else{
                str=str+"1";
            }
            i++;
        }
        return Integer.parseInt(str,2);
    }
}
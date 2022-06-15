class Solution {
    public int reverse(int x) {
        boolean t=false; 
        if(x<0) {
            t= true;
        }
        String str = Integer.toString(x);
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        if(t){
            s="-"+s;
            s = s.substring(0,s.length()-1);
        }
        long y = Long.parseLong(s);
        if( y>Integer.MAX_VALUE || y<Integer.MIN_VALUE )
        {
            return 0;
        }
        return (int)y;
    }
}
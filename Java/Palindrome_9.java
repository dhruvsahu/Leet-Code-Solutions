class Solution {
    public boolean isPalindrome(int x) {
        int dum = Math.abs(x);
        int len=0;
        while(dum!=0){
            len+=1;
            dum=dum/10;
        }
        if( len == 1 && x<0){
            return false;
        }
        int arr[] = new int[len];
        dum = x;
        int i =0;
        while (dum!=0){
            arr[i]=dum%10;
            dum = dum/10;
            i++;
        }
        if(x<0){
            arr[0]= -arr[0];
        }
        int arr2[] = new int[len];
        for(i=0;i<len;i++){
            arr2[i] = arr[len-1-i];
        }
        if (x<0){
            arr2[len-1]= -arr2[len-1];
        }
        for(i=0;i<len-1;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
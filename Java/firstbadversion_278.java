/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            return (int)search(1,n);
        }
        public long search(long start,long end){
            long mid=(start+end)/2;
            long find=0;
            if( (isBadVersion((int)mid)&&!isBadVersion((int)mid-1)) ){
                return mid;
            }else{
                if( !isBadVersion((int)mid)&&!isBadVersion((int)mid-1) ){
                    find=search(mid+1,end);
                }else{
                    find=search(start,mid-1);
                }
                return find;
            }
        }
    }
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long lo=1;
        long hi=(long)n;
        while(lo<hi){
            long sum=(lo+hi);
            int mid=(int)(sum/2);
            //System.out.println(mid);
            if(isBadVersion(mid)){
                hi=(long)mid;
            }else{
                lo=(long)mid+1;
            }
        }
        return (int)lo;
    }
}

//Link to Challenge: https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/
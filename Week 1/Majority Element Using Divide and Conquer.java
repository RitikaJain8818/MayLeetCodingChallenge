class Solution {
    public int majorityElement(int[] nums) {
        return majorityElementRec(nums,0,nums.length-1);
    }
    private int majorityElementRec(int[] nums,int lo,int hi){
        if(lo==hi)
            return nums[lo];
        int mid=(lo+hi)/2;
        int lans=majorityElementRec(nums,lo,mid);
        int rans=majorityElementRec(nums,mid+1,hi);
        if(lans==rans)
            return lans;
        if(count(nums,lans,lo,hi)>count(nums,rans,lo,hi))
            return lans;
        return rans;
    }
    private int count(int[] nums,int ele,int lo,int hi){
        int count=0;
        for(int i=lo;i<=hi;i++){
            if(nums[i]==ele)
                count++;
        }
        return count;
    }
}
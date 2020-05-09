class Solution {
    public int majorityElement(int[] nums) {
        int ce=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(ce==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ce=nums[i];
                count++;
            }
        }
        return ce;
    }
}
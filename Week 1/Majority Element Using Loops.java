class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==ele){
                    count++;
                }
            }
            if(count>nums.length/2)
                return ele;
        }
        return -1;
    }
}
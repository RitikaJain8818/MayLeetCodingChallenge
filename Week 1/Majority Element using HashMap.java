class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int n=nums.length/2;
        for(Map.Entry entry:map.entrySet()){
            if((int)entry.getValue()>n)
                return (int)entry.getKey();
        }
        return -1;
    }
}
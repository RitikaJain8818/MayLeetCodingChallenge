class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int[] map1=new int[26];
        for(int i=0;i<s1.length();i++){
            map1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            int[] map2=new int[26];
            for(int j=0;j<s1.length();j++){
                map2[s2.charAt(i+j)-'a']++;
            }
            if(isEqual(map1,map2)){
                return true;
            }
        }
        return false;
    }
    public boolean isEqual(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    } 
}
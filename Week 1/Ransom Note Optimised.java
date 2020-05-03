public class Ransom Note Optimised {
    
}class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[128];
        for(int i=0;i<magazine.length();i++){
            count[magazine.codePointAt(i)]+=1;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(count[ransomNote.codePointAt(i)]>0){
                count[ransomNote.codePointAt(i)]-=1;
            }else{
                return false;
            }
        }
        return true;
    }
}
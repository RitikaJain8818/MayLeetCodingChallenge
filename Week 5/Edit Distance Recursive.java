class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length()==0)
            return word2.length();
        if(word2.length()==0)
            return word1.length();
        String ros1=word1.substring(1);
        String ros2=word2.substring(1);
        if(word1.charAt(0)==word2.charAt(0)){
            return minDistance(ros1,ros2);
        }else{
            return 1+Math.min(minDistance(ros1,ros2),Math.min(minDistance(ros1,word2),minDistance(word1,ros2)));
                                //Replace                           //Add                       //Remove
        }
    }
}
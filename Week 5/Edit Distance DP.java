class Solution {
    public int minDistance(String word1, String word2) {
        int[][] strg=new int[word1.length()+1][word2.length()+1];
        strg[word1.length()][word2.length()]=0;
        for(int i=word1.length();i>=0;i--){
            for(int j=word2.length();j>=0;j--){
                if(i==word1.length()){
                    strg[i][j]=word2.length()-j;
                    continue;
                }
                if(j==word2.length()){
                    strg[i][j]=word1.length()-i;
                    continue;
                }
                if(word1.charAt(i)==word2.charAt(j)){
                    strg[i][j]=strg[i+1][j+1];
                }else{
                    strg[i][j]=1+Math.min(strg[i+1][j+1],Math.min(strg[i+1][j],strg[i][j+1]));
                }
            }
        }
        return strg[0][0];
    }
}